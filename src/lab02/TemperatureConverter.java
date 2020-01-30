package lab02;

import java.util.*;

public class TemperatureConverter
{

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Hello and welcome to the temperature converter!");
        System.out.println("Please, input the current degrees and what scale it is in using C or F");
        String entry = keyboard.nextLine();

            String value = entry.substring(0, entry.length() - 1);
            double degrees = Double.parseDouble(value);
            char format;
            format = entry.charAt(entry.length() - 1);

        if(format == 'C' || format =='c')
        {
            double answer = ((9 / 5.0)*degrees) + 32;
            System.out.println("You put in " + degrees + " C and we calculated this is equal to " + answer +
                    " degrees fahrenheit!");
        }
        if(format == 'F' || format == 'f')
        {
            double answer = (5/9.0)*(degrees - 32);
            System.out.println("You put in " + degrees + " F and we calculated this is equal to " + answer +
                    " degrees celsius!");

        }
        else
        {
            System.out.println("Please enter a C or an F at the end of your number!");
        }
        System.out.println("Thank you for using this service! Have a wonderful day!");


    }
}
