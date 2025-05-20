package com.bootcamp.measurements;

import java.util.Objects;

public class Volume {
    private final double liter;

    private Volume(double liter) {
        this.liter = liter;
    }

    public static Volume convertFromLiters(double liters) {
        return getVolumes(1, liters);
    }

    private static Volume getVolumes(double a, double unit) {
        if (unit <= 0) {
            throw new RuntimeException("Invalid Volume");
        }
        return new Volume(a * unit);
    }

    public static Volume convertFromGallon(double gallon) {
        return getVolumes(3.78, gallon);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(liter, volume.liter) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(liter);
    }
}
