package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.io.File;

public class FileUtils {

    /**
     * This method makes verification if file exist and if file is really file.
     * It should be performed before working with file in future.
     *
     * @param filePath path of file
     * @return flag true if file is exist and this is file, false otherwise.
     */
    public static boolean isFileExistIsFile(String filePath) {
        boolean flag = false;
        File file = new File(File.separator + filePath);

        if (file.exists() && file.isFile()) {
            flag = true;
        }
        ApplicationLogger.LOGGER.info("Is file " + file.getName() + " exist? " + flag);

        return flag;
    }


    /**
     * This method makes verification if dir exist and if dir is really directory
     * It should be performed before working with directory in future.
     *
     * @param filePath path of directory
     * @return true if is exist and is directory
     */
    public static boolean isDirectoryIsExist(String filePath) {
        boolean flag = false;
        File dir = new File(filePath);

        if (dir.exists() && dir.isDirectory()) {
            flag = true;
        }
        ApplicationLogger.LOGGER.info("Directory " + dir.getName() + " exist? " + flag);

        return flag;
    }


    /**
     * This method output all files in every directories from requested dir name
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
                System.out.println(filePath + File.separator + file);
            else {
                dirFileListRecursive(filePath + File.separator + file);
            }
        }
    }
}







