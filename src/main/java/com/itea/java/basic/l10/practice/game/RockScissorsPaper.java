package com.itea.java.basic.l10.practice.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RockScissorsPaper {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String command = "";
        while (!command.equalsIgnoreCase("exit")) {
            command = promptInput();

            Choice playerChoice = null;
            for (Choice choice : Choice.values()) {
                if (command.equalsIgnoreCase(choice.name())) {
                    playerChoice = choice;
                }
            }

            Random random = new Random();
            int randomInt = random.nextInt(3);
            Choice computerChoice = null;
            for (Choice choice : Choice.values()) {
                if (choice.ordinal() == randomInt) {
                    computerChoice = choice;
                }
            }

            System.out.println("Your choice is " + playerChoice);
            System.out.println("Computer choisce is " + computerChoice);

            System.out.println(GameRules.win(playerChoice, computerChoice));
        }
    }

    private static String promptInput() {
//        return "Hello";
        System.out.println("Please enter the command: ");
        try {
            return READER.readLine();
        } catch (IOException e) {
            return null;
        }
    }

//    private String hello() {
//        return "Hello";
//    }
}
