package oop.lab;

public class PlatinumCard extends Card {

    public PlatinumCard(String CardID, String CardOwner) {
        super(CardID, CardOwner);
    }

    public double getInterestRate() {
        return 10.0;
    }
}