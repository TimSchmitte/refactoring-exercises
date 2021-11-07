package com.realdolmen.refactoring.ex11;

public class Pigeon extends Animal implements Flying {

    private final Wings wings;

    public Pigeon(double flightSpeedPerHour) {
        this.wings  = new Wings(flightSpeedPerHour);
    }

    @Override
    public void fly(double km){
        wings.fly(km);
    }

    @Override
    public double getKmFlown() {
        return wings.getKmFlown();
    }

    public String getStomachContents() {
        return stomachContents;
    }
}
