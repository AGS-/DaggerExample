package com.angelgomezsalazar.daggerexample.model;

import javax.inject.Inject;

/**
 * Created by angelgomez on 9/12/16.
 */
public class Vehicle {

    // Dependent class, it's dependent on Motor

    private Motor motor;

    // @Inject annotation request a dependency, in this case Motor
    @Inject
    public Vehicle (Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }

}
