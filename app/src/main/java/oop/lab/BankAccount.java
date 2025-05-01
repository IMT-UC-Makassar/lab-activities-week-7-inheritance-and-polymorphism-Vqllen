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
        if (amount > 0) {
            System.out.println("You can only deposit a positive amount.");
        } else {
            Balance += amount;
            System.out.println("Depositing " + amount + " to account " + AccountID);
        }
    }

    public void withdraw(double amount) {
        if (amount > Balance) {
            System.out.println("Cannot withdraw more than you have");
        } else {
            Balance -= amount;
            System.out.println("Withdrawing " + amount + " from account " + AccountID);
        }
    }

    abstract void calculateInterest();
}

@SuppressWarnings("unused")
class Card {
    private String CardID;
    private String CardOwner;

    public Card(String CardID, String CardOwner) {
        this.CardID = CardID;
        this.CardOwner = CardOwner;
    }

    public double getInterestRate() {
        return 0.0;
    }
}
