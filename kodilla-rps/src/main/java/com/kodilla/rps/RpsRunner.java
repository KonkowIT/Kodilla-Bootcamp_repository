package com.kodilla.rps;

import java.io.InputStream;
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
        char playGameAnswer = scanPlayGame.next().trim().charAt(0);

        while (playGameAnswer != 'N' &&
                playGameAnswer != 'Y' &&
                playGameAnswer != 'n' &&
                playGameAnswer != 'y') {
            System.out.println("Please put 'Y' to play or 'N' to end game");
            Scanner scanPlayGameSecondTime = new Scanner(in);
            playGameAnswer = scanPlayGameSecondTime.next().trim().charAt(0);
        }

        while(playGameAnswer == 'y' ||
                playGameAnswer == 'Y' ||
                playGameAnswer == 'N' ||
                playGameAnswer == 'n') {

            if (playGameAnswer == 'Y' ||
                    playGameAnswer == 'y') {
                System.out.println("Do You wanna try harder version? [Y = yes / N = no]");
                Scanner scanHarderOrNormal = new Scanner(in);
                char playHarderOrNormal = scanHarderOrNormal.next().trim().charAt(0);

                if (playHarderOrNormal != 'N' &&
                        playHarderOrNormal != 'Y' &&
                        playHarderOrNormal != 'n' &&
                        playHarderOrNormal != 'y'){
                    System.out.println("Choose game version or press 'X' to end game\n");
                    System.out.println("Do You wanna try harder version? [Y = yes / N = no]");
                    Scanner scanHarderOrNormalSecond = new Scanner(in);
                    playHarderOrNormal = scanHarderOrNormalSecond.next().trim().charAt(0);
                }

                if(playHarderOrNormal == 'Y' || playHarderOrNormal == 'y'){
                    System.out.println("ok, let's play hard version\nHow many rounds do You wanna play?");
                    Scanner scanRounds = new Scanner(in);
                    int scannedNumberOfRounds = scanRounds.nextInt();
                    gameExtended.launchGame(scannedNumberOfRounds);
                    playGameAnswer = 'z';
                }

                if(playHarderOrNormal == 'N' || playHarderOrNormal == 'n'){
                    System.out.println("ok, let's play normal version\nHow many rounds do You wanna play?");
                    Scanner scanRounds = new Scanner(in);
                    int scannedNumberOfRounds = scanRounds.nextInt();
                    game.launchGame(scannedNumberOfRounds);
                    playGameAnswer = 'z';
                }

                if(playHarderOrNormal == 'X' || playHarderOrNormal == 'x'){
                    System.out.println("Sorry to hear that, see You soon ;)");
                    playGameAnswer = 'z';
                }

            }

            if (playGameAnswer == 'N' ||
                    playGameAnswer == 'n') {
                System.out.println("Sorry to hear that, see You soon ;)");
                playGameAnswer = 'z';
            }
        }
    }
}
