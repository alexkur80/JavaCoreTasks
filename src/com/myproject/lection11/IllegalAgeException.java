/**
 * IllegalAgeException "CHECKED"
 * This class have constructor IllegalAgeException(String message, int age)
 *
 * @author Kurlovich Alexander
 * @version Lection12 Exceptions
 */

package com.myproject.lection11;

public class IllegalAgeException extends Exception {
    private String message;
    private int age;

    IllegalAgeException(String message, int age) {
        this.message = message;
        this.age = age;
    }

    @Override
    public String toString() {
        String s1 = this.getClass()
                .getName();
        String s2 = ": " + age + message;
        return s1.concat(s2);
    }
}