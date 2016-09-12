package com.angelgomezsalazar.daggerexample.model;

/**
 * Created by angelgomez on 9/12/16.
 */
public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm += value;
    }

    public void brake() {
        rpm = 0;
    }

}
