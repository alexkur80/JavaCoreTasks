/**
 * This class include methods to work with reading external file and manipulation with text from this file.
 */

package com.myproject.lection15;

import com.myproject.lection16.FileUtilsCopy01;
import com.myproject.utils.ApplicationLogger;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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


    /**
     * This method read java-code file and write copy in file every line in
     * reverse order. New file name adds 'copy' extension.
     */
    public static void doReverseFileCopy(String filePath) {
        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        File fileRead = new File(File.separator + filePath);
        File fileWrite = new File(File.separator + filePath + ".copy");
        StringBuilder stringBuilder = new StringBuilder();

        if (isExistIsFile) {
            try (BufferedReader fileIn = new BufferedReader(new FileReader(fileRead));
                 BufferedWriter fileOut = new BufferedWriter(new FileWriter(fileWrite))
            ) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    stringBuilder.setLength(0); // clear stringBuilder
                    line = stringBuilder.append(line)
                            .reverse()
                            .toString();
                    fileOut.write(line + " \n");
                }
            } catch (IOException e) {
                ApplicationLogger.LOGGER.error("Error opening, reading or writing file ");
                e.printStackTrace();
            }
        }
    }


    public static void writeIntOwnRealization(List<Integer> list, String filePath) {
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            ApplicationLogger.LOGGER.error("Unable to create file " + file.getName());
        }

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);


        if (isExistIsFile) {
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(File.separator + filePath));
                 DataInputStream dataInputStream = new DataInputStream(new FileInputStream(File.separator + filePath))) {

                ApplicationLogger.LOGGER.info("List of generated int numbers:");
                Iterator<Integer> iterator = list.iterator();


//                /**
//                 *  This commented method write int to binary file, using utility method 'writeInt'
//                 *  but below provides the same functionality using bit moving & 0xFF
//                 */
//
//                while (iterator.hasNext()) {
//                Integer number = iterator.next();
//                dataOutputStream.writeInt(number);
//                ApplicationLogger.LOGGER.info("Writing  int numbers to  binary file: " + number);
//                }


                while (iterator.hasNext()) {
                    Integer number = iterator.next();

                    dataOutputStream.write((number >>> 24) & 0b11111111);
                    dataOutputStream.write((number >>> 16) & 0b11111111);
                    dataOutputStream.write((number >>> 8) & 0b11111111);
                    dataOutputStream.write((number) & 0b11111111);

                    ApplicationLogger.LOGGER.info("Writing  int numbers to  binary file: " + number);

                }


                StringBuilder stringBuilder = new StringBuilder();
                int sumAllNumbers = 0;
                int counter = 0;
                for (int i = 0; i < list.size(); i++) {

                    int nexNUmber = dataInputStream.readInt();
                    stringBuilder.append(nexNUmber)
                            .append(" ");

                    sumAllNumbers += nexNUmber;
                    counter++;
                }

                ApplicationLogger.LOGGER.info("Reading int numbers from binary file: " + stringBuilder);
                ApplicationLogger.LOGGER.info("Average of all numbers: " + sumAllNumbers / counter);


            } catch (FileNotFoundException e) {
                ApplicationLogger.LOGGER.error("Error FileNotFoundException");
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}





