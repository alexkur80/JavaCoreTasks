package com.myproject.lection13;

import com.myproject.lection08.GeometricFig;
import org.apache.log4j.Logger;

public class StringsTesting {
    public final static Logger LOGGER = Logger.getLogger(GeometricFig.class);

    public static void main(String[] args) {
        String str1 = "Change";
        String str2 = " World!";
        int numberOfIteration = 1000;
        String resultConcatVSStringBuilderTest;

        try {
            resultConcatVSStringBuilderTest = UtilsString.stringBuilderVSString(str1, str2, numberOfIteration);
        } catch (OutOfMemoryError ome) {
            LOGGER.error("Out of memory error in strBuilder.append(str2) " + ome);
            resultConcatVSStringBuilderTest = "ERROR";
        }

        if (resultConcatVSStringBuilderTest != null) {
            LOGGER.info(resultConcatVSStringBuilderTest);
        } else {
            LOGGER.error("resultConcatVSStringBuilderTest == null");
        }

        String oldSymbol = ":(";
        String newSymbol = ":)";
        String messageToReplaceSubstring = ":( :( :( :(";

        String messageAfterReplacing = UtilsString.strReplace(messageToReplaceSubstring, oldSymbol, newSymbol);
        LOGGER.info("I was sad " + messageToReplaceSubstring + " but now I am happy " + messageAfterReplacing);

        String stringStartEndsWord = "Hey";
        String stringStartEndsEqualWord = "Hey, my name is Alex, Hey";

        boolean ifStringStartAndFinishWord = UtilsString.ifStringStartAndFinishWord(stringStartEndsEqualWord, stringStartEndsWord);
        LOGGER.info("Sentence \" " + stringStartEndsEqualWord
                + " \" starts and finish with word \" " +
                stringStartEndsWord + " \" ? : " + ifStringStartAndFinishWord);

        String stringToCountWords = "     This      class uses for Log4j.            Write to console and file.";

        int countWordsInString = UtilsString.countWordsInString(stringToCountWords);
        LOGGER.info("Inside sentence \"" + stringToCountWords + " \" "
                + countWordsInString + " words");

        String removeDuplicates = "ddFFFBBBaaaQQQQQQadddddddd";

        String stringAfterRemovedDuplicates = UtilsString.removeDuplicate(removeDuplicates);
        LOGGER.info("String before: " + removeDuplicates + " ; String after " +
                "removing duplicates: " + stringAfterRemovedDuplicates);

        boolean flag = false;                 // needs if not Exception
        String personNameSurname = "  Cherez   Tridtcattrizabora   Zadiriscenko";
        String personFIO = "Ex: F.I.O, will be changed after method execute";

        try {
            personFIO = UtilsString.personFIO(personNameSurname);
        } catch (ArrayIndexOutOfBoundsException aoe) {
            LOGGER.info("Catch CHECKED ArrayIndexOutOfBoundsException" + aoe);
            flag = true;
        }

        if (!flag) {
            LOGGER.info("First name, Second name, Father's name ( " +
                    personNameSurname + " )" + " initials: " + personFIO);
        }

        long startTime;
        long finishTime;
        long timeMethodExecute;
        String numberFormatted01 = "";
        String numberFormatted02 = "";
        String numberFormatted03 = "";
        long numberOfIterations = 1000000L;

        startTime = System.nanoTime();
        long numberToFormat = 72322L;

        for (long i = 0; i < numberOfIterations; i++) {
            numberFormatted01 = UtilsString.longToStringFilledByZero01(numberToFormat);
        }

        finishTime = System.nanoTime();

        timeMethodExecute = finishTime - startTime;
        LOGGER.info(numberFormatted01 + "  executes " + timeMethodExecute + "ns" +
                " for " + numberOfIterations + " iterations");

        startTime = System.nanoTime();

        for (long i = 0; i < numberOfIterations; i++) {
            numberFormatted02 = UtilsString.intToStringFilledByZero02(numberToFormat);
        }

        finishTime = System.nanoTime();
        timeMethodExecute = finishTime - startTime;
        LOGGER.info(numberFormatted02 + "  executes" + timeMethodExecute + "ns" +
                " for " + numberOfIterations + " iterations");

        startTime = System.nanoTime();

        for (long i = 0; i < numberOfIterations; i++) {
            numberFormatted03 = UtilsString.intToStringFilledByZero03(numberToFormat);
        }

        finishTime = System.nanoTime();
        timeMethodExecute = finishTime - startTime;
        LOGGER.info(numberFormatted03 + "  executes " + timeMethodExecute + "ns" +
                " for " + numberOfIterations + " iterations");
    }
}