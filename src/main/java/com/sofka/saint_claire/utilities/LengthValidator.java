package com.sofka.saint_claire.utilities;

public class LengthValidator {
    public static boolean validateLength(String text, int min, int max) {
        return text.length() >= min && text.length() <= max;
    }
}
