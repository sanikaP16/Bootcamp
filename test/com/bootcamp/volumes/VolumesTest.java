package com.bootcamp.volumes;

import com.bootcamp.length.Inches;
import com.bootcamp.length.volumes.Volumes;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VolumesTest {
    @Test
    void check(){
        Volumes volumes = Volumes.validateVolume(1.0, 3.78);
        boolean result = volumes.areEqual();
        assert(result);
    }
    @Test
    void checkInvalidVolumes(){
        assertThrows(RuntimeException.class, () ->Volumes.validateVolume(0, 3.78 ));
    }

    @Test
    void checkWith2Liter(){
        Volumes volumes = Volumes.validateVolume(2, 7.56);
        boolean result = volumes.areEqual();
        assert(result);
    }
    @Test
    void checkWithNotEqual(){
        Volumes volumes = Volumes.validateVolume(1.5, 7.56);
        boolean result = volumes.areEqual();
        assertFalse(result);
    }

}