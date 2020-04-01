package com.myproject.lection16;

import com.myproject.lection15.FileUtilsCopy01;
import com.myproject.utils.ApplicationLogger;

import java.io.*;

public class FileReadingBenchmark {

    public static long bufferedReaderBenchmark(String filePath) {

        boolean isExistIsFile = FileUtilsCopy01.isFileExistIsFile(filePath);


        File fileRead = new File(File.separator + filePath);
        File fileWrite = new File(File.separator + filePath + ".copy");

        long startTime = System.nanoTime();

        if (isExistIsFile) {

            try (BufferedReader fileIn = new BufferedReader(new FileReader(fileRead));
                 BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileWrite))
            ) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    fileOut.write(line + "\n");

                }
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening, reading or writing file ");
                e.printStackTrace();
            }

        }

        long stopTime = System.nanoTime();
        return stopTime - startTime;
    }


    public static long fileReaderBenchmark(String filePath) {

        boolean isExistIsFile = FileUtilsCopy01.isFileExistIsFile(filePath);

        long startTime = System.nanoTime();

        if (isExistIsFile) {

            File fileRead = new File(File.separator + filePath);
            File fileWrite = new File(File.separator + filePath + ".copy2");

            try (FileReader fileIn = new FileReader(fileRead);
                 FileWriter fileOut = new FileWriter(fileWrite)) {

                int tmpChar;
                while ((tmpChar = fileIn.read()) != -1) {
                    fileOut.write(tmpChar);
                }
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening and reading file " + fileRead.getName() + " OR " + fileWrite.getName());
                e.printStackTrace();
            }

        }
        long stopTime = System.nanoTime();

        return stopTime - startTime;

    }


}
