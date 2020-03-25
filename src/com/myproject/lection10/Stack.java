/**
 * This class realize 'Push' and  'Pop' methods.
 *
 * @author akurlovich
 * @version 03/25/2020
 */

package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class Stack {
    private int stackSize;
    private List<Integer> list;
    private int tailOfStack;
    private List<Integer> stackList;


    public Stack(int stackSize, List<Integer> list) {
        this.stackSize = stackSize;
        this.list = list;
        tailOfStack = -1;
        this.stackList = null;
    }


    public void setStackList(List<Integer> stackList) {
        this.stackList = stackList;
    }


    /**
     * This method realize Stack. It works with stack object so it shows OOP incapsulation.
     * Push stack realize by adding List collection elements from one collection to other.
     * tailOfStack = -1 which empty stack. This parameter is -1 first and creates with
     * 'new Stack' so we don't need make it in method.
     * tailOfStack = 0 points to the first stack element, which have index 0.
     * After every element added tailOfStack increments ++.
     * Moving through elements using tailOfStack.
     */
    public void push() {
        List<Integer> stackList = new ArrayList<>();

        ApplicationLogger.LOGGER.info("Preparing stack filling");
        ApplicationLogger.LOGGER.info("Stack pointer before adding: " + tailOfStack);
        ApplicationLogger.LOGGER.info("Stack size: " + list.size());
        ApplicationLogger.LOGGER.info("Filling stack started");

        for (int i = 0; i < list.size(); i++) {
            if (tailOfStack == (list.size() - 1)) {
                ApplicationLogger.LOGGER.info("Stack is full");
            } else {
                stackList.add(list.get(++tailOfStack));
                ApplicationLogger.LOGGER.info("Added number " + stackList.get(tailOfStack));
            }
        }
        ApplicationLogger.LOGGER.info("Amount of filled numbers: " + stackList.size());
        ApplicationLogger.LOGGER.info("Stack pointer after adding: " + tailOfStack);
        ApplicationLogger.LOGGER.info("Filling stack ended sucessfully");
        setStackList(stackList); // setting stackList in class variable so it can use used for 'pop' method.
    }


    /**
     * This method popping out numbers from stack.
     * It uses class variable : tailOfStack
     * it uses class List<Integer>  stackList which generating using Push method.
     *
     * After every element added tailOfStack increments ++.
     * Moving through elements using tailOfStack. *
     */
    public void pop() {
        ApplicationLogger.LOGGER.info("Preparing stack Popping out");
        ApplicationLogger.LOGGER.info("Stack pointer before popping out: " + tailOfStack);
        ApplicationLogger.LOGGER.info("Stack size: " + list.size());
        ApplicationLogger.LOGGER.info("Popping out stack started");

        for (int i = 0; i < stackList.size(); i++) {
            if (tailOfStack < 0) {
                ApplicationLogger.LOGGER.info("Stack is Empty");
            } else {
                ApplicationLogger.LOGGER.info("Popping out number " + stackList.get(tailOfStack--));

            }
        }
        ApplicationLogger.LOGGER.info("Popping out stack ended");

    }

}



