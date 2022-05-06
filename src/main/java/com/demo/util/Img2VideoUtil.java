package com.demo.util;

import org.bytedeco.ffmpeg.global.avcodec;
import org.bytedeco.ffmpeg.global.avutil;
import org.bytedeco.javacv.*;
import org.bytedeco.opencv.global.opencv_core;
import org.bytedeco.opencv.opencv_core.IplImage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.bytedeco.opencv.helper.opencv_imgcodecs.cvLoadImage;

public class Img2VideoUtil {
    public static void main(String[] args) {
        //合成的MP4 存放的地址路径 这里的路径并不会自动创建,需要手动提前创建好,否则会报错:Could not open 'null'
        String mp4SavePath="C:\\Users\\lenovo\\Pictures\\ctimg\\video\\aa.mp4";
        //图片存放的地址路径
        String imageDir="C:\\Users\\lenovo\\Pictures\\ctimg";
        //jpgToMp4( mp4SavePath,  imageDir, 1);
       /* try {
            dojob(imageDir, null, mp4SavePath);
        }catch (Exception e){
            e.printStackTrace();
        }*/
        int width = 1600;
        int height = 900;
        //读取所有图片
        File file = new File(imageDir);
        File[] files = file.listFiles();
        Map<Integer, File> imgMap = new HashMap<Integer, File>();
        int num = 0;
        for (File imgFile : files) {
            imgMap.put(num, imgFile);
            num++;
        }
        try {
            createMp4(mp4SavePath, imgMap, width, height);
        }catch (FrameRecorder.Exception e){
            e.printStackTrace();
        }
    }

