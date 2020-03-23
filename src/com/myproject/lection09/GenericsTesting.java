/**
 * This is main class, testing Generics and Annotation.
 */

package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;

import java.math.BigDecimal;


public class GenericsTesting {
    public static void main(String[] args) {

        Pair<String, String> initialPair = new Pair<>("12", "1212Value");

        ApplicationLogger.LOGGER.info("Pair K before " + initialPair.getPairKey());
        ApplicationLogger.LOGGER.info("Pair V before " + initialPair.getPairValue());

        Pair swappedPair = PairUtil.swap(initialPair);

        ApplicationLogger.LOGGER.info("Pair K after " + swappedPair.getPairKey());
        ApplicationLogger.LOGGER.info("Pair V after " + swappedPair.getPairValue());


        Math<Integer> variablesInteger = new Math<>(20, 10);
        Number sumAB01Result = MathUtil.sumAB(variablesInteger);
        Number divAB01Result = MathUtil.divAB(variablesInteger);
        ApplicationLogger.LOGGER.info("Integer sum " + variablesInteger.getValue01() + " + " + variablesInteger.getValue02() + " = " + sumAB01Result);
        ApplicationLogger.LOGGER.info("Integer div " + variablesInteger.getValue01() + " / " + variablesInteger.getValue02() + " = " + divAB01Result);


        Math<Double> variablesDouble = new Math<>(15.54D, 34D);
        Number sumAB02Result = MathUtil.sumAB(variablesDouble);
        Number divAB02Result = MathUtil.divAB(variablesDouble);
        ApplicationLogger.LOGGER.info("Double sum " + variablesDouble.getValue01() + " + " + variablesDouble.getValue02() + " = " + sumAB02Result);
        ApplicationLogger.LOGGER.info("Double div " + variablesDouble.getValue01() + " / " + variablesDouble.getValue02() + " = " + divAB02Result);


        Math<Float> variablesFloat = new Math<>(123.3f, 223.3f);
        Number sumAB03Result = MathUtil.sumAB(variablesFloat);
        Number divAB03Result = MathUtil.divAB(variablesFloat);
        ApplicationLogger.LOGGER.info("Float sum " + variablesFloat.getValue01() + " + " + variablesFloat.getValue02() + " = " + sumAB03Result);
        ApplicationLogger.LOGGER.info("Float div " + variablesFloat.getValue01() + " / " + variablesFloat.getValue02() + " = " + divAB03Result);


        BigDecimal bigDecimalNumber01 = new BigDecimal("111111111111111111111");
        BigDecimal bigDecimalNumber02 = new BigDecimal("222222222222222222222");
        Math<BigDecimal> variablesBigDecimal = new Math<>(bigDecimalNumber01, bigDecimalNumber02);
        Number sumAB04Result = MathUtil.sumAB(variablesBigDecimal);
        Number divAB04Result = MathUtil.divAB(variablesBigDecimal);
        ApplicationLogger.LOGGER.info("BigDecimal sum " + variablesBigDecimal.getValue01() + " + " + variablesBigDecimal.getValue02() + " = " + sumAB04Result);
        ApplicationLogger.LOGGER.info("BigDecimal div " + variablesBigDecimal.getValue01() + " / " + variablesBigDecimal.getValue02() + " = " + divAB04Result);

        Math<Double> math = new Math(12.5, 15.5);
        TransactionClass transactionclass = new TransactionClass();

        ClassAnalyzer.transactionSuccessVerification(transactionclass);

        ClassAnalyzer.showClassName(math);
        ClassAnalyzer.showClassFields(math);
        ClassAnalyzer.showClassMethods(math);
        ClassAnalyzer.showMethodsAnnotations(transactionclass);
        ClassAnalyzer.showClassConstructors(math);


    }
}
