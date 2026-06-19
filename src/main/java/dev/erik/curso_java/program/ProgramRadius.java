package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.utils.Calculator;

public class ProgramRadius {

       public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator x = new Calculator();

        System.out.print("Enter Radius: ");
        double radius = sc.nextDouble();

        double circum = Calculator.circumference(radius);
        double vol = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", circum);
        System.out.printf("Volume: %.2f\n", vol);
        System.out.printf("PI value: %.2f", Calculator.PI);

        sc.close();
    }
}
