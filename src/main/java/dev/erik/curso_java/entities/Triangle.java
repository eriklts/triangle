package dev.erik.curso_java.entities;

public class Triangle {

    public double a;
    public double c;
    public double b;

    public double area(){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p -a) * (p - b) * (p - c));
    }
    public static String largest(double areaX, double areaY){
        if(areaX > areaY){
            return "Larger area: X";
        }
        else {
            return "Larger area: Y";
        }
    }
}
