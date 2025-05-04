package oop.lab;

interface OnlineService {
    void transferFunds(double amount, String toAccountID);

    void payBills(double amount);
}
