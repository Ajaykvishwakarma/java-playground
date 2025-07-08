// Inheritance is a mechanism where a child class acquires properties and behaviors (methods and fields) of a parent class.

// Promotes code reusability.

// Uses the extends keyword.

class Animal {
    void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}



//  Polymorphism
// Polymorphism means "many forms". It allows an object to behave differently based on its type or context.

// There are two types:

// Compile-time (Method Overloading)

// Runtime (Method Overriding)

// Example (Runtime Polymorphism):


class Animal {
    void sound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    void sound() { System.out.println("Dog barks"); }
}
public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.sound(); // Outputs "Dog barks"
    }
}
