package com.bootcamp.measurements;

import java.util.Objects;

public class Measurement {
    private final double inches;
    private final Unit unit;

    private Measurement(double inches, Unit unit) {
        this.inches = inches;
        this.unit = unit;
    }

    public static Measurement convertFromFeet(double feet, Unit unit) {
        return new Measurement(feet * 12, unit);
    }

    public static Measurement convertFromInches(double inches, Unit unit) {
        return new Measurement(inches, unit);
    }

    public static Measurement convertFromCm(double centimeter, Unit unit) {
        return new Measurement(centimeter / 2.54, unit);
    }

    public static Measurement convertFromMM(double mm, Unit unit) {
        return new Measurement(mm / 25.4, unit);
    }


    public static Measurement convertFromGallon(double gallon) {
        return getVolumes(3.78, gallon);
    }

    public static Measurement convertFromLiters(double liters) {
        return getVolumes(1, liters);
    }

    private static Measurement getVolumes(double a, double unit) {
        if (unit <= 0) {
            throw new RuntimeException("Invalid Volume");
        }
        return new Measurement(a * unit, Unit.LITER);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Measurement length = (Measurement) o;
        return Math.abs(inches - length.inches) < 0.0001;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(inches);
    }

    public Measurement add(Measurement length2) {
        double result = this.inches + length2.inches;
        return new Measurement(result, unit);
    }
}
