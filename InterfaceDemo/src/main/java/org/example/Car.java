package org.example;

public class Car implements ICar {
    private String vin;
    private int numSeats;
    private String color;
    private boolean isConvertible;


    public void setVin(String vin) {
        this.vin  = vin;
    }

    public String getVin() {
        return this.vin;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setIsConvertible(boolean isConvertible) {
        this.isConvertible = isConvertible;
    }

    public boolean getIsConvertible() {
        return this.isConvertible;
    }

    public String toString() {
        String info = "Vehicle Information \n";
        info += "\tVIN: " + this.getVin() + "\n";
        info += "\tColor: " + this.getColor() + "\n";
        info += "\tConvertible: " + this.getIsConvertible() + "\n";
        info += "\tSeats : " + this.getNumSeats() + "\n";
        return info;
    }

    public void makeEngineNoise() {
        System.out.println("Vrrrm");
    }
}
