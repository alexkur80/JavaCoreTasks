/**
 * Util methods
 *
 * @author Kurlovich Alexander
 * @version Lection 09 Generics, Annotation
 */

package com.myproject.lection09;

import java.math.BigDecimal;


public class MathUtil {


    /**
     * This method sumAB.
     * public static <T extends Number> Number sumAB(Math<T> numbersGenericType)
     * Accept (Math<T> numbersGenericType) parameters so before calling this method create
     * (Math<T>) object first with initialized numbers for arithmetic operation.
     * Number - return number.
     * <T extends Number> - because of nessesarry methods like valueof, allowable for Number extended objects
     *
     * @return SUM of two numbers that was initialized in Math<T> constructor
     */
    public static <T extends Number> Number sumAB(Math<T> numbersGenericType) {

        T number01 = numbersGenericType.getValue01();
        T number02 = numbersGenericType.getValue02();

        Number result = null;

        if (number01 instanceof Integer) {
            result = (Integer) (number01.intValue() + number02.intValue());
        } else if (number01 instanceof Double) {
            result = (Double) (number01.doubleValue() + number02.doubleValue());
        } else if (number01 instanceof Float) {
            result = (Float) (number01.floatValue() + number02.floatValue());
        } else if (number01 instanceof BigDecimal) {
            result = (BigDecimal) ((BigDecimal) number01).add((BigDecimal) number02);
        }
        return result;
    }


    /**
     * This method divAB.
     * public static <T extends Number> Number divAB(Math<T> numbersGenericType)
     * Accept (Math<T> numbersGenericType) parameters so before calling this method create
     * (Math<T>) object first with initialized numbers for arithmetic operation.
     * Number - return number.
     * <T extends Number> - because of necessary methods like valueof, allowable for Number extended objects
     *
     * @return DIV of two numbers that was initialized in Math<T> constructor
     */
    public static <T extends Number> Number divAB(Math<T> numbersGenericType) {

        T number01 = numbersGenericType.getValue01();
        T number02 = numbersGenericType.getValue02();
        Number result = null;

        if (number01 instanceof Integer) {
            result = (Integer) (number01.intValue() / number02.intValue());
        } else if (number01 instanceof Double) {
            result = (Double) (number01.doubleValue() / number02.doubleValue());
        } else if (number01 instanceof Float) {
            result = (Float) (number01.floatValue() / number02.floatValue());
        } else if (number01 instanceof BigDecimal) {
            result = (BigDecimal) ((BigDecimal) number01).divide((BigDecimal) number02);
        }
        return result;
    }


}
