package com.bootcamp.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConversionTest {
    @Test
    void convertFeetToMM(){
        Conversion conversion = Conversion.validateLength(12, "feet");
    }
}