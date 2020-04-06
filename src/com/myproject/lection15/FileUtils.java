package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.io.File;
import java.io.IOException;

public class FileUtils {


    /**
     * This method makes verification if file exist and if file is really file.
     * It should be performed before giving file for future manipulation.
     *
     * @param filePath
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

    public static boolean isDirectoryIsExist(String filePath) {
        boolean flag = false;
        File dir = new File(filePath);

        if (dir.exists() && dir.isDirectory()) {
            flag = true;
        }
        ApplicationLogger.LOGGER.info("Directory " + dir.getName() + " exist? " + flag);

        return flag;
    }


}


