package com.itea.java.basic.l10.practice.cards;

public final class Card {

    private final CardValue cardValue;
    private final Mast mast;

    public Card(CardValue cardValue, Mast mast) {
        this.cardValue = cardValue;
        this.mast = mast;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public Mast getMast() {
        return mast;
    }
}
