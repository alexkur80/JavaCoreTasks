package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;


public class TMPTransactionClass {


   TMPTransactionClass() {
ApplicationLogger.LOGGER.info("Default constructor");
    }

TMPTransactionClass(int a, String b) {

    }

    @Transaction
    public static void transactionTesting() {
        ApplicationLogger.LOGGER.info("Transaction processing, please wait");
    }
}



