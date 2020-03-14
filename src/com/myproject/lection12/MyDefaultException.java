package com.myproject.lection12;

public class MyDefaultException extends Exception {
    private String message;

    MyDefaultException() {
    }

    MyDefaultException(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        String s1 = this.getClass()
                .getName();
        String s2 = ": " + message;
        return s1.concat(s2);
    }

}
