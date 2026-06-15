package dev.erik.curso_java;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Triangle;

public class Program {

    public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();


		System.out.println("Enter the measures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Enter the measures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaXResult = Triangle.calculateArea(x.a, x.b, x.c);
		double areaYResult = Triangle.calculateArea(y.a, y.b, y.c);

		System.out.printf("Triangle X area: %.4f\n", areaXResult);
		System.out.printf("Triangle Y area: %.4f\n", areaYResult);
		System.out.println(Triangle.largestArea(areaXResult, areaYResult));

		sc.close();
	}
}