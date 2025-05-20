package com.bootcamp.models;

import com.bootcamp.models.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void area() {
        Square square = new Square(4);
        int area = (int) square.area();
        assertEquals(16, area);
    }

    @Test
    void areaWith0() {
        Square square = new Square(0);
        int area = (int) square.area();
        assertEquals(0, area);
    }

    @Test
    void areaWithFloatNumbers() {
        Square square = new Square(4.5);
        double area = square.area();
        assertEquals(20.25, area);
    }

    @Test
    void perimeterWithIntegers() {
        Square square = new Square(4);
        double perimeter = square.perimeter();
        assertEquals(16, perimeter);
    }

    @Test
    void perimeterWithFloat() {
        Square square = new Square(4.2);
        double perimeter = square.perimeter();
        assertEquals(16.8, perimeter);
    }

    @Test
    void perimeterWithZero() {
        Square square = new Square(0);
        double perimeter = square.perimeter();
        assertEquals(0, perimeter);
    }
}