// Method overloading is a fundamental concept in java that allows a class to have multiple methods with same name but different signatures (parameters). this enables developers to perform similar operations using different input parameters while maintainning clean, readable code


public class MethodOverLoading {
    void display(int a) {
        System.out.println("Method with int: " + a);
    }

    void display(int a, int b) {
        System.out.println("Method with two int: " + a + " " + b);
    }

    void display(double a) {
        System.out.println("Method with double: " + a);
    }

    void display(String message) {
        System.out.println("Method with String: " + message);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();

        obj.display(10);                  // Calls method with int
        obj.display(10, 20);              // Calls method with two ints
        obj.display(10.24);               // Calls method with double
        obj.display("Hello Java");        // Calls method with String
    }
}
