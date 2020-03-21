package com.myproject.lection09;

import java.math.BigDecimal;

public class MathUtil {

    public static <T extends Number> Number sumAB(Math<T> mathAB) {

        T number01 = mathAB.getValue01();
        T number02 = mathAB.getValue02();
        Number result = null;

        if (number01 instanceof Integer && number01 instanceof Integer) {
            result = (Integer) (number01.intValue() + number02.intValue());
        } else if (number01 instanceof Double && number02 instanceof Double) {
            result = (Double) (number01.doubleValue() + number02.doubleValue());
        } else if (number01 instanceof Float && number02 instanceof Float) {
            result = (Float) (number01.floatValue() + number02.floatValue());
        } else if (number01 instanceof BigDecimal && number02 instanceof BigDecimal) {
            result = (BigDecimal) ((BigDecimal) number01).add((BigDecimal) number02);
        }
        return result;
    }

}
