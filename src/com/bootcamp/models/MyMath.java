package com.bootcamp.models;

public class MyMath {
    private final int i;
    private final int j;

    public MyMath(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int add() {
        return this.i + this.j;
    }
}
