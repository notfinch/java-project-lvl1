package hexlet.code;

import main.java.hexlet.code.Cli;
import main.java.hexlet.code.Even;
import main.java.hexlet.code.Calc;

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

    public static void main(final String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
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
            default:
                //do nothing
        }
    }
}
