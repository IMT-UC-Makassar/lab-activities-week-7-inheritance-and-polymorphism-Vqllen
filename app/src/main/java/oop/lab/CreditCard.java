package oop.lab;

public class CreditCard extends Card {

    public CreditCard(String CardID, String CardOwner) {
        super(CardID, CardOwner);
    }

    @Override
    public double getInterestRate() {
        return 10.0;
    }
}
