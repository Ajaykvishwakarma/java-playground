// What is an Interface? Show Implementation with Example
// An interface in Java is a reference type that can contain only constants, method signatures, default methods, static methods, and nested types. It is used to achieve abstraction and multiple inheritance.

interface Animal {
    void makeSound();
}

class Main implements Animal {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        Main dog = new Main(); 
        dog.makeSound();       
    }

    public void makeSound() {
        System.out.println("Barks");
    }
}
