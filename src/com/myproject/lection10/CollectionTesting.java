package com.myproject.lection10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionTesting {
    public static void main(String[] args) throws IOException {

        UtilsCollection.studentMarks();
        UtilsCollection.student();

        List<Integer> numbersToStack;
        numbersToStack = InputConcoleUtil.inputNumbersFromConcole();
        int stackSize = numbersToStack.size();

/*
        System.out.println("Stack size is:" + stackSize);
        for (int i = 0; i < stackSize; i++) {
            System.out.println("numbersToStack values" + numbersToStack.get(i));
        }*/

        Stack stack = new Stack(stackSize, numbersToStack);
        stack.push();
        stack.pop();


/*        System.out.println("Popping out of stack process started:");
        for (int i = 0; i < stackSize; i++) {
            //  System.out.println("Popping number" + stack.pop() + " from stack");
            //System.out.println("TOS = " + stack.getTailOfStack());
            stack.pop();
            System.out.println("numbersToStack.size()" + numbersToStack.size());
        }
        System.out.println("Popping out of stack process ended:");


        System.out.println("TOS=" + stack.getTailOfStack());*/

    }

}
