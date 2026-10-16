
class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, String accountNumber,
                double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Getters
    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit money with validation
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(
                "Invalid deposit! Amount must be positive."
            );
        } else {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        }
    }

    // Withdraw money with validation
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(
                "Invalid withdrawal! Amount must be positive."
            );
        } else if (amount > balance) {
            System.out.println(
                "Withdrawal failed! Insufficient balance."
            );
        } else {
            balance -= amount;
            System.out.println(
                "Withdrawal successful: " + amount
            );
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(
            "Amit Sharma", "1234567890", 5000.0
        );

        System.out.println("Account Holder: "
                           + account.getAccountHolder());
        System.out.println("Account Number: "
                           + account.getAccountNumber());
        System.out.println("Initial Balance: "
                           + account.getBalance());

        System.out.println("\n--- Valid Transactions ---");
        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("\n--- Invalid Transactions ---");
        account.deposit(-500);
        account.withdraw(0);
        account.withdraw(-200);
        account.withdraw(10000);

        System.out.println("\n--- Final Account Details ---");
        System.out.println("Account Holder: "
                           + account.getAccountHolder());
        System.out.println("Account Number: "
                           + account.getAccountNumber());
        System.out.println("Updated Balance: "
                           + account.getBalance());
    }
}

