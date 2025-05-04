package oop.lab;

public abstract class BankAccount {

    public String AccountID;
    public String AccountOwner;
    public double Balance;

    public BankAccount(String AccountID, String AccountOwner, double BalanceA) {
        this.AccountID = AccountID;
        this.AccountOwner = AccountOwner;
        this.Balance = BalanceA;
    }

    public double getBalance() {
        return Balance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
        } else {
            Balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > Balance) {
            throw new IllegalArgumentException("Insufficient funds");
        } else {
            Balance -= amount;
        }
    }

    abstract void calculateInterest();
}