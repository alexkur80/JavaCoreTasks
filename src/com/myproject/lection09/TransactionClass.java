package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;


public class TransactionClass {

    @Transaction
    public static void transactionTesting() {
        ApplicationLogger.LOGGER.info("Transaction processing, please wait");
    }
}



