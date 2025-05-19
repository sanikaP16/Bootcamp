package models;

public class Math {
    private final int i;
    private final int j;

    public Math(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int add() {
        return this.i + this.j;
    }
}
