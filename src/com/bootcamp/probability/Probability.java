package com.bootcamp.probability;

import java.util.Objects;

public class Probability {

    private final double chance;

    private Probability(double chance) {
        this.chance = chance;
    }

    public static Probability create(double chance) {
        if (chance > 1 || chance < 0) {
            throw new RuntimeException("Number of coins must be at least 1");
        }
        return new Probability(chance);
    }

    public double toPercentage() {
        return this.chance * 100;
    }

    public double compliment() {
        return (1 - this.chance) * 100;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public Probability and(Probability other) {
        double result = this.chance * other.chance;
        return Probability.create(result);
    }

    public Probability or(Probability other) {
        double result = (this.chance + other.chance) - (this.chance * other.chance);
        System.out.println(result);
        return  Probability.create(result);
    }
}
