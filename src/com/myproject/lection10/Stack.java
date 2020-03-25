package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stack {

    ArrayList<Integer> stack = new ArrayList<>();


    public static void pushStack() throws IOException {
        int counter = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ApplicationLogger.LOGGER.info("Input numbers for stack usin SPACES to divide every number" +
                "but number will be ignored: ");
        String number = reader.readLine();
        Pattern pattern = Pattern.compile("\\b(\\d+)\\b");
        Matcher matcher = pattern.matcher(number);

        List<Integer> numbers3 = new ArrayList<>();

        System.out.println(number);


        while (matcher.find()) {

            String string = matcher.group()
                    .toString();
            numbers3.add(Integer.valueOf(string));
        }
        System.out.println("output");

        for (int i = 0; i< numbers3.size(); i++) {
            System.out.println(numbers3.get(i));
        }


    }


    public static void popStack() {
        int counter = 0;
    }
}
