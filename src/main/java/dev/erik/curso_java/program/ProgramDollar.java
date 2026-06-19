package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.utils.CurrencyCoverter;

public class ProgramDollar {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the dollar price? ");
        double dollarPrice = sc.nextDouble();

        System.out.printf("How many dollars will be bought? ");
        double value = sc.nextDouble();

        double dollar = CurrencyCoverter.coverter(value, dollarPrice);

        System.out.printf("Amount to be paid in reais = %.2f", dollar);

    }
}
