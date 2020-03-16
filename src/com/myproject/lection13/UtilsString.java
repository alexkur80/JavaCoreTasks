/**
 * This class include Methods utilities for project
 *
 * @param public static Appendable stringBuilderVSString(String str1, String str2, int numberOfIteration)
 * this method accept string1, string2, numberOfIteration.
 * It compare what method of concatenation of two strings faster:
 * string1.append(string2) or " String1 + String2. It catch OutOfMemoryError Exception.
 * Return message what variant is faster.
 * public static String strReplace(String string, String oldSymbol, String newSymbol)
 * This method takes  "String string" and change all  "oldSymbol"  with "newSymbol". Using String method
 * @param public static boolean ifStringStartAndFinishWord (String string, String world)
 * This method takes "String string" and looking for is it starts AND finish by "String world".
 * Return boolean True or False
 * @param public static int countWordsInString(String string)
 *               This method count number of words in sentence using RegExp. It accepts Russian and English
 *              alphabet
 * @author Kurlovich Alexander
 * @version Lection13 Strings, Formatter
 */

package com.myproject.lection13;

import com.myproject.lection08.ApplicationLogger;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class UtilsString {

    public static Appendable stringBuilderVSString(String str1, String str2, int numberOfIteration) {

        long startTime = 0;
        long endTime = 0;
        double str1SumStr2Time = 0;
        double str1AppendStr2Time = 0;
        double resultWhatFaster = 0;
        boolean outOfMemory = false;

        StringBuilder strBuilder = new StringBuilder(str1);

        try {

            startTime = System.nanoTime();
            for (int i = 0; i < numberOfIteration; i++) {
                String str1SumStr2 = str1 + str2;
            }
            endTime = System.nanoTime();
            str1SumStr2Time = endTime - startTime;

            startTime = System.nanoTime();
            for (int i = 0; i < numberOfIteration; i++) {
                strBuilder.append(str2);
            }
            endTime = System.nanoTime();
            str1AppendStr2Time = endTime - startTime;

            resultWhatFaster = str1SumStr2Time / str1AppendStr2Time;
            ApplicationLogger.LOGGER.info("\" str1 + str2 \" takes " + str1SumStr2Time + " ns");
            ApplicationLogger.LOGGER.info("\" str1.append(str2) \" takes " + str1AppendStr2Time + " ns");

            resultWhatFaster = str1SumStr2Time / str1AppendStr2Time;


        } catch (OutOfMemoryError e) {
            ApplicationLogger.LOGGER.error("Out of memory error in strBuilder.append(str2) " + e);
            outOfMemory = true;

        }

        StringBuilder strBuilderResult = new StringBuilder("Result:");

        if (str1SumStr2Time < str1AppendStr2Time && !outOfMemory) {
            strBuilderResult
                    .append("\" str1 + str2 \" faster ")
                    .append(resultWhatFaster)
                    .append("times then \" str1.append(str2) \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");


        } else if (
                str1AppendStr2Time < str1SumStr2Time && !outOfMemory) {
            strBuilderResult
                    .append("\" str1.append(str2) \" faster ")
                    .append(resultWhatFaster)
                    .append(" times then \" str1 + str2 \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");


        } else if (str1AppendStr2Time == str1SumStr2Time && !outOfMemory) {
            strBuilderResult
                    .append("\" str1.append(str2) \" takes EQUAL time ")
                    .append("as  \" str1 + str2 \" in ")
                    .append(numberOfIteration)
                    .append(" iterations");

        } else {
            strBuilderResult.append("Too much iterations, out of memory" +
                    " Not possible to estimate resultWhatFaster correctly");

        }

        return strBuilderResult;

    }

    public static boolean ifStringStartAndFinishWord(String string, String world) {
        boolean ifStringStartAndFinishWord = false;

        if (string.startsWith(world) && string.endsWith(world)) {
            ifStringStartAndFinishWord = true;
        }
        return ifStringStartAndFinishWord;
    }

    public static int countWordsInString(String string) {

        Pattern pattern = Pattern.compile("[a-zA-Zа-яёА-ЯЁ0-9]+");
        Matcher matcher = pattern.matcher(string);

        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }


/* Using RegExp

    public static String strReplace(String string) {
    String symbolOldRegExp = ":\\(";
    String symbolNew = ":)";

    Pattern patterns = Pattern.compile(symbolOldRegExp);
    Matcher matcher = patterns.matcher(string);

    String replacedString = matcher.replaceAll(symbolNew);
            return replacedString;
    }

*/

    public static String strReplace(String string, String oldSymbol, String newSymbol) {

        String replacedString = string.replace(oldSymbol, newSymbol);
        return replacedString;
    }







    public static String personFIOreturn(String string) {

        String pattern = "(\\S+\\s)(\\S{1})\\S+\\s(\\S{1})\\S+";

       Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(string);
        String str = string.replaceAll(pattern, "$1.$2.$3.");

return str;
        }

        public static void removeDuplicate(String string) {



        }

    }








