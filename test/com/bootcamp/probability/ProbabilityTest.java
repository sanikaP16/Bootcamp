package com.bootcamp.probability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void probability() {
        Probability chance = Probability.create(0.25);
        assertEquals(25, chance.toPercentage());
    }

    @Test
    void probabilityForTwo() {
        Probability chance = Probability.create(0.75);

        assertEquals(75, chance.toPercentage());
    }

    @Test
    void probabilityForTwoCompliment() {
        Probability chance = Probability.create(0.75);
        Probability expected = Probability.create(0.25);
        assertEquals(expected.toPercentage(), chance.compliment());
    }

    @Test
    void probabilityForZero() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Probability.create(5));
        assertEquals("Number of coins must be at least 1", runtimeException.getMessage());
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

        assertEquals(expected,one.or(two));
    }
    @Test
        void probabilityOfGettingAtleastOne3() {
        Probability one = Probability.create(0.1);
        Probability two = Probability.create(0.2);
        Probability expected = Probability.create(0.28);

        assertEquals(expected,one.or(two));
    }

    @Test
        void probabilityOfGettingAtleastOne4() {
        Probability one = Probability.create(1);
        Probability two = Probability.create(1);
        Probability expected = Probability.create(1);

        assertEquals(expected,one.or(two));
    }


}