package com.myproject.lection06;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
    private T id;

    Solution(T id) {
        this.id = id;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}