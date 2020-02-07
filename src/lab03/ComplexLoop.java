
package lab03;

import java.util.Scanner;
public class ComplexLoop {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double principle = 0.0;
        double apr = 0.0;
        int maturity = 0;

        System.out.println("Hello! Please enter the amount you are depositing:");
        principle = keyboard.nextDouble();
        System.out.println("Please enter the APR:");
        apr = keyboard.nextDouble();
        System.out.println("Finally, please input the maturity:");
        maturity = keyboard.nextInt();
        System.out.println("Calculating...");
        for(int i = 0; i<= maturity; i ++) {
            principle += principle * (apr / 1000);
        }
        System.out.println(principle);
    }
}
