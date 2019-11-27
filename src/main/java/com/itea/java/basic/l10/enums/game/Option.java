package com.itea.java.basic.l10.enums.game;

import java.util.Random;

public enum Option {

    ROCK,
    PAPER,
    SCISSORS;

    private static final Random RANDOM = new Random();

    public Result figth(Option other) {
        if (this == other) {
            return Result.DRAW;
        }
        switch (this) {
            case ROCK: return other == SCISSORS ? Result.WIN : Result.LOOSE;
            case PAPER: return other == ROCK ? Result.WIN : Result.LOOSE;
            case SCISSORS: return other == PAPER ? Result.WIN: Result.LOOSE;
            default: return Result.LOOSE;
        }
    }

    public static Option random() {
        return values()[RANDOM.nextInt(values().length)];
    }
}
