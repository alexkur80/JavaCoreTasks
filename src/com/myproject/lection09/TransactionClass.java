package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;


public class TransactionClass {


   TransactionClass() {
ApplicationLogger.LOGGER.info("Default constructor");
    }

TransactionClass(int a, String b) {

    }

    @Transaction
    public static void transactionTesting() {
        ApplicationLogger.LOGGER.info("Transaction processing, please wait");
    }
}



