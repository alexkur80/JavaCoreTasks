package com.myproject.lection10;

import com.myproject.utils.ApplicationLogger;

import java.util.*;

public class Stack {
    private int tailOfStack;
    int stackSize;
    List<Integer> list;
    List<Integer> stackList;


    public Stack(int stackSize, List<Integer> list) {
        this.stackSize = stackSize;
        this.list = list;
        this.stackList = null;
    }


    public int getTailOfStack() {
        return tailOfStack;
    }

    public void setTailOfStack(int tailOfStack) {
        this.tailOfStack = tailOfStack;
    }

    /**
     *
     */
    public void push() {
        List<Integer> stackList = new ArrayList<>();
        int tailOfStack = -1;
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
            setTailOfStack(tailOfStack);
        }
        ApplicationLogger.LOGGER.info("Amount of filled numbers: " + stackList.size());
        ApplicationLogger.LOGGER.info("Stack pointer after adding: " + tailOfStack);
        ApplicationLogger.LOGGER.info("Filling stack ended sucessfully");

/*
        for (int i = 0; i < stackList.size(); i++) {
            System.out.println(stackList.get(i));
        }*/


    }


    public void pop() {
        int tailOfStack = getTailOfStack();
        ApplicationLogger.LOGGER.info("Preparing stack Popping out");
        ApplicationLogger.LOGGER.info("Stack pointer before popping out: " + tailOfStack);
        ApplicationLogger.LOGGER.info("Stack size: " + list.size());
        ApplicationLogger.LOGGER.info("Filling stack started");

        for (int i = 0; i < list.size(); i++) {
            if (getTailOfStack() < 0) {
                ApplicationLogger.LOGGER.info("Stack is Empty");
            } else {
                ApplicationLogger.LOGGER.info("Popping out number " + list.get(tailOfStack--));

            }
        }
    }


    }

  /*  public void pop() {
        //   int number = 0;

        System.out.println("*********************tailOfStack in POP " + tailOfStack);

        if (tailOfStack < 0) {
            ApplicationLogger.LOGGER.info("Stack is Empty");
            // return 0;
        } else {
            //  return stackList.get(tailOfStack--);
            ApplicationLogger.LOGGER.info("Popping out number " + stacklist.add()stackList.get(tailOfStack--));

        }

    }*/



