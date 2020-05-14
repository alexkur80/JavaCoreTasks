package com.myproject.lection14;

import org.apache.log4j.Logger;

public class InputOutputPart02Main {
    public final static Logger LOGGER = Logger.getLogger(InputOutputPart02Main.class);

    public static void main(String[] args) {
        String file = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\file5mb.mp3";
        String fileSerialization01 = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\serializationComputer.ser";
        String fileSerialization02 = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\serializationNotebook.ser";

        /* Benchmark reading file 5Mb using BufferedReader */

        long timeBufferedReader = FileReadingBenchmark.bufferedReaderBenchmark(file);
        LOGGER.info(timeBufferedReader / 1000000 + " ms");

        /* Benchmark reading file 5Mb using FileReader */

        long timeFileReader = FileReadingBenchmark.fileReaderBenchmark(file);
        LOGGER.info(timeFileReader / 1000000 + " ms");

        /* Serialize  and deserialize object Computer */

        Computer computer01 = new Computer("ZX Spectrum 48", 48, 999.99);
        SerializationDeserializationUtils.serialization(computer01, fileSerialization01);

        Computer computer02 = (Computer) SerializationDeserializationUtils.deserialization(fileSerialization01);
        LOGGER.info(computer02);

        TouchPad touchpad = new TouchPad("Samsung");
        Notebook notebook = new Notebook("AsusHuanhun", 64, 599.99, touchpad);

        SerializationDeserializationUtils.serialization(notebook, fileSerialization02);
        Notebook computer4 = (Notebook) SerializationDeserializationUtils.deserialization(fileSerialization02);
        if (computer4 == null) {
            LOGGER.error("Error serialization");
        } else {
            LOGGER.info(computer4);
        }
    }
}