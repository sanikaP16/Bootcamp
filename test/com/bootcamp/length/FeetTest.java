package com.bootcamp.length;

import com.bootcamp.probability.Probability;
import javafx.scene.control.IndexedCell;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FeetTest {
    @Test
    void getInches(){
        Feet feet = Feet.initFeet(1.0);
        Inches inch = feet.getInches();

        assertEquals(Inches.initInches(12.0),inch);
    }
    @Test
    void getInchesFor2Feet(){
        Feet feet = Feet.initFeet(2.0);
        Inches inch = feet.getInches();

        assertEquals(Inches.initInches(24.0),inch);
    }
    @Test
    void InvalidLength() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Feet.initFeet(0));
        assertEquals("Invalid Length", runtimeException.getMessage());

        assertThrows(RuntimeException.class, () -> Feet.initFeet(-6));
    }
}