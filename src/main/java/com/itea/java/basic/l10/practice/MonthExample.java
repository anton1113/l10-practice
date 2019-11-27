package com.itea.java.basic.l10.practice;

import java.io.InputStreamReader;

import static com.itea.java.basic.l10.practice.Month.*;
//import static com.itea.java.basic.l10.practice.Month.getMonth;
import static java.lang.Math.PI;

public class MonthExample {

    public static void main(String[] args) {
        System.out.println(getMonth(5));
        System.out.println(getMonth(new InputStreamReader(System.in)));
        System.out.println(JANUARY);

        double d = PI;
        Class monthClass = Month.class;
    }

    private static int getNumberOfDays(int monthNumber) {
        for (Month month : Month.values()) {
            if (month.ordinal() == (monthNumber - 1)) {
                return month.getNumberOfDays();
            }
        }
        return 0;
    }
}
