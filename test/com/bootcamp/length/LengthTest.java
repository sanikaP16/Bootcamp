package com.bootcamp.length;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LengthTest {
    @Test
    void convertFormFeetToInches(){
        Length fromFeet = Length.convertFromFeet(1);
        Length fromInches = Length.convertFromInches(12);

        assertEquals(fromFeet,fromInches);
    }

    @Test
    void convertFromInchesToCm(){
        Length fromInches = Length.convertFromInches(1);
        Length formCm = Length.convertFromCm(2.54);

        assertEquals(fromInches,formCm);
    }

    @Disabled
    @Test
    void convertFromCmToMM(){
        Length fromCM = Length.convertFromCm(1);
        Length fromMM = Length.convertFromMM(10);

        assertEquals(fromCM,fromMM);
    }
}