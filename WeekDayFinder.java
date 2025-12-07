// Write a program to print the week day for the given day no. of the current month using switch case statement

import java.util.Scanner;

public class WeekDayFinder {
    public static void main(String[] args) {
        int dayNumber;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day number (1-7): ");
        dayNumber = scanner.nextInt();

        switch (dayNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number entered");
                break;
        }
        
        scanner.close();
    }
}
