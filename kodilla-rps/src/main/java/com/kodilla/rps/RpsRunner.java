package com.kodilla.rps;

import java.util.Scanner;

import static java.lang.System.in;

public class RpsRunner {
    public static void main(String[] args){

        Game game = new Game();
        GameExtended gameExtended = new GameExtended();

        System.out.println("Hello player!\n\nWhat's Your name?");
        Scanner scanName = new Scanner(in);
        String playerName = scanName.nextLine();

        System.out.println("Hello " + playerName + "\nDo You wanna play a game? [Y = yes / N = no]");
        Scanner scanPlayGame = new Scanner(in);
        char playGameAnswer = scanPlayGame.next().trim().toLowerCase().charAt(0);

        while (playGameAnswer != 'n' &&
                playGameAnswer != 'y') {
            System.out.println("Please put 'Y' to play or 'N' to end game");
            Scanner scanPlayGameSecondTime = new Scanner(in);
            playGameAnswer = scanPlayGameSecondTime.next().trim().charAt(0);
        }

        while(playGameAnswer == 'y' ||
                playGameAnswer == 'n') {

            //how many rounds question
            if (playGameAnswer == 'y') {
                System.out.println("Do You wanna try harder version? [Y = yes / N = no]\n(Paper, Rock, Scissors, Lizard, Spock)");
                Scanner scanHarderOrNormal = new Scanner(in);
                char playHarderOrNormal = scanHarderOrNormal.next().trim().toLowerCase().charAt(0);

                //bad answer
                if (playHarderOrNormal != 'n' &&
                        playHarderOrNormal != 'y'){
                    System.out.println("Choose game version or press 'X' to end game\n");
                    System.out.println("Do You wanna try harder version? [Y = yes / N = no]");
                    Scanner scanHarderOrNormalSecond = new Scanner(in);
                    playHarderOrNormal = scanHarderOrNormalSecond.next().trim().toLowerCase().charAt(0);
                }

                //harder version
                if(playHarderOrNormal == 'y'){
                    System.out.println("ok, let's play hard version\nHow many rounds do You wanna play?");
                    Scanner scanRounds = new Scanner(in);
                    while (!scanRounds.hasNextInt()){
                        System.out.println("Please enter the number");
                        scanRounds = new Scanner(in);
                    }

                    int scannedNumberOfRounds = scanRounds.nextInt();
                    System.out.println("Launching a " + scannedNumberOfRounds + "-round game, good luck!");
                    gameExtended.launchGame(scannedNumberOfRounds);
                    playGameAnswer = 'z';
                }

                //normal version
                if(playHarderOrNormal == 'n'){
                    System.out.println("ok, let's play normal version\nHow many rounds do You wanna play?");
                    Scanner scanRounds = new Scanner(in);
                    while (!scanRounds.hasNextInt()){
                        System.out.println("Please enter the number");
                        scanRounds = new Scanner(in);
                    }

                    int scannedNumberOfRounds = scanRounds.nextInt();
                    System.out.println("Launching a " + scannedNumberOfRounds + "-round game, good luck!");
                    game.launchGame(scannedNumberOfRounds);
                    playGameAnswer = 'z';
                }

                //ending game during harder/normal choice
                if(playHarderOrNormal == 'x'){
                    System.out.println("Sorry to hear that, see You soon ;)");
                    playGameAnswer = 'z';
                }
            }

            //ending game after texting name
            if (playGameAnswer == 'n') {
                System.out.println("Sorry to hear that, see You soon ;)");
                playGameAnswer = 'z';
            }
        }
    }
}
