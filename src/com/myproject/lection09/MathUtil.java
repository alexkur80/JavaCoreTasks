package com.myproject.lection09;

import java.math.BigDecimal;

public class MathUtil {

    /**
     * Sums two numbers
     *
     * @param numbersGenericType object object with two parameters instanceof Number
     * @param <T>                type instance of Number
     * @return result of two number summing and 'null' if parameters are not instance of Number
     * @see return null if parameters are not instance of Number
     */
    public static <T extends Number> Number sumAB(Math<T> numbersGenericType) {
        T number01 = numbersGenericType.getValue01();
        T number02 = numbersGenericType.getValue02();

        if (number01 instanceof Integer) {
            return (Integer) (number01.intValue() + number02.intValue());
        } else if (number01 instanceof Double) {
            return (Double) (number01.doubleValue() + number02.doubleValue());
        } else if (number01 instanceof Float) {
            return (Float) (number01.floatValue() + number02.floatValue());
        } else if (number01 instanceof BigDecimal) {
            return (BigDecimal) ((BigDecimal) number01).add((BigDecimal) number02);
        } else {
            return null;
        }
    }

    /**
     * Divides two numbers
     *
     * @param numbersGenericType object object with two parameters instanceof Number
     * @param <T>                type instance of Number
     * @return result of two number dividing and 'null' if parameters are not instance of Number
     * @see return null if parameters are not instance of Number
     */
    public static <T extends Number> Number divAB(Math<T> numbersGenericType) {
        T number01 = numbersGenericType.getValue01();
        T number02 = numbersGenericType.getValue02();

        if (number01 instanceof Integer) {
            return (Integer) (number01.intValue() / number02.intValue());
        } else if (number01 instanceof Double) {
            return (Double) (number01.doubleValue() / number02.doubleValue());
        } else if (number01 instanceof Float) {
            return (Float) (number01.floatValue() / number02.floatValue());
        } else if (number01 instanceof BigDecimal) {
            return (BigDecimal) ((BigDecimal) number01).divide((BigDecimal) number02);
        } else return null;
    }
}