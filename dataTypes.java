// Integer: byte, short, int, long.
// Floating-Point: float, double.

int count = 100;
long distance = 123456789L;
float pi = 3.14f;
double e = 2.71828;


// Character Type: Stores a single Unicode character (char).
// Boolean Type: Stores true or false (boolean).

char letter = 'J';
boolean isValid = false;

// Class 

class Car {
    String model;
    int speed;
    void drive() {
        System.out.println(model + "  is driving at"+ speed + "km/h" )
    }
}


// Object 
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Toyota";
        car.speed = 100;
        car.drive();
    }
}


// Static Methods 
class MathUtils {
    static int square(int x) {
        return x * x;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(5)); // Outputs: 25
    }
}


// Constructor 
// : A constructor is a special method used to initialize objects when they are created, having the same name as the class and no return type.
class Book {
    String title;
    Book(String title) { // Parameterized constructor
        this.title = title;
    }
}
public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java Programming");
        System.out.println(book.title); // Outputs: Java Programming
    }
}



// Using Objects as Parameters 
class Point {
    int x, y;
    void move(Point p, int dx, int dy) {
        p.x += dx;
        p.y += dy;
    }
}
public class Main {
    public static void main(String[] args) {
        Point p = new Point();
        p.x = 10; p.y = 20;
        p.move(p, 5, 5);
        System.out.println(p.x + ", " + p.y); // Outputs: 15, 25
    }
}



// Method overloading 
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}



// Access Control 
// public: Accessible everywhere.
// protected: Accessible in the same package and subclasses.
// default (package-private): Accessible in the same package.
// private: Accessible only within the class.

class Test {
    private int x;
    protected int y;
    public int z;
}


// Abstract Classes 

abstract class Vehicle {
    abstract void start();
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car starts");
    }
}


// package 
package mypackage;
public class Test {
    public void show() {
        System.out.println("In mypackage");
    }
}


// CLASSPATH
// CLASSPATH is an environment variable or JVM parameter that specifies the location of user-defined classes and packages.

// export CLASSPATH=/path/to/mypackage


// Interfaces
interface Printable {
    void print();
}
class Document implements Printable {
    public void print() {
        System.out.println("Printing document");
    }
}


interface I1 {
    void method1();
}
class SuperClass {
    void superMethod() {}
}
class SubClass extends SuperClass implements I1 {
    public void method1() {}
}



// Writing Exception Subclasses

class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Custom error");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}


// Multi Thread
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
public class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start(); // Starts the thread
    }
}


// The Main Thread
public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Main thread: " + t.getName()); // Outputs: main
    }
}


// Java Thread Model 
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread");
    }
}
public class Main {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}



// 4. Thread Priorities
// Definition: Thread priorities determine the relative importance of threads, influencing the order in which the JVM schedules them.

// Explanation: Priorities range from Thread.MIN_PRIORITY (1) to Thread.MAX_PRIORITY (10), with Thread.NORM_PRIORITY (5) as default.


Thread t = new Thread();
t.setPriority(Thread.MAX_PRIORITY); // Set to 10
System.out.println("Priority: " + t.getPriority());


// Synchronization in Java
// Synchronization ensures that only one thread accesses shared resources at a time, preventing data inconsistency.

class Counter {
    private int count = 0;
    synchronized void increment() {
        count++;
    }
}