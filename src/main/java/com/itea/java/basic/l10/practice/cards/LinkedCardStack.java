package com.itea.java.basic.l10.practice.cards;

public class LinkedCardStack implements CardStack {

    private LinkedCardStackElement top;

    public void push(Card card) {
        if (top == null) {
            LinkedCardStackElement element = new LinkedCardStackElement(card, null);
            top = element;
        } else {
            LinkedCardStackElement element = new LinkedCardStackElement(card, top);
            top = element;
        }
    }

    public Card pop() {
        Card result = top.getCard();
        top = top.getPrev();

        return result;
    }

    public boolean empty() {
        return top == null;
    }

    public int length() {
        LinkedCardStackElement tmp = top;
        if (empty()) {
            return 0;
        }

        int size = 0;
        while (tmp.getPrev() != null) {
            size ++;
            tmp = tmp.getPrev();
        }


        return size;
    }
}
