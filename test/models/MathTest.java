package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathTest {

    @Test
    void add() {
        MyMath op = new MyMath(7,8);

        assertEquals(15, op.add());
    }
}