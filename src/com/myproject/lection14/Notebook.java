package com.myproject.lection14;

import java.io.Serializable;

/**
 * Serializes and deserializes.
 */
public class Notebook extends Computer implements Serializable {
    private String brandName;
    private final String SERIAL_NUMBER = "45186148988783"; // final is not affected by transient!!!
    private transient String OperatingSystem = "Linux";


    Notebook(String modelName, int memory, double price, TouchPad touchpad) {
        super(modelName, memory, price);
        this.brandName = touchpad.getBrandName();
    }

    @Override
    public String toString() {
        return "Super Notebook model " + getModelName() + " with DDR " + getMemory() + "Gb with touchpad " +
                brandName + " for fantastic price $" + getPrice() + " Serial #" + SERIAL_NUMBER +
                " with installed Operating System " + OperatingSystem;
    }
}