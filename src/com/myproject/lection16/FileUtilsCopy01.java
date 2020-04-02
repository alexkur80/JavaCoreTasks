package com.myproject.lection16;//package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.io.File;
import java.io.IOException;

public class FileUtilsCopy01 {


    /**
     * This method makes verification if file exist and if file is really file.
     * It should be performed before giving file for future manipulation.
     *
     * @return flag true if file is exist and this is file, false otherwise.
     */
    public static boolean isFileExistIsFile(String filePath) {

        boolean flag;
        File file = new File(File.separator + filePath);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

        } catch (IOException e) {
            ApplicationLogger.LOGGER.warn("Error creating file " + file.getName());
            e.printStackTrace();
        }

        flag = (file.exists() && file.isFile());

        ApplicationLogger.LOGGER.info("Is file " + file.getName() + " exist? " + flag);
        return flag;
    }


}





