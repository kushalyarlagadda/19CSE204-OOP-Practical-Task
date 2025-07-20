package Task_1;
import java.util.Scanner;
public class ControlStatements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check if it's positive, negative, or zero: ");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println(num + " is positive.");
        } else if (num < 0) {
            System.out.println(num + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        System.out.print("\nEnter a day number (1-7): ");
        int day = input.nextInt();
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day."); 
        }
        System.out.print("\nEnter a limit to print numbers, skipping multiples of 3: ");
        int limit = input.nextInt();
        System.out.print("Numbers up to " + limit + " (skipping 3s): ");
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0) {
                continue; 
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("\nEnter numbers to sum. Enter 0 to stop.");
        int sum = 0;
        while (true) { 
            System.out.print("Enter a number: ");
            int currentNum = input.nextInt();
            if (currentNum == 0) {
                break;
            }
            sum += currentNum;
        }
        System.out.println("Total sum: " + sum);
        int secretPin;
        int attempts = 0;
        do {
            if (attempts > 0) {
                System.out.println("Incorrect PIN. Please try again.");
            }
            System.out.print("Enter the secret PIN (1234): ");
            secretPin = input.nextInt();
            attempts++;
        } while (secretPin != 1234);
        System.out.println("Access Granted!");
        input.close();
    }
}