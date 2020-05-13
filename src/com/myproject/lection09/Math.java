package com.myproject.lection09;

import org.apache.log4j.Logger;

/**
 * Tests arithmetic operation with THE SAME TYPE numbers, extended from Numbers
 *
 * @param <T> The same type objects instanceof Number
 */
public class Math<T extends Number> {
    public final static Logger LOGGER = Logger.getLogger(Math.class);

    private T value01;
    private T value02;

    Math(T value01, T value02) {
        this.value01 = value01;
        this.value02 = value02;
    }

    /* Tests annotation @Deprecated */

    @Deprecated
    public T getValue01() {
        return value01;
    }

    @Deprecated
    public T getValue02() {
        return value02;
    }

    /* Tests annotation Transaction */

    @Transaction
    public static void transactionTesting() {
        LOGGER.info("Transaction #1 is processing, please wait");
    }

    @Transaction
    public static void transactionTesting2() {
        LOGGER.info("Transaction #2 is processing, please wait");
    }
}