    private static void createMp4(String mp4SavePath, Map<Integer, File> imgMap, int width, int height) throws FrameRecorder.Exception {
        //视频宽高最好是按照常见的视频的宽高  16：9  或者 9：16
        FFmpegFrameRecorder recorder = new FFmpegFrameRecorder(mp4SavePath, width, height);
        //设置视频编码层模式     import org.bytedeco.ffmpeg.global.avcodec;可能需要手动复制添加
        recorder.setVideoCodec(avcodec.AV_CODEC_ID_H264);
        //设置视频为25帧每秒
        recorder.setFrameRate(25);
        //设置视频图像数据格式    import org.bytedeco.ffmpeg.global.avutil;可能需要手动复制添加
        recorder.setPixelFormat(avutil.AV_PIX_FMT_YUV420P);

        recorder.setFormat("mp4");
        try {
            recorder.start();
            Java2DFrameConverter converter = new Java2DFrameConverter();
            //录制一个22秒的视频,22秒为自定义的一个视频时间长度,图片少则在22秒内,多则到22秒停止
            for (int i = 0; i < 22; i++) {
                BufferedImage read = ImageIO.read(imgMap.get(i));
                //一秒是25帧 所以要记录25次
                for (int j = 0; j < 25; j++) {
                    recorder.record(converter.getFrame(read));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //最后一定要结束并释放资源
            recorder.stop();
            recorder.release();
        }
    }


    public static void dojob(String picturesPath, String audioPath, String videoPath) throws Exception {
       /* FrameGrabber audioFrames = new FFmpegFrameGrabber(audioPath);
        audioFrames.start();*/

        int frameRate = 2;
       // FFmpegFrameRecorder recorder = new FFmpegFrameRecorder(videoPath, 640, 480, audioFrames.getAudioChannels());
        FFmpegFrameRecorder recorder = new FFmpegFrameRecorder(videoPath, 640, 480);
        recorder.setVideoCodec(avcodec.AV_CODEC_ID_H264);
        recorder.setFormat("mp4");
        recorder.setFrameRate(frameRate);
        recorder.setPixelFormat(0);
        recorder.start();

        OpenCVFrameConverter.ToIplImage conveter = new OpenCVFrameConverter.ToIplImage();

        File file = new File(picturesPath);
        File[] flist = file.listFiles();
        IplImage[] images = new IplImage[flist.length];

        //PhotoProcess photoProcess = new PhotoProcess();
        int width = 640;

        for (int i = 0; i < flist.length; i++) {
            String fname = picturesPath + "/" + (i + 1) + ".jpg";
            // 调整图片的大小，未贴出源码，可以删除跳过
           // BufferedImage image = photoProcess.scalePhotoFromFile(fname, width);
            images[i] = cvLoadImage(fname);
        }

       /* Frame frameAudio;
        for (int j = 0; j < 80; ++j) {
            frameAudio = audioFrames.grabFrame();
        }
*/
        for (int i = 0; i < flist.length; ++i) {
            for (int j = 0; j < frameRate * 2; ++j) {
               /* for (int k = 0; k < 80 / (frameRate * 2); ++k) {
                    frameAudio = audioFrames.grabFrame();
                    recorder.record(frameAudio);
                }*/
                recorder.record(conveter.convert(images[i]));
            }
        }

       // audioFrames.stop();
        recorder.stop();
        recorder.release();
    }
    /**
     * 图片合成视频
     * @param mp4SavePath 视频保存路径
     * @param imageDir 图片地址
     * @param rate 这个可以理解成视频每秒播放图片的数量
     */
    public static boolean jpgToMp4(String mp4SavePath, String imageDir, double rate) {
        FFmpegFrameRecorder recorder = null;
        boolean flag = true;
        try {
            //File[] files = FileUtils.fileSort(imageDir);
            List<File> files = FileUtils.listFileSortByModifyTime(imageDir);
            int [] widthArray = new int[files.size()];
            int [] heightArray = new int[files.size()];
/**
 * 获取合成视频图片的最大宽高,避免图片比例不一致最终合成效果差
 */
            for (int i = 0; i < files.size(); i++) {
                BufferedImage bufferedImage = ImageIO.read(files.get(i));
                widthArray[i] = bufferedImage.getWidth();
                heightArray[i] = bufferedImage.getHeight();
            }
/**
 * 这个方法主要是防止图片比例达不到视频合成比例的要求,如果达不到下面条件视频则会无法播放
 * 图片宽：必须要被32整除
 * 图片高：必须要被2整除
 */
            int [] maxWH = getImgMaxWH(widthArray,heightArray);
            recorder = new FFmpegFrameRecorder(mp4SavePath,maxWH[0],maxWH[1]);
            recorder.setVideoCodec(avcodec.AV_CODEC_ID_H264);
/**
 * 视频质量：目前测试出来的是25-30最清晰,视频质量范围好像是0-40,具体可以自己慢慢测
 */
            recorder.setVideoQuality(25);
            recorder.setFormat("mp4");
            recorder.setFrameRate(rate > 0 ? rate : 1);
            recorder.setPixelFormat(0);
            recorder.start();
            OpenCVFrameConverter.ToIplImage conveter = new OpenCVFrameConverter.ToIplImage();
/**
 * 合成视频
 */
            for(int i = 0; i < files.size(); i++ ){
                IplImage image = cvLoadImage(files.get(i).getPath());
                recorder.record(conveter.convert(image));
                opencv_core.cvReleaseImage(image);
            }
            System.out.println("合成成功");
        } catch(Exception e) {
            e.printStackTrace();
            flag = false;
            System.out.println("合成失败");
        } finally {
            try {
                if (recorder != null){
                    recorder.stop();
                    recorder.release();
                }
            } catch (FrameRecorder.Exception e) {
                e.printStackTrace();
            }
        }
        return flag;
    }
    private static  int [] getImgMaxWH(int [] widthArray,int [] heightArray){
        int maxW=0;
        int maxH=0;
        for(int i=0;i<widthArray.length;i++){
            if(widthArray[i]>maxW){
                maxW=widthArray[i];
            }
        }
        for(int i=0;i<heightArray.length;i++){
            if(heightArray[i]>maxH){
                maxH=heightArray[i];
            }
        }
        return new int[]{maxW,maxH};
    }
}
