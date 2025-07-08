// Serialization is the process of converting an object into a byte stream to save it to a file or transfer over a network.


import java.io.*;

class Student implements Serializable {
    int id;
    String name;
}


Student s = new Student();
ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.ser"));
out.writeObject(s);  // Serialization