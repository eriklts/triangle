package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Triangle;

public class ProgramTriangle {

    public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Enter triangle X dimensure: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter triangle Y dimensure: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area triangle X: %.4f\n", areaX);
		System.out.printf("Area triangle Y: %.4f\n", areaY);
		System.out.println(Triangle.largest(areaX, areaY));
	}
}