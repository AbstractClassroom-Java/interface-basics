package org.example;

public interface ICar {
    void setVin(String vin);
    String getVin();
    void setNumSeats(int numSeats);
    int getNumSeats();
    void setColor(String color);
    String getColor();
    void setIsConvertible(boolean isConvertible);
    boolean getIsConvertible();
    String toString();
}
