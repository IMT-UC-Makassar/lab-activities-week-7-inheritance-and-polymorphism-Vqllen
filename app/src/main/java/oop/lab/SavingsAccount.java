package oop.lab;

public class SavingsAccount extends BankAccount implements OnlineService {

    public SavingsAccount(String AccountID, String AccountOwner, double BalanceA) {
        super(AccountID, AccountOwner, BalanceA);
    }

    @Override
    void calculateInterest() {
        double Interest = 0.5;
        Balance = Balance + Balance * Interest;
    }

    @Override
    public void transferFunds(double amount, String toAccountID) {
        if (amount > Balance) {
            System.out.println("Cannot transfer more than you have");
        } else {
            Balance -= amount;
            System.out.println("Transferring " + amount + " to account " + toAccountID);
        }
    }

    @Override
    public void payBills(double amount) {
        Balance -= amount;
        System.out.println("You've payed " + amount + "of your Bills.");
    }
}