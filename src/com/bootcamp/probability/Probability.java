package com.bootcamp.probability;

import java.util.Objects;

public class Probability {

    private final double chance;

    public Probability(double chance) {
        this.chance = chance;
    }

    public static Probability create(double chance) {
        if (chance > 1 || chance < 0) {
            throw new RuntimeException("Number of coins must be at least 1");
        }
        return new Probability(chance);
    }

    public double compliment() {
        return this.chance *100;
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

    public Probability and(Probability second) {
        double result = this.chance * second.chance;
        return Probability.create(result);
    }
}
