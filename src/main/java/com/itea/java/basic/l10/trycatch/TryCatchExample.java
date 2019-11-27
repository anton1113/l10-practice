package com.itea.java.basic.l10.trycatch;

import java.util.Scanner;

public class TryCatchExample {

    public TryCatchExample() throws Exception {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 0) {
            throw new RuntimeException("0 is not allowed");
        }
    }
}
