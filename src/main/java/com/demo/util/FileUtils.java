package com.demo.util;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FileUtils {
    public static List<File> listFileSortByModifyTime(String path) {
        List<File> fileList = getFiles(path, new ArrayList<File>());
        if (fileList != null && fileList.size() > 0) {
            Collections.sort(fileList, new Comparator<File>() {
                public int compare(File file, File newFile) {
                    if (file.lastModified() < newFile.lastModified()) {
                        return -1;
                    } else if (file.lastModified() == newFile.lastModified()) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
        }
        return fileList;

    }
    /**
     * 获取目录下的所有文件
     *
     * @param realPath 文件夹目录
     * @param files
     * @return
     */
    public static List<File> getFiles(String realPath, List<File> files) {
        File realFile = new File(realPath);
        if (!realFile.exists()) {
            return files;
        }
        if (realFile.isDirectory()) {

            File[] subFils = realFile.listFiles();

            for (File file : subFils) {
                if (file.isDirectory()) {
                    getFiles(file.getAbsolutePath(), files);
                } else {
                    files.add(file);
                }
            }
        }
        return files;

    }
}
