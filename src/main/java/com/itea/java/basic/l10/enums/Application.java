package com.itea.java.basic.l10.enums;

import static com.itea.java.basic.l10.enums.ClassDayOfWeek.*;

public class Application {

    public static void main(String[] args) {

    }

    private void myPlan(ClassDayOfWeek classDayOfWeek) {
        if (classDayOfWeek == SATURDAY) {
            System.out.println("Eat and sleep");
        } else {
            System.out.println("Work hard");
        }
    }
}
