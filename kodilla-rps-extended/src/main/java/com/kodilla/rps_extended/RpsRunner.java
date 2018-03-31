package com.kodilla.rps_extended;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args){

        Game game = new Game();

        System.out.println("Hello player!\n\nWhat's Your name?");
        Scanner scanName = new Scanner(System.in);
        String playerName = scanName.nextLine();
        char playGameAnswer;

        System.out.println("Hello " + playerName + "\nDo You wanna play a game? [Y = yes / N = no]");
        Scanner scanPlayGame = new Scanner(System.in);
        playGameAnswer = scanPlayGame.next().trim().charAt(0);

        while (playGameAnswer != 'N' &&
                playGameAnswer != 'Y' &&
                playGameAnswer != 'n' &&
                playGameAnswer != 'y') {
            System.out.println("Please put 'Y' to play or 'N' to end game");
            Scanner scanPlayGameSecondTime = new Scanner(System.in);
            playGameAnswer = scanPlayGameSecondTime.next().trim().charAt(0);
        }

        while(playGameAnswer == 'y' ||
                playGameAnswer == 'Y' ||
                playGameAnswer == 'N' ||
                playGameAnswer == 'n') {

            if (playGameAnswer == 'Y' ||
                    playGameAnswer == 'y') {
                System.out.println("ok, let's play\nHow many rounds do You wanna play?");
                Scanner scanRounds = new Scanner(System.in);
                int scannedNumberOfRounds = scanPlayGame.nextInt();
                game.launchGame(scannedNumberOfRounds);
                playGameAnswer = 'z';
            }

            if (playGameAnswer == 'N' ||
                    playGameAnswer == 'n') {
                System.out.println("Sorry to hear that, see You soon ;)");
                playGameAnswer = 'z';
            }
        }
    }
}
