package com.realdolmen.refactoring.ex11;

public class Wings implements Flying {
    final double flightSpeedPerHour;
    double kmFlown = 0.0;

    public Wings(double flightSpeedPerHour) {
        this.flightSpeedPerHour = flightSpeedPerHour;
    }

    @Override
    public void fly(double km) {
        System.out.println("flying " + km + "km, will arrive in " + km / flightSpeedPerHour + " hours");
        kmFlown += km;
    }

    @Override
    public double getKmFlown() {
        return kmFlown;
    }
}