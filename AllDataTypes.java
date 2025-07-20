package Task_1;
import java.util.Scanner;
public class AllDataTypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a byte value (-128 to 127): ");
        byte byteVar = input.nextByte();
        System.out.print("Enter a short value (-32,768 to 32,767): ");
        short shortVar = input.nextShort();
        System.out.print("Enter an int value: ");
        int intVar = input.nextInt();
        System.out.print("Enter a long value: ");
        long longVar = input.nextLong();
        System.out.print("Enter a float value (e.g., 3.14): ");
        float floatVar = input.nextFloat();
        System.out.print("Enter a double value: ");
        double doubleVar = input.nextDouble();
        System.out.print("Enter a single character: ");
        char charVar = input.next().charAt(0);
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanVar = input.nextBoolean();
        input.nextLine(); 
        System.out.print("Enter a line of text (String): ");
        String stringVar = input.nextLine();
        System.out.println("\n--- You Entered ---");
        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Char: " + charVar);
        System.out.println("Boolean: " + booleanVar);
        System.out.println("String: " + stringVar);
        input.close();
    }
}
