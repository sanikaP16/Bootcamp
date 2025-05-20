package com.bootcamp.length;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void convertFormFeetToInches() {
        Length fromFeet = Length.convertFromFeet(1);
        Length fromInches = Length.convertFromInches(12);

        assertEquals(fromFeet, fromInches);
    }

    @Test
    void convertFromInchesToCm() {
        Length fromInches = Length.convertFromInches(1);
        Length formCm = Length.convertFromCm(2.54);

        assertEquals(fromInches, formCm);
    }

    @Test
    void convertFromCmToMM() {
        Length fromCM = Length.convertFromCm(1);
        Length fromMM = Length.convertFromMM(10);

        assertEquals(fromCM, fromMM);
    }

    @Test
    void addInches() {
        Length length1 = Length.convertFromInches(2);
        Length length2 = Length.convertFromInches(2);
        Length expected = Length.convertFromInches(4);

        assertEquals(expected, length1.add(length2));
    }

    @Test
    void addFeetAndInches() {
        Length length1 = Length.convertFromInches(12);
        Length length2 = Length.convertFromFeet(1);
        Length expected = Length.convertFromInches(24);

        assertEquals(expected, length1.add(length2));
    }

    @Test
    void addInchesAndCentimeter() {
        Length length1 = Length.convertFromInches(2);
        Length length2 = Length.convertFromCm(2.54);
        Length expected = Length.convertFromInches(3);

        assertEquals(expected, length1.add(length2));
    }

    @Test
    void addMmAndCentimeter() {
        Length length1 = Length.convertFromMM(20);
        Length length2 = Length.convertFromCm(10);
        Length expected = Length.convertFromInches(4.7244);

        assertEquals(expected, length1.add(length2));
    }
}