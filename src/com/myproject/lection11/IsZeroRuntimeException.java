package com.myproject.lection11;

public class IsZeroRuntimeException extends RuntimeException {
    private String message;
    private int number;

    IsZeroRuntimeException() {
        this.message = " is ZERO, try another number";
        this.number = 0;
    }

    IsZeroRuntimeException(String message) {
        this.message = message;
        this.number = 0;
    }

    IsZeroRuntimeException(String message, int number) {
        this.message = message;
        this.number = number;
    }

    @Override
    public String toString() {
        String s1 = this.getClass()
                .getName();
        String s2 = ": " + number + message;
        return s1.concat(s2);

    }
}