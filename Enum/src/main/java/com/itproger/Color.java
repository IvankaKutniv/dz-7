package com.itproger;

import java.util.Locale;

public enum Color {
    RED,
    GREEN,
    BLUE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
