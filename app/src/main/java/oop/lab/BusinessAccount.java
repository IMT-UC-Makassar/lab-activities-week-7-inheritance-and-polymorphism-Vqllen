package oop.lab;

public class BusinessAccount extends BankAccount implements OnlineService, LoanService {

    public BusinessAccount(String AccountID, String AccountOwner, double BalanceA) {
        super(AccountID, AccountOwner, BalanceA);
    }

    @Override
    void calculateInterest() {
        double Interest = 0.2;
        Balance = Balance + Balance * Interest;
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

    @Override
    public void applyForLoan(double amount) {
    }

    @Override
    public String checkLoanStatus() {
        return "Pending";
    }
}
