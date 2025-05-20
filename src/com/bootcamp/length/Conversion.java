package com.bootcamp.length;

public class Conversion {
    private final double length;
    private final String unit;

    public Conversion(double length, String unit) {
        this.length = length;
        this.unit = unit;
    }

    public static Conversion validateLength(double length, String unit) {
        return new Conversion(length,unit);
    }
}
