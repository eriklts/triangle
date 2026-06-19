package dev.erik.curso_java.program;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Employee;

public class ProgramEmploiee {
     public static void main (String[] args){
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println();

        System.out.printf("Employee: " + employee.name + ", $ "+ employee.netSalary());

        System.out.print("\nWhich percentage to increse salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println();
        System.out.printf("Update data: " + employee.name + ", $ "+ employee.netSalary());
        
        sc.close();
    }
}
