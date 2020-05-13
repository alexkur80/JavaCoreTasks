package com.myproject.lection09;

import org.apache.log4j.Logger;

import java.math.BigDecimal;

/**
 * Tests Generics, Annotation, Reflection API
 */
public class GenericsTesting {
    public final static Logger LOGGER = Logger.getLogger(GenericsTesting.class);

    public static void main(String[] args) {

        Pair<String, String> initialPair = new Pair<>("1111key", "2222value");
        LOGGER.info("Pair <K, V> before " + initialPair.getPairKey() + "," + initialPair.getPairValue());

        Pair swappedPair = PairUtil.swap(initialPair);
        LOGGER.info("Pair <K, V> after " + swappedPair.getPairKey() + "," + swappedPair.getPairValue());

        Math<Integer> variablesInteger = new Math<>(20, 10);

        Number sumAB01Result = MathUtil.sumAB(variablesInteger);
        if (sumAB01Result != null) {
            LOGGER.info("Integer sum " + variablesInteger.getValue01() + " + " + variablesInteger.getValue02() + " = " + sumAB01Result);
        } else {
            LOGGER.error("Error, parameters " + variablesInteger.getValue01() + " or " + variablesInteger.getValue02() + " is not" +
                    "instance of Number");
        }

        Number divAB01Result = MathUtil.divAB(variablesInteger);
        if (divAB01Result != null) {
            LOGGER.info("Integer div " + variablesInteger.getValue01() + " / " + variablesInteger.getValue02() + " = " + divAB01Result);
        } else {
            LOGGER.error("Error, parameters " + variablesInteger.getValue01() + " or " + variablesInteger.getValue02() + " is not" +
                    "instance of Number");
        }


        Math<Double> variablesDouble = new Math<>(15.54D, 34D);

        Number sumAB02Result = MathUtil.sumAB(variablesDouble);
        if (sumAB02Result != null) {
            LOGGER.info("Double sum " + variablesDouble.getValue01() + " + " + variablesDouble.getValue02() + " = " + sumAB02Result);
        } else {
            LOGGER.error("Error, parameters " + variablesDouble.getValue01() + " or " + variablesDouble.getValue02() + " is not" +
                    "instance of Number");
        }

        Number divAB02Result = MathUtil.divAB(variablesDouble);
        if (divAB02Result != null) {
            LOGGER.info("Double div " + variablesDouble.getValue01() + " / " + variablesDouble.getValue02() + " = " + divAB02Result);
        } else {
            LOGGER.error("Error, parameters " + variablesDouble.getValue01() + " or " + variablesDouble.getValue02() + " is not" +
                    "instance of Number");
        }

        Math<Float> variablesFloat = new Math<>(123.3f, 223.3f);

        Number sumAB03Result = MathUtil.sumAB(variablesFloat);
        if (sumAB03Result != null) {
            LOGGER.info("Float sum " + variablesFloat.getValue01() + " + " + variablesFloat.getValue02() + " = " + sumAB03Result);
        } else {
            LOGGER.error("Error, parameters " + variablesFloat.getValue01() + " or " + variablesFloat.getValue02() + " is not" +
                    "instance of Number");
        }

        Number divAB03Result = MathUtil.divAB(variablesFloat);
        if (divAB03Result != null) {
            LOGGER.info("Float div " + variablesFloat.getValue01() + " / " + variablesFloat.getValue02() + " = " + divAB03Result);
        } else {
            LOGGER.error("Error, parameters " + variablesFloat.getValue01() + " or " + variablesFloat.getValue02() + " is not" +
                    "instance of Number");
        }

        BigDecimal bigDecimalNumber01 = new BigDecimal("111111111111111111111");
        BigDecimal bigDecimalNumber02 = new BigDecimal("222222222222222222222");
        Math<BigDecimal> variablesBigDecimal = new Math<>(bigDecimalNumber01, bigDecimalNumber02);

        Number sumAB04Result = MathUtil.sumAB(variablesBigDecimal);
        if (sumAB04Result != null) {
            LOGGER.info("BigDecimal sum " + variablesBigDecimal.getValue01() + " + " + variablesBigDecimal.getValue02() + " = " + sumAB04Result);
        } else {
            LOGGER.error("Error, parameters " + variablesBigDecimal.getValue01() + " or " + variablesBigDecimal.getValue02() + " is not" +
                    "instance of Number");
        }

        Number divAB04Result = MathUtil.divAB(variablesBigDecimal);
        if (divAB03Result != null) {
            LOGGER.info("BigDecimal div " + variablesBigDecimal.getValue01() + " / " + variablesBigDecimal.getValue02() + " = " + divAB04Result);
        } else {
            LOGGER.error("Error, parameters " + variablesBigDecimal.getValue01() + " or " + variablesBigDecimal.getValue02() + " is not" +
                    "instance of Number");
        }

        Math<Double> math = new Math(12.5, 15.5);

        ClassAnalyzer.analyzeClass(math);

        ClassAnalyzer.transactionSuccessVerification(math);
    }
}