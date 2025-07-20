package Task_1;
import java.util.Scanner;
class ModifierDemo {
    public String publicVar;
    private String privateVar;
    public static String staticVar = "This is a static variable.";
    public ModifierDemo(String pub, String priv) {
        this.publicVar = pub;
        this.privateVar = priv;
    }
    public void showPrivateVar() {
        System.out.println("Accessed via method: " + this.privateVar);
    }
}

public class AccessExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for the public variable: ");
        String publicInput = input.nextLine();
        System.out.print("Enter a value for the private variable: ");
        String privateInput = input.nextLine();
        ModifierDemo demo = new ModifierDemo(publicInput, privateInput);
        System.out.println("Public variable: " + demo.publicVar);
        System.out.println("Attempting to access private variable...");
        demo.showPrivateVar(); 
        System.out.println("Static variable: " + ModifierDemo.staticVar);
        input.close();
    }
}