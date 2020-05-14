package com.myproject.lection16;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class FileUtils {
    public final static Logger LOGGER = Logger.getLogger(FileUtils.class);

    /**
     * Verificates is file exist and is file is really file.
     * It should be performed before giving file for future manipulation.
     *
     * @return flag true if file is exist and this is file, false otherwise.
     */
    public static boolean isFileExistIsFile(String filePath) {
        File file = new File(File.separator + filePath);

        try {
            if (!file.exists()) {
                file.createNewFile();
                LOGGER.info(file + " exists");
            }
        } catch (IOException ioe) {
            LOGGER.warn("Error creating file " + ioe + file.getName());
        }

        boolean flag;
        flag = (file.exists() && file.isFile());

        LOGGER.info("Is file " + file.getName() + " exist? " + flag);
        return flag;
    }
}