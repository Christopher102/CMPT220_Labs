package lab03;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random moveselect = new Random();
         Scanner keyboard = new Scanner(System.in);
         String playinput = "none";
         String[] moves = {"rock", "paper", "scissors"};
         String cpumove = "none";
         while(true){
             System.out.println("Please input your next move:");
             playinput = keyboard.next();
             cpumove = moves[moveselect.nextInt(2)];
             if(playinput.equals("rock")){
                 if(cpumove.equals("rock")){
                     System.out.println("The computer throws rock!");
                     System.out.println("Its a tie!");
                     break;
                 }
                 if(cpumove.equals("paper")){
                     System.out.println("The computer throws paper!");
                     System.out.println("You Lose!");
                     break;
                 }
                 if(cpumove.equals("scissors")){
                     System.out.println("The computer throws scissors");
                     System.out.println("You Win!");
                     break;
                 }
             }
             if(playinput.equals("paper")) {
                 if (cpumove.equals("rock")) {
                     System.out.println("The computer throws rock!");
                     System.out.println("You Win!");
                     break;
                 }
                 if (cpumove.equals("paper")) {
                     System.out.println("The computer throws paper!");
                     System.out.println("It's a tie!");
                     break;
                 }
                 if (cpumove.equals("scissors")) {
                     System.out.println("The computer throws scissors");
                     System.out.println("You Lose!");
                     break;
                 }
             }
             if(playinput.equals("scissors")) {
                 if (cpumove.equals("rock")) {
                     System.out.println("The computer throws rock!");
                     System.out.println("You Lose!");
                     break;
                 }
                 if (cpumove.equals("paper")) {
                     System.out.println("The computer throws paper!");
                     System.out.println("You Win!");
                     break;
                 }
                 if (cpumove.equals("scissors")) {
                     System.out.println("The computer throws scissors");
                     System.out.println("It's a tie!");
                     break;
                 }
             }
         }

    }
}
