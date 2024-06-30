package com.itproger;

public enum Days {
    MONDAY("mo", "work"),
    TUESDAY("tu", "work"),
    WEDNESDAY("we", "work"),
    THURSDAY("th", "work"),
    FRIDAY("fr", "work"),
    SATURDAY("sa", "day off"),
    SUNDAY("su", "day off");

    private String shortDayName;
    private String activity;

    Days(String shortDayName, String activity) {
        this.shortDayName = shortDayName;
        this.activity = activity;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public String getShortDayName() {
        return shortDayName;
    }

    public String getActivity() {
        return activity;
    }
}
