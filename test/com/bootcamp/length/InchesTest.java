package com.bootcamp.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchesTest {
    @Test
    void getCentimeter() {
        Inches inches = new Inches(1);
        Centimeter cm = inches.getCm();

        assertEquals(Centimeter.initCentimeter(5),cm);
    }
    @Test
    void getCentimeterFor2Inches() {
        Inches inches = new Inches(2);
        Centimeter cm = inches.getCm();

        assertEquals(Centimeter.initCentimeter(10),cm);
    }

    @Test
    void InvalidLength() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Inches.initInches(0));
        assertEquals("Invalid Length", runtimeException.getMessage());

        assertThrows(RuntimeException.class, () -> Inches.initInches(-6));
    }
}