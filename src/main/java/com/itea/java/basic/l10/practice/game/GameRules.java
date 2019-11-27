package com.itea.java.basic.l10.practice.game;

public class GameRules {

    public static GameResult win(Choice c1, Choice c2) {
        if (c1 == c2) {
            return GameResult.DRAW;
        }
        switch (c1) {
            case ROCK: {
                if (c2.equals(Choice.PAPER)) {
                    return GameResult.LOOSE;
                } else if (c2 == Choice.SCISSORS) {
                    return GameResult.WIN;
                }
            }
            case SCISSORS: {
                return c2 == Choice.PAPER ? GameResult.LOOSE : GameResult.WIN;
            }
            case PAPER: {
                return c2 == Choice.ROCK ? GameResult.LOOSE : GameResult.WIN;
            }
            default: {
                return GameResult.DRAW;
            }
        }
    }
}
