package com.myproject.lection10;

import org.apache.log4j.Logger;

import java.util.*;

/**
 * Organises Push and Pop stack methods
 */
public class Stack {
    public final static Logger LOGGER = Logger.getLogger(Stack.class);

    private int stackSizeInitialize;
    private List<Integer> list;
    private int tailOfStack;
    private List<Integer> stackList = new ArrayList<>(0);


    public Stack(int stackSizeInitialize, List<Integer> list) {
        this.stackSizeInitialize = stackSizeInitialize;
        this.list = list;
        tailOfStack = -1;
    }

    public void setStackList(List<Integer> stackList) {
        this.stackList = stackList;
    }

    /**
     * Pushes in stack.
     * Push stack realize by adding List collection elements from one collection to other.
     * tailOfStack = -1 which empty stack. This parameter is -1 first and creates with
     * 'new Stack' so we don't need make it in method.
     * tailOfStack = 0 points to the first stack element, which have index 0.
     * After every element added tailOfStack increments ++.
     * Moving through elements using tailOfStack.
     */
    public void push() {
        List<Integer> stackList = new ArrayList<>(0);

        LOGGER.info("Preparing stack filling");
        LOGGER.info("Stack pointer before adding: " + tailOfStack);
        LOGGER.info("Stack size: " + list.size());
        LOGGER.info("Filling stack started");

        for (int i = 0; i < list.size(); i++) {
            if (tailOfStack == (list.size() - 1)) {
                LOGGER.info("Stack is full");
            } else {
                stackList.add(list.get(++tailOfStack));
                LOGGER.info("Added number " + stackList.get(tailOfStack));
            }
        }
        LOGGER.info("Amount of filled numbers: " + stackList.size());
        LOGGER.info("Stack pointer after adding: " + tailOfStack);
        LOGGER.info("Filling stack ended sucessfully");
        setStackList(stackList);       // setting stackList in class variable so it can use used for 'pop' method.
    }


    /**
     * Pops out from stack.
     * tailOfStack = -1  stack is empty
     * it uses class List<Integer>  stackList which generating using Push method.
     * <p>
     * After every element added tailOfStack increments ++.
     * Moving through elements using tailOfStack.
     */
    public void pop() {
        LOGGER.info("Preparing stack Popping out");
        LOGGER.info("Stack pointer before popping out: " + tailOfStack);
        LOGGER.info("Stack size: " + list.size());
        LOGGER.info("Popping out stack started");

        for (int i = 0; i < stackList.size(); i++) {
            if (tailOfStack < 0) {
                LOGGER.info("Stack is Empty");
            } else {
                LOGGER.info("Popping out number " + stackList.get(tailOfStack--));
            }
        }
        LOGGER.info("Popping out stack ended");
    }
}