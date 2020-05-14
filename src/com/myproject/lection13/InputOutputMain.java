package com.myproject.lection13;

import org.apache.log4j.Logger;

import java.util.List;

public class InputOutputMain {
    public final static Logger LOGGER = Logger.getLogger(InputOutputMain.class);

    public static void main(String[] args) {

        /* read multiline and output text  into console by lines */

        String multiline = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\multiline.txt";
        FileTextUtils.outputLinesFromFileToConsole(multiline);

        /* read multiline and output words with first vowel letter */

        FileTextUtils.wordsFirstVowelLetter(multiline);

        /*  print in console only words, if their last letter equal next word's first letter. */

        FileTextUtils.allWordsLastLetterNextFirstLetterEqual(multiline);

        /* calculate maximum number of doubles in every line of multiline */

        FileTextUtils.doublesDigits(multiline);

        /* reading java-code from file and output in reverse in another file */

        String javaCode = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\javaCode.txt";
        FileTextUtils.doReverseFileCopy(javaCode);

        /* Write 20 int  numbers above 255 in file. Read file to console, calculate middle arithmetic */

        String binFile = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\intNumbers.bin";
        List<Integer> listInt = GenerateIntegerRandom.randomInt(256, 500, 20);
        FileTextUtils.writeIntOwnRealization(listInt, binFile);

        /*verify is dir is directory and is dir exist, then call dirListRecurcy() */

        String dir = "D:\\Coding\\2020.02.2020";
        boolean isDirExistIsDirectory = FileUtils.isDirectoryIsExist(dir);
        if (isDirExistIsDirectory) {
            FileUtils.dirFileListRecursive(dir);
        } else LOGGER.error("No directory found " + dir);
    }
}