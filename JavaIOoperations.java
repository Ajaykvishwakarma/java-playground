// 1. Read/Write from Text or Binary File Using Java
// ✅ A. Read/Write Text File
// Using FileReader and FileWriter:

import java.io.*;

public class TextFileIO {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("output.txt");
        writer.write("Hello IGNOU");
        writer.close();

        FileReader reader = new FileReader("output.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}



// ✅ B. Read/Write Binary File
// Using FileInputStream and FileOutputStream:

import java.io.*;

public class BinaryFileIO {
    public static void main(String[] args) throws IOException {
        FileOutputStream out = new FileOutputStream("binary.dat");
        out.write(new byte[]{65, 66, 67}); // writes A, B, C
        out.close();

        FileInputStream in = new FileInputStream("binary.dat");
        int b;
        while ((b = in.read()) != -1) {
            System.out.print((char) b);
        }
        in.close();
    }
}


// 2. Copy Content from One File to Another

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("destination.txt");

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fr.close();
        fw.close();
        System.out.println("File copied successfully.");
    }
}




// 3. Explain Buffered and Stream Classes
// ✅ Stream Classes
// Stream = sequence of data.

// Java I/O is stream-oriented (byte/character-based).


// | Type             | Class                         | Description                    |
// | ---------------- | ----------------------------- | ------------------------------ |
// | Byte Stream      | `InputStream`, `OutputStream` | For binary data (image, file)  |
// | Character Stream | `Reader`, `Writer`            | For text data (files, strings) |


BufferedReader br = new BufferedReader(new FileReader("input.txt"));
BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
String line;
while ((line = br.readLine()) != null) {
    bw.write(line);
    bw.newLine();
}
br.close();
bw.close();



