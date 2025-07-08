// Encapsulation is the technique of binding data and methods together and hiding it from outside interference.

// Abstraction is the process of exposing only relevant details to the user and hiding the internal complexity.

// 👉 Encapsulation supports abstraction by providing control over what data is accessible.

// Example:



class BankAccount {
    private double balance; // Encapsulation (hidden)

    public double getBalance() {  // Abstraction
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }
}



// In the above:

// balance is hidden via encapsulation.

// User interacts only with getBalance() and deposit() — that's abstraction.

