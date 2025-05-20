package com.bootcamp.measurements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MeasurementTest {
    @Test
    void convertFormFeetToInches() {
        Measurement fromFeet = Measurement.convertFromFeet(1, Unit.FOOT);
        Measurement fromInches = Measurement.convertFromInches(12, Unit.INCH);

        assertEquals(fromFeet, fromInches);
    }

    @Test
    void convertFromInchesToCm() {
        Measurement fromInches = Measurement.convertFromInches(1, Unit.INCH);
        Measurement formCm = Measurement.convertFromCm(2.54, Unit.CM);

        assertEquals(fromInches, formCm);
    }

    @Test
    void convertFromCmToMM() {
        Measurement fromCM = Measurement.convertFromCm(1, Unit.CM);
        Measurement fromMM = Measurement.convertFromMM(10, Unit.MM);

        assertEquals(fromCM, fromMM);
    }

    @Test
    void addInches() {
        Measurement length1 = Measurement.convertFromInches(2, Unit.INCH);
        Measurement length2 = Measurement.convertFromInches(2, Unit.INCH);
        Measurement expected = Measurement.convertFromInches(4, Unit.INCH);

        assertEquals(expected, length1.add(length2));
    }

    @Test
    void addFeetAndInches() {
        Measurement length1 = Measurement.convertFromInches(12, Unit.INCH);
        Measurement length2 = Measurement.convertFromFeet(1, Unit.FOOT);
        Measurement expected = Measurement.convertFromInches(24, Unit.INCH);

        assertEquals(expected, length1.add(length2));
    }

    @Test
    void addInchesAndCentimeter() {
        Measurement length1 = Measurement.convertFromInches(2, Unit.INCH);
        Measurement length2 = Measurement.convertFromCm(2.54, Unit.CM);
        Measurement expected = Measurement.convertFromInches(3, Unit.INCH);

        assertEquals(expected, length1.add(length2));
    }

    @Test
    void addMmAndCentimeter() {
        Measurement length1 = Measurement.convertFromMM(20, Unit.MM);
        Measurement length2 = Measurement.convertFromCm(10, Unit.CM);
        Measurement expected = Measurement.convertFromInches(4.7244, Unit.INCH);

        assertEquals(expected, length1.add(length2));
    }


    @Test
    void check() {
        Measurement volumesFromGallon = Measurement.convertFromGallon(1.0);
        Measurement volumesFromLitters = Measurement.convertFromLiters(3.78);

        assertEquals(volumesFromGallon, volumesFromLitters);
    }

    @Test
    void check2gallon() {
        Measurement volumesFromGallon = Measurement.convertFromGallon(2);
        Measurement volumesFromLitters = Measurement.convertFromLiters(7.56);

        assertEquals(volumesFromGallon, volumesFromLitters);
    }

    @Test
    void checkInvalidVolumes() {
        assertThrows(RuntimeException.class, () -> Measurement.convertFromGallon(-8));
        assertThrows(RuntimeException.class, () -> Measurement.convertFromLiters(-4));
    }

    @Test
    void addGallonAndLiter() {
        Measurement length1 = Measurement.convertFromMM(20, Unit.MM);
        Measurement length2 = Measurement.convertFromCm(10, Unit.CM);
        Measurement expected = Measurement.convertFromInches(4.7244, Unit.INCH);

        assertEquals(expected, length1.add(length2));
    }
}