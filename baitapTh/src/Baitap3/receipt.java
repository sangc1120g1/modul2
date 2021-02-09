package Baitap3;

import java.util.ArrayList;

public class receipt {
    private int oldElectricNumber;
    private int newElectricNumber;

    public int getOldElectricNumber() {
        return oldElectricNumber;
    }

    public void setOldElectricNumber(int oldElectricNumber) {
        this.oldElectricNumber = oldElectricNumber;
    }

    public int getNewElectricNumber() {
        return newElectricNumber;
    }

    public void setNewElectricNumber(int newElectricNumber) {
        this.newElectricNumber = newElectricNumber;
    }

    @Override
    public String toString() {
        return "receipt{" +
                "oldElectricNumber=" + oldElectricNumber +
                ", newElectricNumber=" + newElectricNumber +
                '}';
    }
}
