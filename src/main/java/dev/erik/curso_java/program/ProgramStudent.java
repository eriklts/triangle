package dev.erik.curso_java.program;

import java.util.Locale;
import java.util.Scanner;

import dev.erik.curso_java.entities.Student;

public class ProgramStudent {
      public static void main (String[] args){
       
      Locale.setDefault(Locale.US);
      Scanner sc = new Scanner(System.in);

      Student studant;
      studant = new Student();

      studant.name = sc.nextLine();
      studant.grade1 = sc.nextDouble();
      studant.grade2 = sc.nextDouble();
      studant.grade3 = sc.nextDouble();

      System.out.println("Final grade: " + studant.finalGrade());

      if (studant.finalGrade() < 60.00) {
        System.out.println("FAILED");
        System.out.printf("MISSING %.2f POINTS", studant.missingPoints());
      }
      else {
        System.out.println("PASS");
      }

      sc.close();
    }
}