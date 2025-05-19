package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void probability() {
        Probability chance = Probability.create(0.25);
        Probability expected = Probability.create(0.25);

        assertEquals(expected, chance);
    }

    @Test
    void probabilityForTwo() {
        Probability chance = Probability.create(0.75);
        Probability expected = Probability.create(0.75);
        assertEquals(expected.toPercentage(), chance.toPercentage());
    }

    @Test
    void probabilityForTwoCompliment() {
        Probability chance = Probability.create(0.75);
        Probability expected = Probability.create(0.25);
        assertEquals(expected.toPercentage(), chance.compliment());
    }

    @Test
    void probabilityForInvalidNumbers() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Probability.create(5));
        assertEquals("Number of coins must be at least 1", runtimeException.getMessage());
        assertThrows(RuntimeException.class, () -> Probability.create(-0.1));
    }

    @Test
    void multipleProbabilities() {
        Probability one = Probability.create(0.5);
        Probability two = Probability.create(0.5);
        Probability expected = Probability.create(0.25);

        assertEquals(expected, one.and(two));
    }

    @Test
    void probabilityOfGettingAtleastOne() {
        Probability one = Probability.create(0.5);
        Probability two = Probability.create(0.5);
        Probability expected = Probability.create(0.75);

        assertEquals(expected, one.or(two));
    }

    @Test
    void probabilityOfGettingAtleastOne2() {
        Probability one = Probability.create(0.8);
        Probability two = Probability.create(0.8);
        Probability expected = Probability.create(0.96);

        assertEquals(expected, one.or(two));
    }

    @Test
    void probabilityOfGettingAtleastOne3() {
        Probability one = Probability.create(0.1);
        Probability two = Probability.create(0.2);
        Probability expected = Probability.create(0.28);

        assertEquals(expected, one.or(two));
    }

    @Test
    void probabilityOfGettingAtleastOne4() {
        Probability one = Probability.create(1);
        Probability two = Probability.create(1);
        Probability expected = Probability.create(1);

        assertEquals(expected, one.or(two));
    }
}