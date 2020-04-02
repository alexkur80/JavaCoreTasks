/**
 * This class include labs for comparing  BufferedReaderB and FileReader
 * It also serialize and deserialize class objects
 *
 * @author Kurlovich Alexander
 * @version Lection16  IO partII, Serialization
 * @date 03/31/2020
 */

package com.myproject.lection16;

import com.myproject.utils.ApplicationLogger;

public class InputOutputPart02Main {

    public static void main(String[] args) {

        String file = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\file5mb.mp3";
        String fileSerialization01 = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\serializationComputer.ser";
        String fileSerialization02 = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\serializationNotebook.ser";

        // Benchmark reading file 5Mb using BufferedReader
        long timeBufferedReader = FileReadingBenchmark.bufferedReaderBenchmark(file);
        ApplicationLogger.LOGGER.info(timeBufferedReader / 1000000 + " ms");

        // Benchmark reading file 5Mb using FileReader
        long timeFileReader = FileReadingBenchmark.fileReaderBenchmark(file);
        ApplicationLogger.LOGGER.info(timeFileReader / 1000000 + " ms");

        // Serialize  and deserialize object Computer
        Computer computer01 = new Computer("ZX Spectrum 48", 48, 999.99);
        SerializationUtils.serialization(computer01, fileSerialization01);

        Computer computer02 = (Computer) SerializationUtils.deserialization(fileSerialization01);
        ApplicationLogger.LOGGER.info(computer02);

        Touchpad touchpad = new Touchpad("Samsung");
        Notebook notebook = new Notebook("AsusHuanhun", 64, 599.99, touchpad);

        SerializationUtils.serialization(notebook, fileSerialization02);
        Notebook computer4 = (Notebook) SerializationUtils.deserialization(fileSerialization02);
        ApplicationLogger.LOGGER.info(computer4);

    }
}
