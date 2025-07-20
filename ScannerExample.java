package Task_1;
import java.util.Scanner; 

public class ScannerExample {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = inputReader.nextLine(); 
        System.out.println("Enter your age: ");
        int age = inputReader.nextInt(); 
        System.out.println("Enter your GPA: ");
        double gpa = inputReader.nextDouble(); 
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        inputReader.close();
    }
}