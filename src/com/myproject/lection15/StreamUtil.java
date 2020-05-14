package com.myproject.lection15;

import java.util.*;
import java.util.stream.Collectors;

public class StreamUtil {

    /**
     * Outputs numbers from List <Integer> that meets requirements: numInt % 2 != 0 && numInt % 5 == 0
     * It accepts List<Integer> to operate with numbers inside this List.
     *
     * @param intList Integer numbers
     * @return List<Integer> intList
     * @throws NoSuchElementException
     */
    public static double getAverageNotEvenDiv5(List<Integer> intList) throws NoSuchElementException {
        return intList.stream()
                .filter(Objects::nonNull)
                .filter(intNum -> intNum % 2 != 0 && intNum % 5 == 0)
                .mapToInt(intNum -> intNum)
                .average()
                .orElse(0);
    }

    /**
     * Counts numbers of unique elements in List
     * with length > 8 symbols
     *
     * @param stringList list with Strings
     * @return long number of elements meets requirements
     */
    public static long getUniqueLinesLonger8symbols(List<String> stringList) {
        int symbolsLength = 8;

        return stringList.stream()
                .filter(Objects::nonNull)
                .filter((line) -> line.length() > symbolsLength)
                .distinct()
                .count();
    }

    /**
     * Calculates sum of all elements which keys less then 7 symbols
     *
     * @return int sum of values from Map<String, Integer> which keys.length() < 7
     */
    public static int getSumMapKeysLonger7Symbols(Map<String, Integer> map) {
        int symbolsLength = 7;

        return map.entrySet()
                .stream()
                .filter(Objects::nonNull)
                .filter(key -> key.getKey()
                        .length() < symbolsLength)
                .map(value -> value.getValue())
                .reduce(0, (accumulator, value) -> accumulator + value);
    }

    /**
     * Concatenates from int to String
     *
     * @param intNum list of int numbers
     * @return Concatenated numbers: Ex: 1212134
     */
    public static String getNumberToString(List<Integer> intNum) {
        return intNum.stream()
                .filter(Objects::nonNull)
                .map(number -> number.toString())
                .collect(Collectors.joining(""));
    }

    /**
     * Gets full name of person name's length > 15
     *
     * @param personList List of object class Person
     * @return Full name of older person, who's full name not exceed 15 letters:
     */
    public static String getFullNameOlderAge(List<Person> personList) {
        return personList.stream()
                .filter(Objects::nonNull)
                .filter(person -> (person.getFirstName()
                        .length() + person.getLastName()
                        .length()) < 16)
                .max(Comparator.comparingInt(Person::getAge))
                .toString();
    }
}