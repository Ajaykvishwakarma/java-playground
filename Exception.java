// What is an Exception?
// An exception is an unexpected event or error that occurs during the execution of a program, disrupting the normal flow.

// Exceptions are objects in Java, instances of the Throwable class or its subclasses (Exception and Error).




// Types of Exceptions

// A. Checked Exceptions
// Detected at compile time.

// Must be either handled using try-catch or declared using throws.

// Examples:

// IOException

// SQLException

// FileNotFoundException

import java.io.*;

public class CheckedEx {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file.txt"); // Checked exception
    }
}



// B. Unchecked Exceptions
// Detected at runtime.

// Not required to be handled explicitly.

// Examples:

// ArithmeticException

// NullPointerException

// ArrayIndexOutOfBoundsException

public class UncheckedEx {
    public static void main(String[] args) {
        int x = 10 / 0; // ArithmeticException
    }
}
