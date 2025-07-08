// An abstract class is a class that cannot be instantiated and may contain abstract (unimplemented) methods.

// 1. Used to define common behavior for a group of subclasses.

// 2. Helps in runtime polymorphism by referring to subclass objects via superclass references.

abstract class  Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound {
        System.out.println("Barks");
    }
}

