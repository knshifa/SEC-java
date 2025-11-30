 class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double amount) {
        accountHolder = name;
        balance = amount;
    }
    
    void deposit(double amt) {
        balance += amt;
    }
    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void display() {
        System.out.println(accountHolder + " has
 balance: " + balance);
    }
 }
