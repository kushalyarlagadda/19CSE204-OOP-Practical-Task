// Base class
class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

// Intermediate class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Derived class
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

// Main class
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // from Puppy
    }
}
