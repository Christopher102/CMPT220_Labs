package extracredit;

import java.util.Scanner;

public class zodiac {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please input the year you are looking for: ");
        int chosenyear = keyboard.nextInt();

        int zodiacyear = chosenyear % 12;
        String zodiac;

        switch (zodiacyear) {
            case 0:
                zodiac = "Monkey";
                break;
            case 1:
                zodiac = "Rooster";
                break;
            case 2:
                zodiac = "Dog";
                break;
            case 3:
                zodiac = "Pig";
                break;
            case 4:
                zodiac = "Rat";
                break;
            case 5:
                zodiac = "Ox";
                break;
            case 6:
                zodiac = "Tiger";
                break;
            case 7:
                zodiac = "Rabbit";
                break;
            case 8:
                zodiac = "Dragon";
                break;
            case 9:
                zodiac = "Snake";
                break;
            case 10:
                zodiac = "Horse";
                break;
            case 11:
                zodiac = "Sheep";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + zodiacyear);
        }
        System.out.println("The sign for that year was: " + zodiac);

    }

}



