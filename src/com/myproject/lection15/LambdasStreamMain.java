package com.myproject.lection15;

import org.apache.log4j.Logger;

import java.util.*;

public class LambdasStreamMain {
    private static Logger LOGGER = Logger.getLogger(LambdasStreamMain.class);

    public static void main(String[] args) {

        /* generates numbers that meets requirements: n % 2 != 0 && n % 5  == 0 */

        List<Integer> intNumbers = GenerateIntegerRandom3.randomInt(10, 50, 10);

        try {
            double average = StreamUtil.getAverageNotEvenDiv5(intNumbers);
            LOGGER.info("Average number of elements not even and divide 5 without residue:" + average);
        } catch (NoSuchElementException nse) {
            LOGGER.error("Error, no element meets requirements in List");
        }

        /* get number of unique elements (counter) from List with length > 8 symbols */

        List<String> stringList = Arrays.asList("I want to use the streams as above",
                "because at that point of usage doctors WithManyPatients",
                "because at that point of usage doctors WithManyPatients",
                "have a collection (as hashmap) of Doctors",
                "into a generic Hospital class",
                "into a generic Hospital class",
                "into a g");
        long counter = StreamUtil.getUniqueLinesLonger8symbols(stringList);
        LOGGER.info("Counter of unique numbers with length > 8 : " + counter);

        /* get sum of all elements in  Map<String, Integer> where key length < 7 */

        Map<String, Integer> map = new TreeMap<>();
        map.put("5into", 1);
        map.put("9Hospital", 2);
        map.put("6above", 3);
        map.put("8doctors", 4);
        map.put("5that", 5);
        map.put("4hat", 7);
        map.put("8tsdfhat", 7);

        int sum = StreamUtil.getSumMapKeysLonger7Symbols(map);
        LOGGER.info("Sum of all elements which keys less then 7 symbols: " + sum);

        /* gets symbol concatenation */

        List<Integer> intList = Arrays.asList(5, 2, 4, 2, 1, 1);
        String concat = StreamUtil.getNumberToString(intList);
        LOGGER.info("Concatenation int numbers:" + concat);

        /* get Full name of older person, who's full name don't exceeds 15 symbols */

        List<Person> agentList = Arrays.asList(
                new Person("Ivan", "Dunin", 95),
                new Person("Ivan", "Poddubniy", 93),
                new Person("Roger", "Gracie", 45),
                new Person("Braulio", "Estima", 29),
                new Person("Connon", "McGregor", 33),
                new Person("Hichegosebe", "Familiya", 30)
        );

        String fullName = StreamUtil.getFullNameOlderAge(agentList);
        LOGGER.info("Full name of older person, who's full name not exceed 15 letters:" + fullName);
    }
}