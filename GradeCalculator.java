// Aim: Write a program to print the corresponding grade for the given mark
        // using if..else statement in Java.

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's mark (e.g., 85): ");
        int mark = scanner.nextInt();
        scanner.close();

        char grade;

      
        if (mark >= 90) {
            grade = 'O'; // Assuming 'O' is for Outstanding/Excellent
        } else if (mark >= 80) {
            grade = 'E'; // Assuming 'E' is for Excellent
        } else if (mark >= 70) {
            grade = 'A'; // Assuming 'A' is for Very Good
        } else if (mark >= 60) {
            grade = 'B'; // Assuming 'B' is for Good
        } else if (mark >= 50) {
            grade = 'C'; // Assuming 'C' is for Average
        } else {
            grade = 'F'; // Anything below 50 is assumed to be Fail
        }

        System.out.println("The corresponding grade is: " + grade);
    }
}
