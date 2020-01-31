package lab02;

import java.util.Scanner;

// Creates the Public class
public class TemperatureConverter {

    // Allows for keyboard input
    private static Scanner keyboard = new Scanner(System.in);

    // Main function
    public static void main(String[] args) {

        // Opening Statement
        System.out.println("Hello and welcome to the temperature converter!");
        System.out.println("Please, input the current degrees and what scale it is in using C or F");

        // Gets user input
        String entry = keyboard.nextLine();

            // Takes the string, parses it for ints, and creates "format" and "degrees"
            String value = entry.substring(0, entry.length() - 1);
            double degrees = Double.parseDouble(value);
            char format;
            format = entry.charAt(entry.length() - 1);

        // Checks for celsius format
        if(format == 'C' || format =='c') {

            // Converts to Fahrenheit
            double answer = ((9 / 5.0)*degrees) + 32;
            System.out.println("You put in " + degrees + " C and we calculated this is equal to " + answer +
                    " degrees fahrenheit!");
        } //If C

        // Checks for Fahrenheit format
        if(format == 'F' || format == 'f') {

            // Converts to celsius
            double answer = (5/9.0)*(degrees - 32);
            System.out.println("You put in " + degrees + " F and we calculated this is equal to " + answer +
                    " degrees celsius!");

        } // if F

        // Error return
        else {
            System.out.println("Please enter a C or an F at the end of your number!");
        } // Else
        // End statement
        System.out.println("Thank you for using this service! Have a wonderful day!");


    } // Main
} // TemperatureConverter
