
package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class InputOutputMain {
    public static void main(String[] args) {

        String multlines = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\multlines.txt";
        String javaCode = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\javaCode.txt";
        String binFile = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\intNumbers.bin";

        // read multlines and output text  into console by lines
        FileTextManipulations.outputLinesFromFileToConsole(multlines);

        // read multlines and output words with first vowel letter
        FileTextManipulations.wordsFirstVowelLetter(multlines);

        //  print in console only words, if their last letter equal next word's first letter.
        FileTextManipulations.allWordsLastLetterNextFirstLetterEqual(multlines);

        // calculate maximum number of dubles in every line of multlines
        FileTextManipulations.dublesDigits(multlines);


        // reading java-code from file and output in reverse in another file
        FileTextManipulations.doReverseFileCopy(javaCode);


        // Write 20 int  numbers above 255 in file. Read file to console, calculate middle arithmetic
        List<Integer> listInt = GenerateIntegerRandom.randomInt(256, 500, 20);
        FileTextManipulations.writeIntOwnRealization(listInt, binFile);

    }
}

