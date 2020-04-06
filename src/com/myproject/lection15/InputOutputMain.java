/**
 * This class testing IO classes and methods and text manipulation
 *
 * @author Kurlovich Alexander
 * @version Lection15 IO
 * @date 04/06/2020
 */

package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.util.List;

public class InputOutputMain {
    public static void main(String[] args) {

        String multlines = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\multlines.txt";
        String javaCode = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\javaCode.txt";
        String binFile = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\intNumbers.bin";
        String dir = "D:\\Coding\\2020.02.2020";

        // read multlines and output text  into console by lines
        FileTextUtils.outputLinesFromFileToConsole(multlines);

        // read multlines and output words with first vowel letter
        FileTextUtils.wordsFirstVowelLetter(multlines);

        //  print in console only words, if their last letter equal next word's first letter.
        FileTextUtils.allWordsLastLetterNextFirstLetterEqual(multlines);

        // calculate maximum number of dubles in every line of multlines
        FileTextUtils.dublesDigits(multlines);

        // reading java-code from file and output in reverse in another file
        FileTextUtils.doReverseFileCopy(javaCode);

        // Write 20 int  numbers above 255 in file. Read file to console, calculate middle arithmetic
        List<Integer> listInt = GenerateIntegerRandom.randomInt(256, 500, 20);
        FileTextUtils.writeIntOwnRealization(listInt, binFile);

        // verify is dir is directory and is dir exist, then call dirListRecurcy()
        boolean isDirExistIsDirectory = FileUtils.isDirectoryIsExist(dir);
        if (isDirExistIsDirectory) {
            FileUtils.dirFileListRecursive(dir);
        } else ApplicationLogger.LOGGER.info("No directory found " + dir);
    }
}


