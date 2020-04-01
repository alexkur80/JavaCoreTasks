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

        boolean flag;
        File file = new File(File.separator + filePath);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error creating file " + file.getName());
            }
        }

        if (file.exists() && file.isFile()) {
            flag = true;
        } else {
            flag = false;
        }
        ApplicationLogger.LOGGER.info("Is file " + file.getName() + " exist? " + flag);

        return flag;
    }



}


