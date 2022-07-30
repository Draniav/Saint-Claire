package com.sofka.saint_claire.utilities;

public class LengthValidator {
    public static boolean validateLength(String value, int min, int max) {
        return value.length() >= min && value.length() <= max;
    }
}
