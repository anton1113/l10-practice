package com.itea.java.basic.l10.enums;

public final class ClassDayOfWeek {

    public static final ClassDayOfWeek MONDAY = new ClassDayOfWeek("Понедельник");
    public static final ClassDayOfWeek TUESDAY = new ClassDayOfWeek("Вторник");
    public static final ClassDayOfWeek WEDNESDAY = new ClassDayOfWeek("Среда");
    public static final ClassDayOfWeek THURSDAY = new ClassDayOfWeek("Четверг");
    public static final ClassDayOfWeek FRIDAY = new ClassDayOfWeek("Пятница");
    public static final ClassDayOfWeek SATURDAY = new ClassDayOfWeek("Суббота");
    public static final ClassDayOfWeek SUNDAY = new ClassDayOfWeek("Воскресенье");

    private String title;

    private ClassDayOfWeek(String title) {
        this.title = title;
    }

    public String toString() {
        return title;
    }
}
