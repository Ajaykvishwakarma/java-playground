1. Java Beans
A Java Bean is a reusable software component that follows specific conventions:

✅ Key Features:
Must have a default constructor.

Must be serializable.

Must provide getter and setter methods.

Follows naming conventions (e.g., getName(), setName()).

✅ Example:

public class StudentBean implements java.io.Serializable {
    private String name;

    public StudentBean() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}



2. Access Specifiers
Access specifiers control visibility of class members:

| Specifier             | Accessible In                        |
| --------------------- | ------------------------------------ |
| `public`              | Everywhere                           |
| `private`             | Within the same class only           |
| `protected`           | Same package + subclasses (anywhere) |
| Default (no modifier) | Same package only                    |


3. AWT vs Swing

| Feature         | AWT                            | Swing                   |
| --------------- | ------------------------------ | ----------------------- |
| Library         | Part of `java.awt`             | Part of `javax.swing`   |
| Platform        | Heavyweight (uses native code) | Lightweight (pure Java) |
| Look & Feel     | Native OS-based                | Customizable            |
| Component Names | `Button`, `Label`              | `JButton`, `JLabel`     |



4. TCP/IP Sockets
Socket: Endpoint for communication between two machines.

TCP (Transmission Control Protocol): Reliable, connection-oriented.

Classes:

Socket (Client-side)

ServerSocket (Server-side)

Socket s = new Socket("localhost", 5000); // Client


5. Bitwise Operators
Used to perform operations on individual bits:

| Operator | Description | Example       |     |         |
| -------- | ----------- | ------------- | --- | ------- |
| `&`      | AND         | `5 & 3 = 1`   |     |         |
| \`       | \`          | OR            | \`5 | 3 = 7\` |
| `^`      | XOR         | `5 ^ 3 = 6`   |     |         |
| `~`      | NOT         | `~5 = -6`     |     |         |
| `<<`     | Left Shift  | `5 << 1 = 10` |     |         |
| `>>`     | Right Shift | `5 >> 1 = 2`  |     |         |



6. Stream Tokenizer
Used to parse input stream into tokens (words, numbers, symbols).

✅ Class:
java.io.StreamTokenizer

import java.io.*;

public class TokenizerExample {
    public static void main(String[] args) throws IOException {
        Reader r = new StringReader("Java 101");
        StreamTokenizer st = new StreamTokenizer(r);

        while (st.nextToken() != StreamTokenizer.TT_EOF) {
            if (st.ttype == StreamTokenizer.TT_WORD)
                System.out.println("Word: " + st.sval);
            else if (st.ttype == StreamTokenizer.TT_NUMBER)
                System.out.println("Number: " + st.nval);
        }
    }
}


7. Dynamic Binding
Dynamic binding (or late binding) occurs when method calls are resolved at runtime, not compile time.

✅ Enabled through method overriding and inheritance.

class Animal { void sound() { System.out.println("Animal sound"); } }
class Dog extends Animal { void sound() { System.out.println("Bark"); } }

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog(); // Polymorphism
        a.sound(); // Bark → resolved at runtime
    }
}



8. Packages in Java
A package is a namespace that organizes related classes and interfaces.

✅ Types:
Built-in packages: java.util, java.io, etc.

User-defined packages

✅ How to Create and Use:

// File: mypack/Hello.java
package mypack;
public class Hello {
    public void msg() { System.out.println("Hello from package"); }
}

// File: Main.java
import mypack.Hello;
class Main {
    public static void main(String[] args) {
        new Hello().msg();
    }
}
