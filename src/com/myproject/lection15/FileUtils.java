package com.myproject.lection15;

import org.apache.log4j.Logger;

import java.io.File;

public class FileUtils {
    public final static Logger LOGGER = Logger.getLogger(FileUtils.class);

    /**
     * Verificates is file exist and if file is really file.
     * It should be performed before working with file in future.
     *
     * @param filePath path of file
     * @return flag true if file is exist and this is file, false otherwise.
     */
    public static boolean isFileExistIsFile(String filePath) {
        File file = new File(File.separator + filePath);

        if (file.exists() && file.isFile()) {
            LOGGER.info(file.getName() + " exist");
            return true;
        } else {
            return false;
        }
    }

    /**
     * Verificates is dir exist and if dir is really directory
     * It should be performed before working with directory in future.
     *
     * @param filePath path of directory
     * @return true if is exist and is directory
     */
    public static boolean isDirectoryIsExist(String filePath) {
        File dir = new File(filePath);

        if (dir.exists() && dir.isDirectory()) {
            LOGGER.info(dir.getName() + " exist");
            return true;
        } else {

            return false;
        }
    }

    /**
     * Outputs all files in every directories from requested dir name
     *
     * @param filePath path of directory
     */
    public static void dirFileListRecursive(String filePath) {

        File dir = new File(filePath);
        String[] dirList = dir.list();

        assert dirList != null;
        for (String file : dirList) {
            File fileOrDirectory = new File(filePath + File.separator + file);

            if (fileOrDirectory.isFile())
                LOGGER.info(filePath + File.separator + file);
            else {
                dirFileListRecursive(filePath + File.separator + file);
            }
        }
    }
}