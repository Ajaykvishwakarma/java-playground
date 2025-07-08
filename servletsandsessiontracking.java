1. What is a Servlet? How Does It Differ from an Applet?
✅ What is a Servlet?
A Servlet is a Java program that runs on a web server and handles client requests (usually via HTTP) and generates dynamic web responses.

Runs in server-side

Part of javax.servlet package

Typically used to build web applications


 Difference between Servlet and Applet

| Feature         | Servlet                        | Applet                          |
| --------------- | ------------------------------ | ------------------------------- |
| Execution       | Runs on **web server**         | Runs on **client/browser**      |
| Purpose         | Handles web requests/responses | GUI-based interactive programs  |
| GUI Support     | No GUI                         | GUI-based (AWT/Swing)           |
| Lifecycle       | Controlled by server container | Controlled by browser or viewer |
| main() Required | No                             | No                              |
| Used For        | Web applications (back-end)    | Small front-end utilities       |




2. Servlet Lifecycle
The lifecycle of a Servlet is managed by the Servlet container (like Tomcat). It involves the following stages:


✅ Servlet Lifecycle Methods:
init()

Called once when servlet is loaded.

Used for initialization.

service()

Called for each client request.

Handles GET/POST requests.

destroy()

Called once when servlet is unloaded.

Used for cleanup.



✅ Diagram

Browser Sends Request
        |
   +----v----+
   |  init() | ← Called once
   +----+----+
        |
   +----v----+
   | service()| ← Called for each request
   +----+----+
        |
   +----v----+
   | destroy()| ← Called when servlet is removed
   +---------+


3. GET vs POST in Servlet
| Feature         | GET                                              | POST                          |
| --------------- | ------------------------------------------------ | ----------------------------- |
| Data Visibility | Appended in URL (visible)                        | Sent in request body (hidden) |
| Data Length     | Limited (URL length limit)                       | No restriction                |
| Use Case        | For retrieving data                              | For submitting form data      |
| Idempotent?     | Yes                                              | No                            |
| Servlet Method  | `doGet(HttpServletRequest, HttpServletResponse)` | `doPost(...)`                 |

✅ Example:
protected void doGet(HttpServletRequest req, HttpServletResponse res) {
    String name = req.getParameter("name");
    // Display data
}

protected void doPost(HttpServletRequest req, HttpServletResponse res) {
    String name = req.getParameter("name");
    // Save data
}




4. Session Tracking Using Cookies
✅ What are Cookies?
Cookies are small text files stored on the client's browser, used to track session info across multiple HTTP requests.

✅ How Cookies Work in Session Tracking:
Server sends a cookie (e.g., session ID) in the response.

Browser stores it and sends it back with each subsequent request.

Server uses this info to identify returning users.



✅ Example: Setting a Cookie in Servlet


Cookie c = new Cookie("username", "ajay");
c.setMaxAge(3600); // 1 hour
response.addCookie(c);


✅ Example: Reading a Cookie

Cookie[] cookies = request.getCookies();
for (Cookie c : cookies) {
    if (c.getName().equals("username")) {
        out.println("Welcome " + c.getValue());
    }
}
