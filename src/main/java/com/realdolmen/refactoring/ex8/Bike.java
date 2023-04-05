package com.realdolmen.refactoring.ex8;

public class Bike extends Vehicle {
    public Bike(String make, String model, int year) {
        super(make, model, year);
    }

    @Override
    public void accelerate() {
        System.out.println("accelerating");
    }
}
