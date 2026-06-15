package dev.erik.curso_java.entities;

public class Triangle {

    public double a;
    public double b;
    public double c;

    
    public static double calculateArea(double a, double b, double c){
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static String largestArea(double areaX, double areaY){
		if (areaX > areaY){
			return "Larger area: X";
		}
		else {
			return "Larger area: Y";
		}
	}
}