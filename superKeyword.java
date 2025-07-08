// The super keyword refers to the parent class object.

// Uses:

// 1. To access superclass methods and constructors.

// 2. To call the superclass constructor explicitly.


class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

}

class Dog extends Animal {
    void sound() {
        super.sound(); // Calls parent method
        System.out.println("Dog barks");
    }
}