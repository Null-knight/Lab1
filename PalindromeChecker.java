import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int originalNum = num;
        int reversedNum = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num = num / 10;
        }

        // Check if palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome");
        }

        scanner.close();
    }
}