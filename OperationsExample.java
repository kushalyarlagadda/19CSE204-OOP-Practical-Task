package Task_1;
import java.util.Scanner; 
public class OperationsExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Arithmetic Operations ---");
        System.out.print("Enter first integer (a): ");
        int a = input.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = input.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); 
        System.out.println("a % b = " + (a % b)); 
        System.out.println("\n--- Logical Operations ---");
        System.out.print("Enter first boolean (true/false): ");
        boolean p = input.nextBoolean();
        System.out.print("Enter second boolean (true/false): ");
        boolean q = input.nextBoolean();
        System.out.println("p && q (AND): " + (p && q));
        System.out.println("p || q (OR): " + (p || q));
        System.out.println("!p (NOT): " + (!p));

        input.close();
    }
}