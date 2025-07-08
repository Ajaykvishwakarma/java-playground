1. What is RMI? Explain RMI Architecture with Diagram
✅ What is RMI?
RMI (Remote Method Invocation) is a Java API that allows an object to invoke methods on an object running in another JVM (Java Virtual Machine).

Enables distributed object communication.

RMI uses TCP/IP and Java Object Serialization.


✅ RMI Architecture Components
Client – Makes remote method calls.

Stub – Client-side proxy for the remote object.

Skeleton – Server-side proxy (used in older versions).

Remote Interface – Declares methods that can be invoked remotely.

Remote Object – The actual implementation on the server.

RMI Registry – Server registers remote objects with a name.


Client JVM                                 Server JVM
+----------+                               +------------+
| Client   |   invoke method               | Remote Obj |
|          |-----------------------------> |            |
|          |                               |  Skeleton   |
|   Stub   |                               |   (pre-Java 2)  
|          |<----------------------------- |            |
|          |   return result               |            |
+----------+                               +------------+
       |                                         ^
       | RMI                                     |
       v Registry Lookup                         |
  RMI Registry (rmiregistry) <-------------------+








2. What is JDBC? Steps to Connect with a Database Using JDBC
✅ What is JDBC?
JDBC (Java Database Connectivity) is an API that enables Java applications to interact with relational databases using SQL.


 Steps to Connect to a Database using JDBC
1. Import JDBC Packages
import java.sql.*;


2. Load JDBC Driver
Class.forName("com.mysql.cj.jdbc.Driver");


3. Establish Connection
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/dbname", "username", "password");


4. Create Statement
Statement stmt = con.createStatement();

5. Execute Query
ResultSet rs = stmt.executeQuery("SELECT * FROM students");


6. Process Result

while(rs.next()) {
    System.out.println(rs.getString("name"));
}

7. Close Connection

con.close();








3. Difference Between Stream and Datagram Socket

| Feature      | Stream Socket (`Socket`)          | Datagram Socket (`DatagramSocket`) |
| ------------ | --------------------------------- | ---------------------------------- |
| Protocol     | TCP (Connection-oriented)         | UDP (Connectionless)               |
| Reliability  | Reliable – ensures delivery/order | Unreliable – no delivery guarantee |
| Data Format  | Continuous stream                 | Packets (Datagrams)                |
| Overhead     | Higher (due to connection setup)  | Lower (lightweight)                |
| Classes Used | `Socket`, `ServerSocket`          | `DatagramSocket`, `DatagramPacket` |
| Use Case     | Chat apps, file transfer          | Video streaming, real-time games   |

