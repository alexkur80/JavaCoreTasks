package com.myproject.lection13;

import com.myproject.lection12.RegExpTesting;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileTextUtils {
    public final static Logger LOGGER = Logger.getLogger(RegExpTesting.class);

    /**
     * Accepts 'file', read it and output in console by lines.
     *
     * @param filePath File path for reading and output in console by linies
     */
    public static void outputLinesFromFileToConsole(String filePath) {
        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {
            File file = new File(File.separator + filePath);

            try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {
                String line;

                while ((line = fileIn.readLine()) != null) {
                    LOGGER.info(line);
                }
            } catch (IOException ioe) {
                LOGGER.error("Error opening and reading file " + ioe + file.getName());
                ioe.printStackTrace();
            }
        }
    }


    /**
     * Calculates maximum numbers of equal digits in every line of text.
     *
     * @param filePath file path
     */
    public static void doublesDigits(String filePath) {
        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {
            File file = new File(File.separator + filePath);

            ArrayList<String> list = new ArrayList<>();
            String line;

            try (BufferedReader fileIn = new BufferedReader(new FileReader(file))) {

                while ((line = fileIn.readLine()) != null) {
                    list.add(line);
                }
            } catch (IOException ioe) {
                LOGGER.error("Error opening and reading file " + ioe + file.getName());
                ioe.printStackTrace();
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
                LOGGER.info("  Maximum doubles in line:" + resultWordInLine.length() + "\n");
            }
        }
    }

    /**
     * Reads text from file and output words, starting with vowel letter.
     * Algorithm:
     * 1) Accept file path
     * 2) validate if file exist and if file is file
     *
     * @param filePath path for text file
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
            } catch (IOException ioe) {
                LOGGER.error("Error opening and reading file " + ioe + file.getName());
                ioe.printStackTrace();
            }

            Pattern pattern = Pattern.compile("\\b([aeiouyAEIOUY]\\w*)");
            Matcher matcher = pattern.matcher(stringbuilder);

            StringBuilder stringBuilderVowel = new StringBuilder();
            while (matcher.find()) {
                stringBuilderVowel.append(matcher.group())
                        .append(" ");
            }
            LOGGER.info(stringBuilderVowel);
        }
    }

    /**
     * Outputs in console only words, if their last letter equal next word's first letter.
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
            } catch (IOException ioe) {
                LOGGER.error("Error opening and reading file " + ioe + file.getName());
                ioe.printStackTrace();
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
     * Reads java-code file and write copy in file every line in
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
                    stringBuilder.setLength(0);                 // clears stringBuilder
                    line = stringBuilder.append(line)
                            .reverse()
                            .toString();
                    fileOut.write(line + " \n");
                }
            } catch (IOException ioe) {
                LOGGER.error("Error opening, reading or writing file " + ioe);
                ioe.printStackTrace();
            }
        }
    }

    /**
     * Writes in file 20 int numbers > 255. Read file and output average number
     *
     * @param list - list <Integer> twenty numbers more then 255
     */
    public static void writeIntOwnRealization(List<Integer> list, String filePath) {
        File file = new File(filePath);
        try {
            file.createNewFile();
            LOGGER.info("Successful creation  file " + filePath);
        } catch (IOException ioe) {
            LOGGER.error("Unable to create file " + ioe + file.getName());
        }

        boolean isExistIsFile = FileUtils.isFileExistIsFile(filePath);

        if (isExistIsFile) {
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(File.separator + filePath));
                 DataInputStream dataInputStream = new DataInputStream(new FileInputStream(File.separator + filePath))) {

                LOGGER.info("List of generated int numbers:");
                Iterator<Integer> iterator = list.iterator();


/*
                This commented method write int to binary file, using utility method 'writeInt'
                but below provides the same functionality using bit moving & 0xFF


                while (iterator.hasNext()) {
                Integer number = iterator.next();
                dataOutputStream.writeInt(number);
                ApplicationLogger.LOGGER.info("Writing  int numbers to  binary file: " + number);
                }

*/
                while (iterator.hasNext()) {
                    Integer number = iterator.next();

                    dataOutputStream.write((number >>> 24) & 0b11111111);
                    dataOutputStream.write((number >>> 16) & 0b11111111);
                    dataOutputStream.write((number >>> 8) & 0b11111111);
                    dataOutputStream.write((number) & 0b11111111);

                    LOGGER.info("Writing  int numbers to  binary file: " + number);
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

                LOGGER.info("Reading int numbers from binary file: " + stringBuilder);
                LOGGER.info("Average of all numbers: " + sumAllNumbers / counter);

            } catch (FileNotFoundException fnfe) {
                LOGGER.error("Error FileNotFoundException" + fnfe);
                fnfe.printStackTrace();
            } catch (IOException ioe) {
                LOGGER.error("Error IOException" + ioe);
                ioe.printStackTrace();
            }
        }
    }
}