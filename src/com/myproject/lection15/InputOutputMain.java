
package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.io.IOException;
import java.util.ArrayList;

public class InputOutputMain {
    public static void main(String[] args) {

        String file01 = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\multlines.txt";
        String file02 = "D:\\Coding\\PVTCoursesPart01\\InputOutput\\intNumbers.bin";


        // read file01 and output text  into console by lines
        FileTextManipulations.outputLinesFromFileToConsole(file01);

        // read file01 and output words with first vowel letter
        FileTextManipulations.wordsFirstVowelLetter(file01);

        // calculate maximum number of dubles in every line of file01
        FileTextManipulations.dublesDigits(file01);

        //  print in console only words, if their last letter equal next word's first letter.
        FileTextManipulations.allWordsLastLetterNextFirstLetterEqual(file01);

        // Write 20 int numbers into file. Read file to console, calculate middle arithmetic
      //  WriteInt.writeInt(file02);

    }
}

