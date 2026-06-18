package dev.erik.curso_java;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Radius;

public class ProgramRadius {

       public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Radius x = new Radius();

        System.out.print("Enter Radius: ");
        x.r = sc.nextDouble();

        System.out.printf("Circumference: %.2f", Radius.circumference(x.r));
        System.out.println();

        System.out.printf("Volume: %.2f", Radius.volume(x.r));
        System.out.println();

        System.out.printf("PI value: %.2f", Radius.PI);

        sc.close();
    }
}
