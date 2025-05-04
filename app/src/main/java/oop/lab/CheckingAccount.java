package oop.lab;

public class CheckingAccount extends BankAccount implements OnlineService {

    public CheckingAccount(String AccountID, String AccountOwner, double BalanceA) {
        super(AccountID, AccountOwner, BalanceA);
    }

    @Override
    void calculateInterest() {
    }

    @Override
    public void transferFunds(double amount, String toAccount) {
        if (amount > Balance) {
            System.out.println("Cannot transfer more than you have");
        } else {
            Balance -= amount;
            System.out.println("Transferring " + amount + " to account " + toAccount);
        }
    }

    @Override
    public void payBills(double amount) {
        Balance -= amount;
        System.out.println("You've payed " + amount + "of your Bills.");
    }
}