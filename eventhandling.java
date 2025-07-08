// 1. What is an Event? Different Components of an Event
// ✅ What is an Event?
// An event is an object that describes a change in the state of a source (e.g., button click, mouse movement, key press). It is handled using event-driven programming in Java.

// ✅ Main Components of Event Handling:
// 1. Event Source

// The GUI component that generates the event (e.g., Button, TextField).

// 2. Event Object

// Contains information about the event.

// Examples: ActionEvent, MouseEvent, KeyEvent.

// 3. Event Listener (Handler)

// Interface that receives the event and contains methods to handle it.

// Examples: ActionListener, MouseListener, KeyListener.

// 4. Event Delegation Model

// A mechanism in Java where an event source delegates the responsibility of handling the event to a listener.


// 2. Java Program to Handle Keyboard and Mouse Events

// ✅ A. Handle Keyboard Event


import java.awt.*;
import java.awt.event.*;

public class KeyEventExample extends Frame implements KeyListener {
    Label l;

    KeyEventExample() {
        l = new Label();
        l.setBounds(20, 50, 250, 20);
        addKeyListener(this);
        add(l);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}
    
    public static void main(String[] args) {
        new KeyEventExample();
    }
}



// ✅ B. Handle Mouse Event
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener {
    Label l;

    MouseEventExample() {
        l = new Label();
        l.setBounds(20, 50, 250, 20);
        addMouseListener(this);
        add(l);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked at X=" + e.getX() + ", Y=" + e.getY());
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventExample();
    }
}


// 3. Difference between Low-Level and Semantic Events

// | Feature    | Low-Level Events                       | Semantic Events                  |
// | ---------- | -------------------------------------- | -------------------------------- |
// | Definition | Events related to hardware inputs      | Events related to GUI components |
// | Examples   | `KeyEvent`, `MouseEvent`, `FocusEvent` | `ActionEvent`, `ItemEvent`       |
// | Complexity | More detailed and lower abstraction    | More abstract and easier to use  |
// | Use Case   | Detect fine-grained interactions       | Detect general GUI actions       |


