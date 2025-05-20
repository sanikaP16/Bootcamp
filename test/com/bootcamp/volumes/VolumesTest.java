package com.bootcamp.volumes;

import com.bootcamp.length.volumes.Volume;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumesTest {
    @Test
    void check(){
        Volume volumesFromGallon = Volume.convertFromGallon(1.0);
        Volume volumesFromLitters = Volume.convertFromLiters(3.78);

        assertEquals(volumesFromGallon,volumesFromLitters);
    }
    @Test
    void check2gallon(){
        Volume volumesFromGallon = Volume.convertFromGallon(2);
        Volume volumesFromLitters = Volume.convertFromLiters(7.56);

        assertEquals(volumesFromGallon,volumesFromLitters);
    }
//    @Test
//    void checkInvalidVolumes(){
//        assertThrows(RuntimeException.class, () -> Volume.validateVolume(0, 3.78 ));
//        assertThrows(RuntimeException.class, () -> Volume.validateVolume(10, -4 ));
//    }
//
//    @Test
//    void checkWith2Liter(){
//        Volume volumes = Volume.validateVolume(2, 7.56);
//        boolean result = volumes.areEqual();
//        assert(result);
//    }
//    @Test
//    void checkWithNotEqual(){
//        Volume volumes = Volume.validateVolume(1.5, 7.56);
//
//        boolean result = volumes.areEqual();
//        assertFalse(result);
//    }

}