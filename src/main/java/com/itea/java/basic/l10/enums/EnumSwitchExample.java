package com.itea.java.basic.l10.enums;

public class EnumSwitchExample {

    public static void main(String[] args) {


    }

    private String plan(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY: return "ITEA lesson";
            case TUESDAY: return "ITEA homework";
            case WEDNESDAY: return "ITEA lesson";
            case THURSDAY: return "Workout";
            case FRIDAY: return "Party hard";
            case SATURDAY: return "Eat and sleep";
            case SUNDAY: return "Getting ready...";
            default: return "Actually, it is not possible";
        }
    }
}
