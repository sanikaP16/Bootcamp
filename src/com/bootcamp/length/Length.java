package com.bootcamp.length;

import com.bootcamp.probability.Probability;

public class Length {
    private final double feet;
    private final double inches;

    private Length(double feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public  static Length init(double feet, double inches){
        if (feet > 0 || inches < 0) {
            throw new RuntimeException("Invalid Lengths");
        }
        return new Length(feet,inches);
    }

}
