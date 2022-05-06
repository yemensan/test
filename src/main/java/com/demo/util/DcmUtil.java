package com.demo.util;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class DcmUtil {
    //将dcm文件转为图片
    public static boolean dcm2Img(String dicomFilePath,String imgFilePath){
        try {
            File dicomFile = new File(dicomFilePath);
            File imgFile = new File(imgFilePath);
            org.dcm4che3.tool.dcm2jpg.Dcm2Jpg dcm2Jpg = new org.dcm4che3.tool.dcm2jpg.Dcm2Jpg();
            BufferedImage image = dcm2Jpg.readImageFromDicomInputStream(dicomFile);
            ImageIO.write(image, "JPEG", imgFile);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        String dicomFilePath="D:\\dcmImg\\source\\压缩\\test5.dcm";
        String imgFilePath="D:\\dcmImg\\source\\压缩\\test5.png";
        dcm2Img( dicomFilePath, imgFilePath);
    }
}
