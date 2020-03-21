package com.myproject.lection09;

import com.myproject.utils.ApplicationLogger;

public class Solution<T extends ClassForGenerics & InterfaceForGenerics> {
private T id;


Solution (T id)
{
    this.id = id;
}

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }
}
