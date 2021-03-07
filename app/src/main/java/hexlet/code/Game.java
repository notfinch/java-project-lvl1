package main.java.hexlet.code;

import java.util.Objects;
import java.util.Scanner;

public abstract class Game {

    private static final int COUNT_QUESTION = 3;

    public abstract String getAnswer();

    public abstract String getQuestion();

    public abstract void generateTour();

    public final void playGame(final String name,
                         final String message) {
        final Scanner sc = new Scanner(System.in);
        System.out.println(message);
        for (int i = 0; i < COUNT_QUESTION; i++) {
            while (true) {
                generateTour();
                final String question = getQuestion();
                final String answer = getAnswer();
                System.out.println("Question: " + question);

                final String userAnswer = sc.next();

                System.out.println("Your answer: " + userAnswer);
                if (Objects.equals(answer, userAnswer)) {
                    System.out.println("Correct!");
                    break;
                } else {
                    i = 0;
                    System.out.println("'" + userAnswer
                            + "' is wrong answer ;(. Correct answer was '"
                            + answer + "'");
                    System.out.println("Let's try again, " + name + "!");
                }
            }
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
