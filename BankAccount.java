class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    // Default Constructor
    BankAccount() {
        this.accountNumber = 1001;
        this.holderName = "Default User";
        this.balance = 0.0;
    }

    // Parameterized Constructor
    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance = this.balance - amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display account details
    void displayDetails() {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder: " + this.holderName);
        System.out.println("Balance: " + this.balance);
    }

    public static void main(String[] args) {

        // Using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.displayDetails();

        System.out.println("---------------------");

        // Using parameterized constructor
        BankAccount acc2 = new BankAccount(2002, "Vishal Roy", 5000);
        acc2.deposit(1500);
        acc2.withdraw(2000);
        acc2.displayDetails();<br>
    }
}
