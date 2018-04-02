package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class GameExtended {
    private int end = 1;

    public void launchGame(int scannedNumberOfRounds) {
        int sumPlayer = 0;
        int sumPC = 0;
        System.out.println("\n");

        while (end < scannedNumberOfRounds + 1) {
            while (end < scannedNumberOfRounds + 1) {
                System.out.println("Round #" + end);
                System.out.println("Choose rock, paper, scissors, lizard or spock");
                Scanner scanRPS = new Scanner(System.in);
                String chosenRPS = scanRPS.nextLine().trim().toLowerCase();

                //random numbers generator
                Random generator = new Random();
                int randomInt = generator.nextInt(5);

                //bad answer
                while (!chosenRPS.equals("rock") &&
                        !chosenRPS.equals("scissors") &&
                        !chosenRPS.equals("paper") &&
                        !chosenRPS.equals("lizard") &&
                        !chosenRPS.equals("spock") &&
                        !chosenRPS.equals("x") &&
                        !chosenRPS.equals("n") &&
                        !chosenRPS.equals("y")) {
                    System.out.println("You need to choose correct figure");
                    Scanner scanRPSSecond = new Scanner(System.in);
                    chosenRPS = scanRPSSecond.nextLine().trim().toLowerCase();
                }

                //options of play, computer choose 0 - rock
                if (randomInt == 0 && chosenRPS.equals("rock")) {
                    System.out.println("Computer choose rock\nIt's draw!");
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 0 && chosenRPS.equals("scissors")) {
                    System.out.println("Computer choose rock\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 0 && chosenRPS.equals("paper")) {
                    System.out.println("Computer choose rock\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 0 && chosenRPS.equals("lizard")) {
                    System.out.println("Computer choose rock\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 0 && chosenRPS.equals("spock")) {
                    System.out.println("Computer choose rock\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                //options of play, computer choose 1 - paper
                if (randomInt == 1 && chosenRPS.equals("rock")) {
                    System.out.println("Computer choose paper\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 1 && chosenRPS.equals("scissors")) {
                    System.out.println("Computer choose paper\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 1 && chosenRPS.equals("paper")) {
                    System.out.println("Computer choose paper\nIt's draw!");
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 1 && chosenRPS.equals("lizard")) {
                    System.out.println("Computer choose paper\nYou Win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 1 && chosenRPS.equals("spock")) {
                    System.out.println("Computer choose paper\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                //options of play, computer choose 2 - scissors
                if (randomInt == 2 && chosenRPS.equals("rock")) {
                    System.out.println("Computer choose scissors\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 2 && chosenRPS.equals("scissors")) {
                    System.out.println("Computer choose scissors\nIt's draw!");
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 2 && chosenRPS.equals("paper")) {
                    System.out.println("Computer choose scissors\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 2 && chosenRPS.equals("lizard")) {
                    System.out.println("Computer choose scissors\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 2 && chosenRPS.equals("spock")) {
                    System.out.println("Computer choose scissors\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                //options of play, computer choose 3 - lizard
                if (randomInt == 3 && chosenRPS.equals("rock")) {
                    System.out.println("Computer choose lizard\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 3 && chosenRPS.equals("scissors")) {
                    System.out.println("Computer choose lizard\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 3 && chosenRPS.equals("paper")) {
                    System.out.println("Computer choose lizard\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 3 && chosenRPS.equals("lizard")) {
                    System.out.println("Computer choose lizard\nIt's draw!");
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 3 && chosenRPS.equals("spock")) {
                    System.out.println("Computer choose lizard\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                //options of play, computer choose 4 - spock
                if (randomInt == 4 && chosenRPS.equals("rock")) {
                    System.out.println("Computer choose spock\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 4 && chosenRPS.equals("scissors")) {
                    System.out.println("Computer choose spock\nYou lose!");
                    sumPC++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 4 && chosenRPS.equals("paper")) {
                    System.out.println("Computer choose spock\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 4 && chosenRPS.equals("lizard")) {
                    System.out.println("Computer choose spock\nYou win!");
                    sumPlayer++;
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                if (randomInt == 4 && chosenRPS.equals("spock")) {
                    System.out.println("Computer choose spock\nIt's draw!");
                    System.out.println("Result is " + sumPlayer + " : " + sumPC + "\n");
                    end++;
                }

                //end game
                if (chosenRPS.equals("x")) {
                    System.out.println("Are You shure, You want to end game?");
                    Scanner scanYOrN = new Scanner(System.in);
                    String chosenYOrN = scanYOrN.nextLine().toLowerCase().trim();

                    if (chosenYOrN.equals("y")) {
                        end = scannedNumberOfRounds + 1;
                    } else {
                        System.out.println("Let's resume the game");
                    }
                }

                //new game
                if (chosenRPS.equals("n")) {
                    System.out.println("Are You shure, You want start a new game? You will lose actual score");
                    Scanner scanYOrN = new Scanner(System.in);
                    String chosenYOrN = scanYOrN.nextLine().trim().toLowerCase();

                    if (chosenYOrN.equals("y")) {
                        end = 1;
                        sumPC = 0;
                        sumPlayer = 0;
                    } else {
                        System.out.println("Let's resume the game");
                    }
                }
            }

            System.out.println("That's all. Final score of " + (end - 1) + " rounds is " + max(sumPC, sumPlayer) + " to " + min(sumPC, sumPlayer));
            if (sumPC > sumPlayer) {
                System.out.println("Computer win, maybe next time" + "\n");
            }
            if (sumPC < sumPlayer) {
                System.out.println("Congrats, You win!" + "\n");
            }

            System.out.println("What do You want to do now? [X = end game / N = start new game]");
            Scanner scanYOrN = new Scanner(System.in);
            char chosenYOrN = scanYOrN.next().trim().toLowerCase().charAt(0);

            while (chosenYOrN != 'x' &&
                    chosenYOrN != 'n') {
                System.out.println("You need to choose what do You want to do now [X = end game / N = start new game]");
                Scanner scanYOrNSecond = new Scanner(System.in);
                chosenYOrN = scanYOrNSecond.next().trim().toLowerCase().charAt(0);
            }

            if (chosenYOrN == 'n') {
                end = 1;
                sumPC = 0;
                sumPlayer = 0;
            }

            if (chosenYOrN == 'x') {
                end = scannedNumberOfRounds + 1;
            }
        }

        System.out.println("\nBye bye ;-)");
    }
}
