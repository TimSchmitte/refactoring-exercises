package com.realdolmen.refactoring.ex8;

public class Car extends Vehicle {
    private double trunkSize;

    public Car(String make, String model, int year, double trunkSize, int fuelCapacity, int currentFuel) {
        super(make, model, year, fuelCapacity, currentFuel);
        this.trunkSize = trunkSize;
    }


    public double getTrunkSize() {
        return trunkSize;
    }
}

