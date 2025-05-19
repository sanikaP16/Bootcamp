package com.bootcamp.length;

import java.util.Objects;

public class Inches {
    private final double inches;

    public Inches(double inches) {
        this.inches = inches;
    }

    public static Inches initInches(double inches) {
        if(inches<=0){
            throw new RuntimeException("Invalid Length");
        }
        return new Inches(inches);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Inches inches1 = (Inches) o;
        return Double.compare(inches, inches1.inches) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inches);
    }


    public Centimeter getCm() {
        return new Centimeter(this.inches *5);
    }
}
