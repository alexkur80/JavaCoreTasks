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


        Math<Integer> mathAB01 = new Math<>(10, 20);
        Number mathAB1Result = MathUtil.sumAB(mathAB01);
        ApplicationLogger.LOGGER.info("Integer sum " + mathAB01.getValue01() + " + " + mathAB01.getValue02() + " = " + mathAB1Result);


        Math<Double> mathAB02 = new Math<>(15.54D, 34D);
        Number mathAB2Result = MathUtil.sumAB(mathAB02);
        ApplicationLogger.LOGGER.info("Double sum " + mathAB02.getValue01() + " + " + mathAB02.getValue02() + " = " + mathAB2Result);


        Math<Float> mathAB03 = new Math<>(123.3f, 223.3f);
        Number mathAB3Result = MathUtil.sumAB(mathAB03);
        ApplicationLogger.LOGGER.info("Float sum " + mathAB03.getValue01() + " + " + mathAB02.getValue02() + " = " + mathAB3Result);


        BigDecimal bigDecimalNumber01 = new BigDecimal("111111111111111111111");
        BigDecimal bigDecimalNumber02 = new BigDecimal("222222222222222222222");
        Math<BigDecimal> mathAB04 = new Math<>(bigDecimalNumber01, bigDecimalNumber02);
        Number mathAB4Result = MathUtil.sumAB(mathAB04);
        ApplicationLogger.LOGGER.info("BigDecimal sum " + mathAB04.getValue01() + " + " + mathAB04.getValue02() + " = " + mathAB4Result);


    }

}
