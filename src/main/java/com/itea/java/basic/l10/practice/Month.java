package com.itea.java.basic.l10.practice;

public enum Month {

    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(31),
    JULY(30),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31);

    private final int numberOfDays;

    public int getNumberOfDays() {
        return numberOfDays;
    }

    Month(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public static Month getMonthByNumber(int number) {
        for (Month month : values()) {
            if (month.ordinal() + 1 == number) {
                return month;
            }
        }
        return null;
    }

    public static Month getMonthByName(String name) {
        for (Month month : values()) {
            if (month.name().equals(name)) {
                return month;
            }
        }
        return null;
    }

    public static Month getMonth(Object o) {
        if (o instanceof Integer) {
            return getMonthByNumber((Integer) o);
        } else {
            return getMonthByName((String) o);
        }
    }

    public static int getTotalNumberOfDays() {
        int tot = 0;
        for (Month month : values()) {
            tot += month.getNumberOfDays();
        }
        return tot;
    }
}
