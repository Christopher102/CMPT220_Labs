package lab02;
import java.util.Scanner;

public class InchesToMeters {

    static Scanner keyboard = new Scanner(System.in);
    private static double convert;

    public static void main(String[] args) {

        convert = .0254;

        System.out.println("Hello! This program converts inches to meters!");
        System.out.println("Please enter in the number of inches you wish to convert!");
        double inches = keyboard.nextDouble();
        System.out.println("Calculating...");
        double meters = inches*convert;
        System.out.println("You've converted " + inches + " into " + meters + " meters!");
        System.out.println("Thank you! And have a wonderful day!");




    }
}
