package com.bootcamp.length;

import com.bootcamp.probability.Probability;

import java.util.Objects;

public class Length {
    private final double inches;

    private Length(double inches) {
        this.inches = inches;
    }

    public static Length convertFromFeet(double feet) {
        return new Length(feet * 12);
    }

    public static Length convertFromInches(double inches) {
        return new Length(inches);
    }

    public static Length convertFromCm(double centimeter) {
        return new Length(centimeter / 2.54);
    }

    public static Length convertFromMM(double mm) {
        return new Length(mm / 25.4);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Math.abs(inches - length.inches) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inches);
    }

    public Length add(Length length2) {
        double result = this.inches + length2.inches;
        return new Length(result);
    }
}
