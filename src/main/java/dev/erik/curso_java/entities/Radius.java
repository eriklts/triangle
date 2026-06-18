package dev.erik.curso_java.entities;

public class Radius {

    public double r;
    public static final double PI = 3.14;

    public static double circumference(double r){
        return 2 * PI * r;
    }

    public static double volume(double r){
        return (4.0 / 3.0) * PI * Math.pow(r, 3);
    }

}
