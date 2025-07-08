// The this keyword refers to the current class instance.

// Uses:

// 1. To refer to instance variables when shadowed by parameters.

// 2. To call another constructor in the same class.

// 3. To return the current class instance.

class Demo {
    int x;
    Demo(int x) {
        this.x = x; 
    }
}
