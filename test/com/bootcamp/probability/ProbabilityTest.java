package com.bootcamp.probability;

import models.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void probability() {
        Probability chance = Probability.create(0.25);
        assertEquals(25, chance.compliment());
    }

    @Test
    void probabilityForTwo() {
        Probability chance = Probability.create(0.75);
        assertEquals(75, chance.compliment());
    }

    @Test
    void probabilityForZero() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Probability.create(5));
        assertEquals("Number of coins must be at least 1",runtimeException.getMessage());
    }

    @Test
    void multipleProbabilities() {
        Probability one = Probability.create(0.5);
        Probability two = Probability.create(0.5);
        Probability expected = Probability.create(0.25);

        assertEquals(expected, one.and(two));
    }
}