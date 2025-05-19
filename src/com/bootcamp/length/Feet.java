package com.bootcamp.length;

public class Feet {


    private final double feet;

    private Feet(double feet) {
        this.feet = feet;
    }

    public static Feet initFeet(double feet) {
        if(feet<=0){
            throw new RuntimeException("Invalid Length");
        }
       return new Feet(feet);
    }

    public Inches getInches() {
        return Inches.initInches(this.feet * 12);
    }
}
