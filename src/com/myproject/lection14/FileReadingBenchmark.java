package com.myproject.lection14;

import org.apache.log4j.Logger;

import java.io.*;

/**
 * Compares time IO file using BufferedReader/BufferedWriter and FileReader/FileWriter
 */
public class FileReadingBenchmark {
    public final static Logger LOGGER = Logger.getLogger(FileReadingBenchmark.class);

    /**
     * Reads and write  file using BufferedReader
     *
     * @param filePath file to read BufferedReader/BufferedWriter
     * @return time reading file in ns
     */
    public static long bufferedReaderBenchmark(String filePath) {

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        File fileRead = new File(File.separator + filePath);
        File fileWrite = new File(File.separator + filePath + ".copy");

        long startTime = System.nanoTime();

        if (isExistIsFile) {
            try (BufferedReader fileIn = new BufferedReader(new FileReader(fileRead));
                 BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileWrite))
            ) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    fileOut.write(line + " \n");
                }
            } catch (IOException ioe) {
                LOGGER.error("Error opening, reading or writing file " + ioe);
            }
        }

        long stopTime = System.nanoTime();
        return stopTime - startTime;
    }

    /**
     * Reads file using FileReader
     *
     * @param filePath file to use FileReader/FileWriter
     * @return time reading file in ns
     */
    public static long fileReaderBenchmark(String filePath) {
        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

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
            } catch (IOException ioe) {
                LOGGER.error("Error opening and reading file " + ioe + " " + fileRead.getName() + " OR " + fileWrite.getName());
            }
        }

        long stopTime = System.nanoTime();
        return stopTime - startTime;
    }
}