/**
 * This class for Testing: Serialize and deserialize.
 */

package com.myproject.lection16;

import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    private String brandName;
    private final String serial = "45186148988783"; // final is not affected by transient!!!
    private transient String OperatingSystem = "Linux";


    Notebook(String modelName, int memory, double price, Touchpad touchpad) {
        super(modelName, memory, price);
        this.brandName = touchpad.getBrandName();
    }

    @Override
    public String toString() {
        return "Super Notebook model " + getModelName() + " with DDR " + getMemory() + "Gb with touchpad " +
                brandName + " for fantastic price $" + getPrice() + " Serial #" + serial +
                " with installed Operating System " + OperatingSystem;
    }
}
