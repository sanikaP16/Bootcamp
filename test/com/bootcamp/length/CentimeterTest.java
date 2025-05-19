package com.bootcamp.length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void getMillimeter() {
        Centimeter cm = Centimeter.initCentimeter(1);
        Millimeter mm = cm.getMm();

        assertEquals(Millimeter.initMillimeter(10), mm);
//        assert(mm.areEqual(cm));
    }

    @Test
    void getMillimeterFor2Cm() {
        Centimeter cm = Centimeter.initCentimeter(2);
        Millimeter mm = cm.getMm();

        assertEquals(Millimeter.initMillimeter(20), mm);
    }

    @Test
    void InvalidLength() {
        RuntimeException runtimeException = assertThrows(RuntimeException.class, () -> Centimeter.initCentimeter(0));
        assertEquals("Invalid Length", runtimeException.getMessage());

        assertThrows(RuntimeException.class, () -> Centimeter.initCentimeter(-6));
    }


}