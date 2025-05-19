package models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void area() {
        Rectangle rectangle = new Rectangle(4, 6);
        int area = (int) rectangle.area();
        assertEquals(24, area);
    }

    @Test
    void areaWith0() {
        Rectangle rectangle = new Rectangle(0, 6);
        int area = (int) rectangle.area();
        assertEquals(0, area);
    }

    @Test
    void areaWithFloatNumbers() {
        Rectangle rectangle = new Rectangle(2.3, 16.5);
        double area = rectangle.area();
        assertEquals(37.94, area, 0.5);
    }

    @Test
    void perimeterWithIntegers() {
        Rectangle rectangle = new Rectangle(1, 2);
        double perimeter = rectangle.perimeter();
        assertEquals(6, perimeter);
    }

    @Test
    void perimeterWithFloat() {
        Rectangle rectangle = new Rectangle(1.5, 2.8);
        double perimeter = rectangle.perimeter();
        assertEquals(8.6, perimeter);
    }

    @Test
    void perimeterWithZero() {
        Rectangle rectangle = new Rectangle(1.5, 0);
        double perimeter = rectangle.perimeter();
        assertEquals(3, perimeter);
    }
}