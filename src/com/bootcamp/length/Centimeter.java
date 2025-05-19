package com.bootcamp.length;

import java.util.Objects;

public class Centimeter {

    private final double cm;

    Centimeter(double cm) {
        this.cm = cm;
    }

    public static Centimeter initCentimeter(double cm) {
        if(cm<=0){
            throw new RuntimeException("Invalid Length");
        }
        return new Centimeter(cm);
    }

    public Millimeter getMm(){
        return Millimeter.initMillimeter(cm*10);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Centimeter that = (Centimeter) o;
        return Double.compare(cm, that.cm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cm);
    }
}
