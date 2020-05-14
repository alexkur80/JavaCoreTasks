package com.myproject.lection14;

import org.apache.log4j.Logger;

import java.io.*;

public class SerializationDeserializationUtils {
    public final static Logger LOGGER = Logger.getLogger(SerializationDeserializationUtils.class);

    /**
     * Serializes object
     *
     * @param computer Object which serialize
     * @param filePath file where store serialization
     */
    public static void serialization(Object computer, String filePath) {

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {
            File fileSerialization = new File(File.separator + filePath);

            try (FileOutputStream fileOutputStream = new FileOutputStream(fileSerialization);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(computer);
                LOGGER.info("Successfully serialized" + fileSerialization.getName());


            } catch (FileNotFoundException e) {
                LOGGER.error("Error opening for reading file " + fileSerialization.getName());
                e.printStackTrace();
            } catch (IOException ioe) {
                LOGGER.error("Error serialization" + ioe);
            }
        }
    }

    /**
     * Deserializates object
     *
     * @param filePath file where deserialization from
     * @return deserializated object or null if fail
     */
    public static Object deserialization(String filePath) {
        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {
            File fileDeserialization = new File(File.separator + filePath);

            try (FileInputStream fileInputStream = new FileInputStream(fileDeserialization);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                return objectInputStream.readObject();
            } catch (Exception e) {
                LOGGER.info("Error serialization" + e);
            }
        }
        return null;
    }
}