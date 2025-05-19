package com.bootcamp.length;

import java.util.Objects;

public class Millimeter {
    private final double mm;

    public Millimeter(double mm) {
        this.mm = mm;
    }

    public static Millimeter initMillimeter(double mm) {
        if(mm<=0){
            throw new RuntimeException("Invalid Length");
        }
        return new Millimeter(mm);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Millimeter millimeter = (Millimeter) o;
        return Double.compare(mm, millimeter.mm) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(mm);
    }

//    public boolean areEqual(Centimeter cm) {
//        System.out.println(this.mm);
//        System.out.println(cm.);
//        return false;
//    }
}
