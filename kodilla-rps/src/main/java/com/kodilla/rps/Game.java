package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class Game {
    int end = 1;

    public void launchGame(int scannedNumberOfRounds) {
        int sumPlayer = 0;
        int sumPC = 0;
        System.out.println("\n");

        while (end < scannedNumberOfRounds + 1) {
            System.out.println("Round #" + end);
            System.out.println("Choose rock, paper or scissors");
            Scanner scanRPS = new Scanner(System.in);
            String chosenRPS = scanRPS.nextLine();

            //random numbers generator
            int randomInt = ThreadLocalRandom.current().nextInt(0, 2 + 1);

            //options of play, computer choose 0
            if (randomInt == 0 && chosenRPS.equals("rock")){
                System.out.println("Computer choose rock\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 0 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose rock\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 0 && chosenRPS.equals("paper")){
                System.out.println("Computer choose rock\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //options of play, computer choose 1
            if (randomInt == 1 && chosenRPS.equals("rock")){
                System.out.println("Computer choose paper\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 1 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose paper\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 1 && chosenRPS.equals("paper")){
                System.out.println("Computer choose paper\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //options of play, computer choose 2
            if (randomInt == 2 && chosenRPS.equals("rock")){
                System.out.println("Computer choose scissors\nYou win!");
                sumPlayer++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 2 && chosenRPS.equals("scissors")){
                System.out.println("Computer choose scissors\nIt's draw!");
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            if (randomInt == 2 && chosenRPS.equals("paper")){
                System.out.println("Computer choose scissors\nYou lose!");
                sumPC++;
                System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                end++;
            }

            //bad answer
            /*if (!chosenRPS.equals("paper") ||
                    !chosenRPS.equals("scissors") ||
                    !chosenRPS.equals("paper")){
                System.out.println("You need to write correct figure");
            }*/

            String sumPlayerString = Integer.toString(sumPlayer);
            String sumPCString = Integer.toString(sumPC);
            String result = sumPCString + " : " + sumPlayerString;
        }
        System.out.println("That's all. Final score of " + (end - 1) + " rounds is " + max(sumPC, sumPlayer) + " to " + min(sumPC, sumPlayer) + "\n");
        if (sumPC > sumPlayer){ System.out.println("Computer win, maybe next time"); }
        if (sumPC < sumPlayer){ System.out.println("Congrats, You win!"); }
        System.out.println("\nBye bye ;-)");
    }
}
