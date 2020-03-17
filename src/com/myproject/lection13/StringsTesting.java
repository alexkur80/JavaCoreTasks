/**
 * This class include Methods utilities
 *
 * @author Kurlovich Alexander
 * @version Lection13 Strings, StringBuilder Formatter, main()
 * @date 03/17/2020
 */
package com.myproject.lection13;

import com.myproject.lection08.ApplicationLogger;

public class StringsTesting {
    public static void main(String[] args) {
        String str1 = "Change";
        String str2 = " World!";
        int numberOfIteration = 1000;

        String messageToReplaceSubstring = ":( :( :( :(";
        String oldSymbol = ":(";
        String newSymbol = ":)";

        String stringStartEndsEqualWord = "Hey, my name is Alex, Hey";
        String stringStartEndsWord = "Hey";

        String stringToCountWords = "     This      class uses for Log4j.            Write to console and file.";

        String personNameSurname = "  Cherez   Tridtcattrizabora   Zadiriscenko";

        String removeDuplicates = "ddFFFBBBaaaQQQQQQadddddddd";

        String personFIO = "Ex: F.I.O, will be changed after method execute";

        String resultConcatVSStringBuilderTest = "What concat method is faster?";

        long numberForFormatter = 72322L;


        try {
            resultConcatVSStringBuilderTest = UtilsString.stringBuilderVSString(str1, str2, numberOfIteration);

        } catch (OutOfMemoryError e) {
            ApplicationLogger.LOGGER.error("Out of memory error in strBuilder.append(str2) " + e);
            resultConcatVSStringBuilderTest = "ERROR";
        }

        if (resultConcatVSStringBuilderTest != null) {
            ApplicationLogger.LOGGER.info(resultConcatVSStringBuilderTest);
        }


        String messageAfterReplacing = UtilsString.strReplace(messageToReplaceSubstring, oldSymbol, newSymbol);
        ApplicationLogger.LOGGER.info("I was sad " + messageToReplaceSubstring
                + " but now I am happy " + messageAfterReplacing);

        boolean ifStringStartAndFinishWord = UtilsString.ifStringStartAndFinishWord(stringStartEndsEqualWord, stringStartEndsWord);
        ApplicationLogger.LOGGER.info("Sentence \" " + stringStartEndsEqualWord
                + " \" starts and finish with word \" " +
                stringStartEndsWord + " \" ? : " + ifStringStartAndFinishWord);

        int countWordsInString = UtilsString.countWordsInString(stringToCountWords);
        ApplicationLogger.LOGGER.info("Inside sentence \"" + stringToCountWords + " \" "
                + countWordsInString + " words");

        String stringAfterRemovedDuplicates = UtilsString.removeDuplicate(removeDuplicates);
        ApplicationLogger.LOGGER.info("String before: " + removeDuplicates + " ; String after " +
                "removing duplicates: " + stringAfterRemovedDuplicates);

        boolean flag = false; // needs if not Exception

        try {
            personFIO = UtilsString.personFIO(personNameSurname);
        } catch (ArrayIndexOutOfBoundsException e) {
            ApplicationLogger.LOGGER.info("Catch CHECKED ArrayIndexOutOfBoundsException");
            flag = true;
        }
        if (!flag) {
            ApplicationLogger.LOGGER.info("First name, Second name, Father's name ( " +
                    personNameSurname + " )" + " initials: " + personFIO);
        }

        long startTime;
        long finishTime;
        long timeMethodExecute;

        startTime = System.nanoTime();
        String numberFormatted01 = UtilsString.longToStringFilledByZero01(numberForFormatter);
        finishTime = System.nanoTime();
        timeMethodExecute = finishTime - startTime;
        ApplicationLogger.LOGGER.info(numberFormatted01 + "  executes " + timeMethodExecute + "ns");

        startTime = System.nanoTime();
        String numberFormatted02 = UtilsString.intToStringFilledByZero02(numberForFormatter);
        finishTime = System.nanoTime();
        timeMethodExecute = finishTime - startTime;
        ApplicationLogger.LOGGER.info(numberFormatted02 + "  executes " + timeMethodExecute + "ns");

        startTime = System.nanoTime();
        String numberFormatted03 = UtilsString.intToStringFilledByZero03(numberForFormatter);
        finishTime = System.nanoTime();
        timeMethodExecute = finishTime - startTime;
        ApplicationLogger.LOGGER.info(numberFormatted03 + "  executes " + timeMethodExecute + "ns");
    }

}


