/**
 * This class includes Methods utilities
 *
 * @author Kurlovich Alexander
 * @version Lection13 Strings, StringBuilder Formatter, Methods
 * @date 03/17/2020
 */

package com.myproject.lection13;

import com.myproject.lection08.ApplicationLogger;

import java.util.Formatter;

class UtilsString {

    /**
     * Method compare what waster concatinate - standart 'str1+str2' or ;strilngBuilder.append(str1)'
     * important moment - in StringBuilder conctructor we put capacity of symbols that probably
     * we keep in StringBuilder because this way concatenation algorithm using append become much more faster/
     *
     * @param str1              string one to concatenate
     * @param str2              string two to concatinate
     * @param numberOfIteration number of concatenation iterations
     * @return time1Method/time2Method
     * @throws OutOfMemoryError if numberOfIteration > 1000000000 (type int)
     */
    public static String stringBuilderVSString(String str1, String str2, int numberOfIteration) throws OutOfMemoryError {

        StringBuilder strBuilder = new StringBuilder(1400000);

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
        ApplicationLogger.LOGGER.info("\" str1 + str2 \" takes " + str1SumStr2Time + " ns");
        ApplicationLogger.LOGGER.info("\" str1.append(str2) \" takes " + str1AppendStr2Time + " ns");


        StringBuilder strBuilderResult = new StringBuilder("Result:");

        if (str1SumStr2Time < str1AppendStr2Time) {
            strBuilderResult
                    .append("\" str1 + str2 \" faster ")
                    .append(resultWhatFaster)
                    .append("times then \" str1.append(str2) \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");

        } else if (
                str1AppendStr2Time < str1SumStr2Time) {
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
        String result = strBuilderResult + "";
        return result;
    }


    /**
     * @param string - sentence that checked for first and last word
     * @param world  - word, that is looking for in the beginning and in the end of string
     * @return boolean true or false - if word contains in the first and last word of string
     */
    public static boolean ifStringStartAndFinishWord(String string, String world) {
        boolean ifStringStartAndFinishWord = false;

        if (string.startsWith(world) && string.endsWith(world)) {
            ifStringStartAndFinishWord = true;
        }
        return ifStringStartAndFinishWord;
    }


/* countWordsInString Using RegExp


    public static int countWordsInString(String string) {

        Pattern pattern = Pattern.compile("[a-zA-Zа-яёА-ЯЁ0-9]+");
        Matcher matcher = pattern.matcher(string);

        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
*/

    /**
     * This method count number of words in sentence. It used String method 'split' with RegEx
     * '\\S+' means  - everything but space symbols so it include words.
     *
     * @param string any text
     * @return number of words in string
     */
    public static int countWordsInString(String string) {

        String[] words = string.split("\\S+"); // splitter is NON space symbol one ir more
        int counter = 0;

        for (String str : words) {
            counter++;
        }

        return counter;
    }


    /* strReplace using RegExp

        public static String strReplace(String string) {
        String symbolOldRegExp = ":\\(";
        String symbolNew = ":)";

        Pattern patterns = Pattern.compile(symbolOldRegExp);
        Matcher matcher = patterns.matcher(string);

        String replacedString = matcher.replaceAll(symbolNew);
                return replacedString;
        }

    */

    /**
     * Method replace all 'oldSubstring' by  'newSubstring'
     *
     * @param string       any text
     * @param oldSubstring find all substring in 'string'
     * @param newSubstring replace all 'oldSubstring' by  'newSubstring'
     * @return string replaces text
     * @version
     */
    public static String strReplace(String string, String oldSubstring, String newSubstring) {

        String replacedString = string.replace(oldSubstring, newSubstring);
        return replacedString;
    }


    /**
     * @param string any text
     * @return text without duplicated symbols. Ex: Text before: 'ddFFFBBBaaaQQQQQQadddddddd'
     * Text after: dFBaQad
     */
    public static String removeDuplicate(String string) {

        StringBuilder stringToRemoveDuplicates = new StringBuilder(string);

        ApplicationLogger.LOGGER.info("This algorithm replacing duplicates");
        for (int i = 0; i < stringToRemoveDuplicates.length() - 1; i++) {
            if (stringToRemoveDuplicates.charAt(i) == stringToRemoveDuplicates.charAt(i + 1)) {
                stringToRemoveDuplicates.replace(i, i + 1, "*");
            }

            ApplicationLogger.LOGGER.info(stringToRemoveDuplicates);
        }

        String text = stringToRemoveDuplicates.toString();
        text = text.replace("*", "");

        return text;
    }


    /**
     * This method find first symbols in first name, second name, father's name and output first
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

        String firstSymbolOfPersonFIO[] = new String[3];
        String string2 = string.trim();
        String[] words = string2.split("\\s+"); // splitter is NON space symbol one ir more
        StringBuilder stringbuilder = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            firstSymbolOfPersonFIO[i] = words[i].substring(0, 1);

            stringbuilder = stringbuilder
                    .append(firstSymbolOfPersonFIO[i])
                    .append(".");
        }

        String text = stringbuilder.toString()
                .toUpperCase();

        return text;
    }


    /**
     * Variant01
     * This method accepts long number and fill with '0' from left up to 10 symbols. If 'numberL'  more then
     * 10 symbols - replace all symbols to '0'
     * Algorithm use class 'Formatter":
     * 1) convert 'long' to 'String' so we have some methods available to operate.
     * 2) Get length of 'string' and check if it is longer then 10. If numberToString.length > 10, 'number' =0
     * and output string filled with '0'
     * 3) Else use class 'Formatter' to output result in proper format
     *
     * @param number
     * @return 10 symbol outpiut, filled with '0' from the end or all '0'. Ex1: 0000000124 Ex2:0000000000
     */
    public static String longToStringFilledByZero01(long number) {
        long startTime = System.nanoTime();

        Formatter numberFormatted;
        int numberLenght = 0;

        // convert long to String;
        String numberToString = number + "";

        numberLenght = numberToString.length();
        if (numberLenght > 10) {
            number = 0;
        }

        Formatter fmt = new Formatter();

        numberFormatted = fmt.format("First method: %010d", number);

        // Convert 'Formatter' to 'String'
        String stringFormatted = numberFormatted + "";

        long endTime = System.nanoTime();

        long timeOfMethodExecution = endTime - startTime;

        return stringFormatted;
    }


    /**
     * Variant02
     * This method accepts 'numberl' and fill with '0' from left up to 10 symbols. If 'numberL'  more then
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
     * @param number
     * @return stringFormatted contains 10 symbol outpiut, filled with '0' from the end or all '0'.
     * Ex1: 0000000124 Ex2:0000000000
     */
    public static String intToStringFilledByZero02(long number) {
        long startTime = System.nanoTime();

        String stringFormatted = "";
        int maxNumberOfSymbolsOutput = 10;
        StringBuilder stringbuilder = new StringBuilder("");

        // Convert 'long' to 'String'
        String numberToString = number + "";

        int numberLenght = numberToString.length();
        if (numberLenght > maxNumberOfSymbolsOutput) {
            for (int i = 0; i < maxNumberOfSymbolsOutput; i++) {

                stringbuilder.append("0");
            }

            // Convert 'Appendable' to 'String'
            stringFormatted = stringbuilder + "";
        }

        // Now we fill the rest symbols from the left by '0'
        for (int i = 0; i < maxNumberOfSymbolsOutput - numberLenght; i++) {
            stringbuilder.append("0");
        }
        stringbuilder.append(numberToString);
        stringFormatted = "Second method: " + stringbuilder;
        long endTime = System.nanoTime();

        long timeOfMethodExecution = endTime - startTime;

        return stringFormatted;
    }


    /**
     * Variant03
     *
     * @param number
     * @return
     */

    public static String intToStringFilledByZero03(long number) {
        String stringFormatted = "";
        int maxNumberOfSymbolsOutput = 10;

        // Convert 'long' to 'String'
        String numberToString = number + "";

        int numberLenght = numberToString.length();
        if (numberLenght > maxNumberOfSymbolsOutput) {
            for (int i = 0; i < maxNumberOfSymbolsOutput; i++) {

                stringbuilder.append("0");
            }

            // Convert 'Appendable' to 'String'
            stringFormatted = stringbuilder + "";
        }

        // Now we fill the rest symbols from the left by '0'
        for (int i = 0; i < maxNumberOfSymbolsOutput - numberLenght; i++) {
            stringbuilder.append("0");
        }
        stringbuilder.append(numberToString);
        stringFormatted = "third method:" + stringbuilder;

        return stringFormatted;
    }

}










