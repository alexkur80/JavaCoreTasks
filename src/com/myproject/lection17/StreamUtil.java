package com.myproject.lection17;

import org.apache.log4j.Logger;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This method output numbers from List <Integer> that meets requirements: numInt % 2 != 0 && numInt % 5 == 0
 * It accepts List<Integer> with operate with numbers inside this List.
 */
public class StreamUtil {
    private static Logger LOGGER = Logger.getLogger(StreamUtil.class);

    public static double getAverageNotEvenDiv5(List<Integer> intList) throws NoSuchElementException {
        return intList.stream()
                .filter(Objects::nonNull)
                .filter(intNum -> intNum % 2 != 0 && intNum % 5 == 0)
                .mapToInt(intNum -> intNum)
                .average()
                .orElse(0);
    }

    /**
     * This method use streams to count numbers of unique elements in List
     * with length > 8 symbols
     *
     * @param stringList list with Strings
     * @return counter
     */
    public static long getUniqueLinesLonger8symbols(List<String> stringList) {
        return stringList.stream()
                .filter(Objects::nonNull)
                .filter((line) -> line.length() > 8)
                .distinct()
                .count();
    }

    /**
     * This method calculate sum of all elements which keys less then 7 symbols
     *
     * @return int sum of values from Map<String, Integer> which keys.length() < 7
     */
    public static int getSumMapKeysLonger7Symbols(Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .filter(Objects::nonNull)
                .filter(key -> key.getKey()
                        .length() < 7)
                .map(value -> value.getValue())
                .reduce(0, (accumulator, value) -> accumulator + value);
    }

    /**
     * This method makes concatenation from int to String
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