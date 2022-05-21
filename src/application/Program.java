package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = key.nextLine();

        System.out.print("Enter student registration: ");
        int registration = key.nextInt();

        System.out.print("Enter grade1: ");
        double grade1 = key.nextDouble();

        System.out.print("Enter grade2: ");
        double grade2 = key.nextDouble();

        System.out.print("Enter work note: ");
        double worknote = key.nextDouble();

        Students students = new Students(name, registration, grade1, grade2, worknote);

        System.out.println();
        System.out.println(students);
        System.out.println();

        if (students.average() < 7.0){
            System.out.println("FAILED");
            System.out.println("Missing " + String.format("%.2f",students.missingPoints()) + " points");
            System.out.println();
        } else {
            System.out.println("PASS!");
        }
    }
}
