import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (0-100): ");
        int marks = scanner.nextInt();

        char grade;

        if (marks >= 90) {
            grade = 'O';
        } else if (marks >= 80) {
            grade = 'E';
        } else if (marks >= 70) {
            grade = 'A';
        } else if (marks >= 60) {
            grade = 'B';
        } else if (marks >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Your Grade: " + grade);
        scanner.close();
    }
}