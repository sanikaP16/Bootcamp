package com.bootcamp.models;

public class Square implements CalculableShape {
    public final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return this.side * this.side;
    }

    @Override
    public double perimeter() {
        return 4 * this.side;
    }
}
