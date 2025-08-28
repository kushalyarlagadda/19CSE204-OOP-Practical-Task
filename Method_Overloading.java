class MathOperations {
    // method with 2 int parameters
    int add(int a, int b) {
        return a + b;
    }

    // method with 3 int parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method with 2 double parameters
    double add(double a, double b) {
        return a + b;
    }
}

public class Method_Overloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        System.out.println(m.add(2, 3));          // 5
        System.out.println(m.add(1, 2, 3));       // 6
        System.out.println(m.add(2.5, 3.5));      // 6.0
    }
}
