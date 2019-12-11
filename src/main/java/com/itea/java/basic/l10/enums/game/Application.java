package com.itea.java.basic.l10.enums.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Application {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private static final Logger LOGGER = FileLoggerFactory.getLogger();

    public static void main(String[] args) {
        while (true) {
            Option userOption = askForOption();
            LOGGER.log(Level.INFO, "User has chosen " + userOption.name());
            if (userOption == Option.EXIT) {
                break;
            }
            Option opponentOption = Option.random();
            LOGGER.log(Level.INFO, "Opponent has chosen " + opponentOption.name());
            fight(userOption, opponentOption);
        }
    }

    private static void fight(Option userOption, Option opponentOption) {
        Result result = userOption.figth(opponentOption);
        LOGGER.log(Level.INFO, result.name());
    }

    private static Option askForOption() {
        while (true) {
            System.out.println("Please enter the option");
            try {
                return Option.valueOf(getStringFromConsole());
            } catch (Exception e) {
                System.out.println("Invalid option, please enter PAPER, ROCK, SCISSORS or EXIT");
            }
        }
    }

    private static String getStringFromConsole() {
        try {
            return READER.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred");
            return null;
        }
    }
}
