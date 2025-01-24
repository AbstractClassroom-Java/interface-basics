package org.example;

public class Main {
    public static void main(String[] args) {
        Car myJeep = new Car();
        myJeep.setColor("orange");
        myJeep.setIsConvertible(true);
        myJeep.setVin("TITITITSKSKKGNALALKJASFLKJAEF");
        myJeep.setNumSeats(5);
        System.out.println(myJeep);
        myJeep.makeEngineNoise();

    }
}