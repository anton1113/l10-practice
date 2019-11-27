package com.itea.java.basic.l10.enums.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    private static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String optionName = "";
        while (!"0".equals(optionName)) {
            System.out.println("Please enter the option");
            optionName = askOptionName();
            Option yourOption = Option.valueOf(optionName);
            Option opponentOption = Option.random();
            System.out.println("Your opponent choose " + opponentOption);
            System.out.println(yourOption.figth(opponentOption));
        }
    }

    private static String askOptionName() {
        try {
            return READER.readLine();
        } catch (IOException e) {
            System.out.println("Exception occurred");
            return null;
        }
    }
}
