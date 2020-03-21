package com.myproject.lection09;

import java.math.BigDecimal;

public class Math<T extends Number> {
    private T value01;
    private T value02;

    Math(T value01, T value02) {
        this.value01 = value01;
        this.value02 = value02;
    }

    public T getValue01() {
        return value01;
    }

    public T getValue02() {
        return value02;

    }


}
