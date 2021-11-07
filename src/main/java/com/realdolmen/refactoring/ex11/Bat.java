package com.realdolmen.refactoring.ex11;

public class Bat extends Animal implements Flying{

    private Wings wings;

    public Bat(double flightSpeedPerHour) {
        this.wings = new Wings(flightSpeedPerHour);
    }

    @Override
    public void fly(double km) {
        wings.fly(km);
    }

    @Override
    public double getKmFlown() {
        return wings.getKmFlown();
    }
}
