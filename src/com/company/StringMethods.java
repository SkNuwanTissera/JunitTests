package com.company;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {
        String[] formattedString;
        final String SPACE = " ";

        String str = "Welcome! This is N202 Module";

        // splitting string into string array.
        formattedString = str.split(" ");

        // formatting 1st word
        formattedString[0] = formattedString[0].toUpperCase(Locale.ROOT);
        formattedString[0] = formattedString[0].replace("!","@");

        // formatting 2nd word
        formattedString[1] = formattedString[1].toLowerCase(Locale.ROOT);

        // formatting 3rd word
        formattedString[2] = formattedString[2].toUpperCase(Locale.ROOT);

        // formatting 5th word
        formattedString[4] = String.valueOf(formattedString[4].charAt(0));

        System.out.println(formattedString[0] + SPACE + formattedString[1] + SPACE + formattedString[2] + SPACE + formattedString[3] + SPACE + formattedString[4]);
        System.out.println("Length of " + formattedString[3] + " is " +formattedString[3].length());
    }
}
