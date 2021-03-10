package main.java.hexlet.code;

public final class Progression extends Game {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static final int LENGTH = 10;

    private String answer;

    private String question;

    private final String message =
            "What number is missing in the progression?";

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public void generateTour() {
        int hidePosition = rand(MIN_NUMBER, LENGTH);
        int firstNumber = rand(MIN_NUMBER, MAX_NUMBER);
        int divider = rand(MIN_NUMBER, MAX_NUMBER);
        question = "";
        answer = "";
        for (int i = 0; i < LENGTH; i++) {
            if (i > 0) {
                question = question + " ";
            }
            String currentNumber = String.valueOf(firstNumber + i * divider);
            if (i == hidePosition) {
                question = question + "..";
                answer = currentNumber;
            } else {
                question = question + currentNumber;
            }
            if (i < (LENGTH - 1)) {
                question = question + " ";
            }
        }
    }
}
