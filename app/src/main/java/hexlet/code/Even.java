package main.java.hexlet.code;

import java.util.Objects;
import java.util.Scanner;

public class Even {

    private static final int COUNT_QUESTION = 3;
    private static final int IS_EVEN = 0;
    private static final int IS_NOT_EVEN = 1;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String YES = "yes";
    private static final String NO = "no";

    public static void playGame(final String playerName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer '"
                + YES + "' if number even otherwise answer '"
                + NO + "'.");
        for (int i = 0; i < COUNT_QUESTION; i++) {
            int number = rand(MIN_NUMBER, MAX_NUMBER);
            int evenCheck = number % 2;
            String answer;
            if (evenCheck == IS_EVEN) {
                answer = YES;
            } else {
                answer = NO;
            }
            while (true) {
                System.out.println("Question: " + number);
                String userAnswer = sc.next();
                System.out.println("Your answer: " + userAnswer);
                if (Objects.equals(answer, userAnswer)) {
                    System.out.println("Correct!");
                    break;
                } else {
                    i = 0;
                    System.out.println("'" + userAnswer
                            + "' is wrong answer ;(. Correct answer was '"
                            + answer + "'");
                    System.out.println("Let's try again, " + playerName + "!");
                }
            }
            System.out.println("Congratulations, " + playerName + "!");
        }
    }

    private static int rand(final int min, final int max) {
        return (int) ((Math.random() * (max - min)) + min);

    }
}
