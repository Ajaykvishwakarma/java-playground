// The try-catch-finally block is used to handle exceptions gracefully and ensure that clean-up code runs regardless of the exception.


// Syntax: 

try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Exception handling code
} finally {
    // Code that always executes (optional)
}



public class TryCatchFinallyExample {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("This block always executes.");
        }
    }
}




// 3. Multiple Exception Handling in Java
// You can handle multiple exceptions either using:

// Multiple catch blocks

// Multi-catch block (|) (Java 7+)



public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[3] = 10; // ArrayIndexOutOfBoundsException
            int x = 5 / 0; // ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
    }
}



// Using Multi-Catch Block
try {
    String s = null;
    System.out.println(s.length());
} catch (NullPointerException | ArithmeticException e) {
    System.out.println("Exception occurred: " + e);
}
