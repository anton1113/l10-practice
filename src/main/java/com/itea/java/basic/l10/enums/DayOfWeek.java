package com.itea.java.basic.l10.enums;

public enum DayOfWeek {

    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY(null);

    public static final String GG = "gg";
    private String title;

    public static void main(String[] args) {
        System.out.println(DayOfWeek.GG);
    }

    DayOfWeek() {

    }

    public String upperCaseName() {
        return title.toUpperCase();
    }

    DayOfWeek(String title) {
        this.title = title;
    }

    DayOfWeek(String title, String name) {

    }
}
