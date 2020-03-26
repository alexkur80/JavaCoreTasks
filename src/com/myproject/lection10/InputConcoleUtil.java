package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputConcoleUtil {

    /**
     * This Utilite Method accepts input numbers from console, then uses RegEx parsing line and
     * extract numbers. Then put all numbers in 'List' collection and return.
     * <p>
     * Numbers should be typed using 'SPACE' to divide numbers from each other, numbers+letters or
     * only letters ignores.
     *
     * @return List Collection of numbers typed in console.
     * @throws IOException
     */
    public static List<Integer> inputNumbersFromConcole() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ApplicationLogger.LOGGER.info("Input numbers for input using SPACES to divide every number" +
                "but number will be ignored: ");

        String number = reader.readLine();
        Pattern pattern = Pattern.compile("\\b(\\d+)\\b");
        Matcher matcher = pattern.matcher(number);

        List<Integer> input = new ArrayList<>();

        while (matcher.find()) {

            String string = matcher.group()
                    .toString();
            input.add(Integer.valueOf(string));
        }

        return input;
    }

}
