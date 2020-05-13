package com.myproject.lection10;

import org.apache.log4j.Logger;

import java.util.*;

public class Students {
    public final static Logger LOGGER = Logger.getLogger(Students.class);

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Fills List with ListIterator by random marks and after delete not good marks (<6).
     * Outputs in LOGGER MAX mark
     */
    public static void studentMarks() {
        List<Integer> studentMarks = new LinkedList<>();
        ListIterator<Integer> iterator = studentMarks.listIterator();
        Random rnd = new Random();

        int numberOfMarks = 10;                        // number of marks
        for (int i = 0; i < numberOfMarks; i++) {
            int mark = rnd.nextInt(10) + 1;     // marks from 1 to 10
            iterator.add(mark);
        }

        LOGGER.info("Number of marks: " + studentMarks.size());

        int maxMark = studentMarks.get(0);                     // first mars is maximal
        for (int i = 0; i < studentMarks.size(); i++) {
            LOGGER.info("Student mark0" + i + "=" + studentMarks.get(i));
            if (maxMark < studentMarks.get(i)) {
                maxMark = studentMarks.get(i);
            }
        }
        LOGGER.info("Maximum student mark is " + maxMark);

        int markBad =6;
        int mark;
        iterator = studentMarks.listIterator();
        while (iterator.hasNext()) {
            mark = iterator.next();
            if (mark < markBad) {
                iterator.remove();
            }
        }

        LOGGER.info("Marks after removing bad " + studentMarks.size());

        for (Integer marks : studentMarks) {
            LOGGER.info(marks);
        }
    }

    /**
     * Outputs students in ascending and descending more, using two variants.
     * First - using cycle,
     * Second - using iterator
     */
    public static void studentList() {
        List<String> studentName = new LinkedList<>() {
            {
                add("Vasiliy");
                add("Gregory");
                add("Vitaly");
                add("Innokenty");
                add("Valera");
                add("Marfa");
                add("Polina");
                add("Venera");
                add("Andrey");
            }
        };

        LOGGER.info("Student's name in ascending mode, cycle output");

        for (int i = 0; i < studentName.size(); i++) {
            LOGGER.info("Name #" + i + " " + studentName.get(i));
        }

        Collections.reverse(studentName);

        LOGGER.info("Students name in descending mode, cycle output");
        for (int i = 0; i < studentName.size(); i++) {
            LOGGER.info("Name #" + i + " " + studentName.get(i));
        }

        LOGGER.info("Students name in ascending mode, iterator  output");

        ListIterator<String> iterator = studentName.listIterator();
        int counterAscending = 0;
        while (iterator.hasNext()) {
            String next = iterator.next();
            LOGGER.info("Name #" + counterAscending + " " + next);
            counterAscending++;
        }

        LOGGER.info("Students name in descending mode, iterator  output");
        int counterDescending = 0;
        while (iterator.hasPrevious()) {
            String previous = iterator.previous();
            LOGGER.info("Name #" + counterDescending + " " + previous);
            counterDescending++;
        }
    }
}