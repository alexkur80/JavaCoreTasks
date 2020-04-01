/**
 * This class include methods to work with reading external file and manipulation with text from this file.
 */

package com.myproject.lection15;

import com.myproject.utils.ApplicationLogger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTextManipulations {

    /**
     * This method accepts 'file', read it and oputput in console by lines.
     *
     * @param filePath File path for reading and output in console by linies
     * @throws IOException
     */
    public static void outputLinesFromFileToConsole(String filePath) {

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {

            File file = new File(File.separator + filePath);
            try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    ApplicationLogger.LOGGER.info(line);
                }

            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening and reading file " + file.getName());
                e.printStackTrace();
            }
        }

    }


    /**
     * This method calculate maximum numbers of equal digits in every line of text.
     *
     * @param filePath file path
     */
    public static void dublesDigits(String filePath) {

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {

            File file = new File(File.separator + filePath);

            ArrayList<String> list = new ArrayList<>();
            String line;

            try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {

                int i = 0;
                while ((line = fileIn.readLine()) != null) {
                    list.add(line);
                }
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening and reading file " + file.getName());
                e.printStackTrace();
            }

            Pattern pattern = Pattern.compile("(\\d)\\1*");

            for (String line2 : list) {
                String resultWordInLine = "";
                Matcher matcher = pattern.matcher(line2);
                while (matcher.find()) {
                    String wordInLine = matcher.group();
                    if (wordInLine.length() > resultWordInLine.length()) {
                        resultWordInLine = wordInLine;
                    }

                    System.out.print(matcher.group());
                    System.out.print(" ");
                }
                System.out.print("  Maxinum dubles in line:" + resultWordInLine.length() + "\n");
            }
        }
    }


    /**
     * This method reads text from file and output words, starting with vowel letter.
     * Algorithm:
     * 1) Accept file path
     * 2) validate if file exist and if file is file
     *
     * @param filePath
     * @throws IOException
     */
    public static void wordsFirstVowelLetter(String filePath) {

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {

            File file = new File(File.separator + filePath);

            StringBuilder stringbuilder = new StringBuilder();

            try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    stringbuilder.append(line);

                }
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening and reading file " + file.getName());
                e.printStackTrace();
            }

            Pattern pattern = Pattern.compile("\\b([aeiouyAEIOUY]\\w*)");
            Matcher matcher = pattern.matcher(stringbuilder);

            StringBuilder stringBuilderVowel = new StringBuilder();
            while (matcher.find()) {
                stringBuilderVowel.append(matcher.group())
                        .append(" ");
            }
            System.out.println(stringBuilderVowel);
        }

    }

    /**
     * This method print in console only words, if their last letter equal next word's first letter.
     *
     * @param filePath file with text which explore
     */
    public static void allWordsLastLetterNextFirstLetterEqual(String filePath) {

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);


        if (isExistIsFile) {

            File file = new File(File.separator + filePath);

            StringBuilder stringbuilder = new StringBuilder();

            try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    stringbuilder.append(line);

                }
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening and reading file " + file.getName());
                e.printStackTrace();
            }

            String textFromFile = stringbuilder.toString();

            String[] words = textFromFile.split("(\\s+)|\\n");

            for (int i = 0; i < words.length - 1; i++) {
                System.out.println(words[i] + i);
            }

            for (int i = 0; i < words.length - 1; i++) {
                if (words[i].charAt(words[i].length() - 1) == words[i + 1].charAt(0)) {
                    System.out.println(words[i]);
                }
            }
        }
    }
}


