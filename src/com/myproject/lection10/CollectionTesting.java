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

        Stack stack = new Stack(stackSize, numbersToStack);
        stack.push();
        stack.pop();

    }

}
