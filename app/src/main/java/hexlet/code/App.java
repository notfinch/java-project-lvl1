package hexlet.code;

import main.java.hexlet.code.Cli;
import main.java.hexlet.code.Even;
import main.java.hexlet.code.Calc;
import main.java.hexlet.code.GCD;
import main.java.hexlet.code.Progression;
import main.java.hexlet.code.Prime;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    private static final int GREETING_CODE_GAME = 1;
    private static final int EVEN_CODE_GAME = 2;
    private static final int CALC_CODE_GAME = 3;
    private static final int GCD_CODE_GAME = 4;
    private static final int PROGRESSION_CODE_GAME = 5;
    private static final int PRIME_CODE_GAME = 6;

    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        Scanner sc = new Scanner(System.in);
        int gameCode = 0;
        try {
            gameCode = sc.nextInt();
        } catch (InputMismatchException exception) {
            //do nothing
        }
        switch (gameCode) {
            case GREETING_CODE_GAME:
                Cli.greeting();
                break;
            case EVEN_CODE_GAME:
                Even evenGame = new Even();
                String evenPlayerName = Cli.greeting();
                evenGame.playGame(evenPlayerName, evenGame.getMessage());
                break;
            case CALC_CODE_GAME:
                Calc calcGame = new Calc();
                String calcPlayerName = Cli.greeting();
                calcGame.playGame(calcPlayerName, calcGame.getMessage());
                break;
            case GCD_CODE_GAME:
                GCD gcdGame = new GCD();
                String gcdPlayerName = Cli.greeting();
                gcdGame.playGame(gcdPlayerName, gcdGame.getMessage());
                break;
            case PROGRESSION_CODE_GAME:
                Progression progressionGame = new Progression();
                String progressionPlayerName = Cli.greeting();
                progressionGame.playGame(progressionPlayerName,
                        progressionGame.getMessage());
                break;
            case PRIME_CODE_GAME:
                Prime primeGame = new Prime();
                String primePlayerName = Cli.greeting();
                primeGame.playGame(primePlayerName,
                        primeGame.getMessage());
                break;
            default:
                //do nothing
        }
    }
}
