/**
 * This class for Testing: Serialize and deserialize.
 */

package com.myproject.lection16;

import java.io.Serializable;

public class Computer implements Serializable {
    private String modelName;
    private int memory;
    private double price;

    public String getModelName() {
        return modelName;
    }

    public int getMemory() {
        return memory;
    }

    public double getPrice() {
        return price;
    }

    Computer(String modelName, int memory, double price) {
        this.modelName = modelName;
        this.memory = memory;
        this.price = price;


    }

    @Override
    public String toString() {
        return "Super computer model " + modelName + " with RAM " + memory + "Kb for fantastic price $" + price;

    }
}
