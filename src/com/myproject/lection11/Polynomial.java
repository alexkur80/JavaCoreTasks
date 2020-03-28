package com.myproject.lection11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * This class accepts Collection HashMap in and output polynomial in format:
 * 7+2x+4x^2+3x^3+x^6+4x^8=0
 */
public class Polynomial {

    public static String polynomial(Map<Integer, Integer> polynomial) {


        Map<Integer, Integer> mapValueFriquency = new HashMap<>();

        Iterator<Map.Entry<Integer, Integer>> iterator = polynomial.entrySet()
                .iterator();

        StringBuilder stringbuilder = new StringBuilder();
        while (iterator.hasNext()) {

            Map.Entry<Integer, Integer> pair = iterator.next();
            Integer keyPow = pair.getKey();
            Integer valueX = pair.getValue();
            stringbuilder.append(valueX)
                    .append("x^")
                    .append(keyPow)
                    .append("+");

        }
        stringbuilder.replace(stringbuilder.length() - 1, stringbuilder.length() + 2, "=0");

        String result = stringbuilder.toString();
        result = result.replaceAll("(1x)", "x");
        result = result.replaceAll("(x\\^0)", "");
        result = result.replaceAll("(x\\^1)", "x");


        return result;
    }
}

