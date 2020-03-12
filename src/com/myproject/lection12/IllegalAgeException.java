package com.myproject.lection12;

import com.myproject.utils.ApplicationLogger;

class IllegalAgeException extends Exception {
    int age;

    IllegalAgeException(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        String s1 = this.getClass()
                .getName();
        String s2 = " : Age " + age + " is not possible for human race";
        return s1.concat(s2);

    }

    @Override
    public String getMessage() {

        String s = " Age " + age + " is not possible for human race";
        return s;
    }
}