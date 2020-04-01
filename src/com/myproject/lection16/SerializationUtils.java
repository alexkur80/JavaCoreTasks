package com.myproject.lection16;

import com.myproject.lection15.FileUtilsCopy01;
import com.myproject.utils.ApplicationLogger;

import java.io.*;

public class SerializationUtils {


    /**
     * This method is Utility for  serialize object
     *
     * @param computer Object which serialize
     * @param filePath file where store serialization
     */
    public static void serialization(Object computer, String filePath) {

        boolean isExistIsFile = FileUtilsCopy01.isFileExistIsFile(filePath);

        if (isExistIsFile) {
            File fileSerialization = new File(File.separator + filePath);

            try (FileOutputStream fileOutputStream = new FileOutputStream(fileSerialization);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

                objectOutputStream.writeObject(computer);

            } catch (FileNotFoundException e) {
                ApplicationLogger.LOGGER.error("Error opening for reading file " + fileSerialization.getName());
                e.printStackTrace();
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error serialization");
                e.printStackTrace();
            }
        }
    }


    /**
     * This method is Utility for  deserialize object
     *
     * @param filePath file where deserialization from
     * @return deserializated object
     */
    public static Object deserialization(String filePath) {
        boolean isExistIsFile = FileUtilsCopy01.isFileExistIsFile(filePath);

        if (isExistIsFile) {

            File fileDeserialization = new File(File.separator + filePath);

            try (FileInputStream fileInputStream = new FileInputStream(fileDeserialization);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                return objectInputStream.readObject();
            } catch (Exception e) {
                ApplicationLogger.LOGGER.info("Error serialization");
            }

        }
        return null;
    }
}



