import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day number (1-31): ");
        int dayNumber = scanner.nextInt();

        // Assuming 1st of month is Sunday for this example
        int weekdayNumber = dayNumber % 7;

        switch (weekdayNumber) {
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
            case 0:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
        }

        scanner.close();
    }
}