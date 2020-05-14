package com.myproject.lection10;

import org.apache.log4j.Logger;

import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UtilsString {
    public final static Logger LOGGER = Logger.getLogger(UtilsString.class);

    /**
     * Compares what is faster:  'concat: str1+str2' or 'stringBuilder.append(str1)'
     * Important moment - in StringBuilder constructor we decline capacity
     *
     * @param str1              string one
     * @param str2              string two
     * @param numberOfIteration number of concatenation iterations
     * @return time1Method divide time2Method
     * @throws OutOfMemoryError if numberOfIteration > 1000000000 (type int)
     */
    public static String stringBuilderVSString(String str1, String str2, int numberOfIteration) throws OutOfMemoryError {
        StringBuilder strBuilder = new StringBuilder(1500000);

        long startTime = System.nanoTime();

        for (int i = 0; i < numberOfIteration; i++) {
            String str1SumStr2 = str1 + str2 + i;
        }

        long endTime = System.nanoTime();
        double str1SumStr2Time = endTime - startTime;

        startTime = System.nanoTime();

        for (int i = 0; i < numberOfIteration; i++) {
            strBuilder
                    .append(str1)
                    .append(str2)
                    .append(i);
        }

        endTime = System.nanoTime();
        double str1AppendStr2Time = endTime - startTime;

        double resultWhatFaster = str1SumStr2Time / str1AppendStr2Time;
        LOGGER.info("\" str1 + str2 \" takes " + str1SumStr2Time + " ns");
        LOGGER.info("\" str1.append(str2) \" takes " + str1AppendStr2Time + " ns");

        StringBuilder strBuilderResult = new StringBuilder("Result:");

        if (str1SumStr2Time < str1AppendStr2Time) {
            strBuilderResult
                    .append("\" str1 + str2 \" faster ")
                    .append(resultWhatFaster)
                    .append("times then \" str1.append(str2) \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");
        } else if (str1AppendStr2Time < str1SumStr2Time) {
            strBuilderResult
                    .append("\" str1.append(str2) \" faster ")
                    .append(resultWhatFaster)
                    .append(" times then \" str1 + str2 \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");
        } else if (str1AppendStr2Time == str1SumStr2Time) {
            strBuilderResult
                    .append("\" str1.append(str2) \" takes EQUAL time ")
                    .append("as  \" str1 + str2 \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");
        }

        return strBuilderResult.toString();
    }

    /**
     * Validates is string starts and finish with defined symbol.
     *
     * @param string - sentence which validate for first and last word
     * @param world  - word looking for in the beginning and in the end of string
     * @return true or false - if word contains in the first and last word of string
     */
    public static boolean ifStringStartAndFinishWord(String string, String world) {
        return string.startsWith(world) && string.endsWith(world);
    }

    /**
     * Counts numbers of words in string. It used String method 'split' with RegEx
     * '\\S+' means  - everything but space symbols so it include words.
     *
     * @param string any text
     * @return number of words in string
     */
    public static int countWordsInString(String string) {
        String[] words = string.split("\\S+");    // splitter is NON space symbol one ir more

        int counter = 0;
        for (String str : words) {
            counter++;
        }
        return counter;
    }

    /**
     * Defines duplicated letters and replace with one symbol <p>
     * Ex: Text before: 'ddFFFBBBaaaQQQQQQadddddddd' <p>
     * Text after: dFBaQad
     *
     * @param string any text
     * @return text without duplicated symbols.
     */
    public static String removeDuplicate(String string) {
        StringBuilder stringToRemoveDuplicates = new StringBuilder(string);

        LOGGER.info("This algorithm replacing duplicates");

        for (int i = 0; i < stringToRemoveDuplicates.length() - 1; i++) {
            if (stringToRemoveDuplicates.charAt(i) == stringToRemoveDuplicates.charAt(i + 1)) {
                stringToRemoveDuplicates.replace(i, i + 1, "*");
            }

            LOGGER.info(stringToRemoveDuplicates);
        }

        String text = stringToRemoveDuplicates.toString();
        text = text.replace("*", "");
        return text;
    }

    /**
     * Replaces all 'oldSubstring' by  'newSubstring'
     *
     * @param string       any text
     * @param oldSubstring find all substring in 'string'
     * @param newSubstring replace all 'oldSubstring' by  'newSubstring'
     * @return string replaces text
     */
    public static String strReplace(String string, String oldSubstring, String newSubstring) {
        return string.replace(oldSubstring, newSubstring);
    }

    /**
     * Replaces all 'oldSubstring' by  'newSubstring' using RegExp
     *
     * @param string - string replaces text
     */
    public static String strReplaceRegEx(String string) {
        String symbolOldRegExp = ":\\(";
        String symbolNew = ":)";

        Pattern patterns = Pattern.compile(symbolOldRegExp);
        Matcher matcher = patterns.matcher(string);

        return matcher.replaceAll(symbolNew);
    }

    /**
     * Finds first symbols in first name, second name, father's name and output first
     * symbols only delimited by "." in upper case. Alghoritm:
     * 1) Trims claces in the beginning and in the end
     * 2) Split 'spaces' and put all words in String[] words
     * 3) Use StringBuilder method to get first symbol of every word from 'String[] words' and
     * append with '.' - output correct F.I.O
     * 4) Make Appendable type StringBuilder to String type
     * Ex: Before: Cherez   Tridtcattrizabora   Zadirischenko
     * After: C.T.Z.
     *
     * @param string any name. Should have 3 words - First name, Second name, Father's name, otherwise
     *               ArrayIndexOutOfBoundsException
     * @return text in format F.I.O
     * @throws ArrayIndexOutOfBoundsException catch in main()
     */
    public static String personFIO(String string) throws ArrayIndexOutOfBoundsException {
        int FIO = 3;                                               // first name, second name, third name == 3
        String[] firstSymbolOfPersonFIO = new String[FIO];
        String string2 = string.trim();
        String[] words = string2.split("\\s+");             // splitter is NON space symbol one or more
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            firstSymbolOfPersonFIO[i] = words[i].substring(0, 1);
            stringbuilder
                    .append(firstSymbolOfPersonFIO[i])
                    .append(".");
        }
        return stringbuilder.toString()
                .toUpperCase();
    }


    /**
     * Variant01
     * Accepts long number and fill with '0' from left up to 10 symbols. If 'numberL'  more then
     * 10 symbols - replace all symbols to '0'
     * Algorithm use class 'Formatter":
     * 1) convert 'long' to 'String' so we have some methods available to operate.
     * 2) Get length of 'string' and check if it is longer then 10. If numberToString.length > 10, 'number' =0
     * and output string filled with '0'
     * 3) Else use class 'Formatter' to output result in proper format
     *
     * @param number long number
     * @return 10 symbol outpiut, filled with '0' from the end or all '0'. Ex1: 0000000124 Ex2:0000000000
     */
    public static String longToStringFilledByZero01(long number) {
        String numberToString = number + "";
        int numberLength;

        numberLength = numberToString.length();
        if (numberLength > 10) {
            number = 0;
        }

        Formatter fmt = new Formatter();

        Formatter numberFormatted;
        numberFormatted = fmt.format("First method 'Formatter'      %010d", number);

        /* Converts 'Formatter' to 'String'*/

        return numberFormatted + "";
    }

    /**
     * Variant02
     * Accepts long 'number' and fill with '0' from left up to 10 symbols. If 'numberL'  more then
     * 10 symbols - replace all symbols to '0' from the left
     * Algorithm use class Stringbuilder:
     * 1) convert 'long' to 'String' so we have some methods available to operate.
     * 2) Get length of 'string' and check if it is longer then 10. If numberToString.length > 10, 'number' =0
     * and output string filled with '0'
     * 3) Get String method 'lenght'  numberToString.length and now easy to fill from the left with '0'
     * using 'StringBuilder append' method.
     * <p>
     * maxNumberOfSymbolsOutput - number of digits to output  after that fill all with '0'
     *
     * @param number long number
     * @return stringFormatted contains 10 symbol outpiut, filled with '0' from the end or all '0'.
     * Ex1: 0000000124 Ex2:0000000000
     */
    public static String intToStringFilledByZero02(long number) {
        int maxNumberOfSymbolsOutput = 10;
        StringBuilder stringbuilder = new StringBuilder();

        /* Convert 'long' to 'String' */

        String numberToString = number + "";

        String stringFormatted;
        int numberLength = numberToString.length();
        if (numberLength > maxNumberOfSymbolsOutput) {
            for (int i = 0; i < maxNumberOfSymbolsOutput; i++) {
                stringbuilder.append("0");
            }

            /* Convert 'Appendable' to 'String' */

            stringFormatted = "Second method 'StringBuffer'  " + stringbuilder;
            return stringFormatted;
        }

        /* Now we fill the rest symbols from the left by '0' */

        for (int i = 0; i < maxNumberOfSymbolsOutput - numberLength; i++) {
            stringbuilder.append("0");
        }

        stringbuilder.append(numberToString);
        stringFormatted = "Second method 'StringBuffer' " + stringbuilder;
        return stringFormatted;
    }

    /**
     * Variant03
     * Accepts long 'number' and fill with '0' from left up to 10 symbols. If 'numberL'  more then
     * 10 symbols - replace all symbols to '0' from the left
     * Algorithm use class String:
     * <p>
     * maxNumberOfSymbolsOutput - number of digits to output  after that fill all with '0'
     *
     * @return stringFormatted contains 10 symbol outpiut, filled with '0' from the end or all '0'.
     * Ex1: 0000000124 Ex2:0000000000
     */
    public static String intToStringFilledByZero03(long number) {
        StringBuilder stringFormatted = new StringBuilder();
        int maxNumberOfSymbolsOutput = 10;

        /* Convert 'long' to 'String' */

        String numberToString = number + "";

        int numberLength = numberToString.length();
        if (numberLength > maxNumberOfSymbolsOutput) {
            for (int i = 0; i < maxNumberOfSymbolsOutput; i++) {

                stringFormatted.append("0");
            }

            stringFormatted.insert(0, "Third method 'String' ");
            return stringFormatted.toString();
        }

        /* Now we fill the rest symbols from the left by '0' */

        for (int i = 0; i < maxNumberOfSymbolsOutput - numberLength; i++) {
            stringFormatted.append("0");
        }

        stringFormatted = new StringBuilder("Third method 'String'  " + stringFormatted + numberToString);
        return stringFormatted.toString();
    }
}