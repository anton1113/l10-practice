package com.itea.java.basic.l10.practice.cards;

public class LinkedCardStackElement {

    private Card card;
    private LinkedCardStackElement prev;

    public LinkedCardStackElement(Card card, LinkedCardStackElement prev) {
        this.card = card;
        this.prev = prev;
    }

    public Card getCard() {
        return card;
    }

    public LinkedCardStackElement getPrev() {
        return prev;
    }
}
