package com.bootcamp.length.volumes;

import java.util.Objects;

public class Volume {
    private static double gallon;
    private final double liter;

    private Volume(double liter) {
        this.liter = liter;
    }

    public static Volume convertFromLiters(double liters) {
        return new Volume(1 * liters);
    }

    public static Volume convertFromGallon(double gallon) {
        return new Volume(3.78 * gallon);
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
