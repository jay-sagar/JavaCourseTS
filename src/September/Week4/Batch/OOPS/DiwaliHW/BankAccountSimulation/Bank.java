package September.Week4.Batch.OOPS.DiwaliHW.BankAccountSimulation;

public class Bank {
    private final int accountNumber;
    private final String name;
    private int balance;

    Bank(int accountNumber, String name, int balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    Bank(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = 0;
    }

    public void deposit(int depositAmount) {
        this.balance += depositAmount;
        System.out.println(depositAmount + " has been credited to your account. Total Balance: " + this.balance);
    }

    public void withdrawal(int withdrawalAmount) {
        if (this.balance <= 0) {
            System.out.println("Sorry, you have ZERO amount in your bank");
        } else if (this.balance < withdrawalAmount) {
            System.out.println("Sorry, you don't have sufficient amount");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println(withdrawalAmount + " has been debited from your account. Total Balance: " + this.balance);
        }
    }

    public void displayAccountDetail() {
        System.out.println("Total balance: " + this.balance);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Account holder's name: " + this.name);
    }

    public static void main(String[] args) {
        Bank jay = new Bank(101, "Jay", 1000);
        jay.displayAccountDetail();

        jay.deposit(2400);
        jay.withdrawal(500);
    }
}
