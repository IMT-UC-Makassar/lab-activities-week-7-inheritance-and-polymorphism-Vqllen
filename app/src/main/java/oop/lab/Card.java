package oop.lab;

@SuppressWarnings("unused")
public class Card {
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
