
    class BankAccount {
    
    private int accountNumber; 
    private double balance;

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

   
    public double getBalance() {
        return balance;
    }

    
    public void deposit(double amount) {
        balance = balance + amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Not enough balance!");
        }
    }
}

public class BankDemo{
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, 1000);

        System.out.println("Initial Balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("After Deposit: " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("After Withdraw: " + acc.getBalance());
    }
}
