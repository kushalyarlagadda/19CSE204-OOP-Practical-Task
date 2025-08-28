class Student {
    String name;
    int age;

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
        System.out.println("Name: " + name);
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor_Overloading {
    public static void main(String[] args) {
        Student s1 = new Student("Goutham");
        Student s2 = new Student("Ketham", 21);
    }
}
