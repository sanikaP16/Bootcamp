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
    @Test
    void checkInvalidVolumes(){
        assertThrows(RuntimeException.class, () -> Volume.convertFromGallon(-8 ));
        assertThrows(RuntimeException.class, () -> Volume.convertFromLiters( -4 ));
    }
}