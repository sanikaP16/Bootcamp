package com.bootcamp.length.volumes;

public class Volumes {
    private final double volume1;
    private final double volume2;

    private Volumes(double volume1, double volume2) {
        this.volume1 = volume1;
        this.volume2 = volume2;
    }


    public static Volumes validateVolume(double v, double v1) {
        if (v <= 0 || v1 <= 0) {
            throw new RuntimeException("Invalid volume");
        }

        return new Volumes(v, v1);
    }

    public boolean areEqual() {
        double volumeInLiters = this.volume1 * 3.78;
        return volume2 == volumeInLiters;
    }
}
