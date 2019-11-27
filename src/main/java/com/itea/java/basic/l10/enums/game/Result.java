package com.itea.java.basic.l10.enums.game;

public enum Result {

    WIN("You win!"),
    LOOSE("You loose!"),
    DRAW("It is draw");

    Result(String message) {
        this.message = message;
    }

    private String message;


    @Override
    public String toString() {
        return message;
    }
}
