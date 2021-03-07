package main.java.hexlet.code;

public final class GCD extends Game {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;

    private String answer;

    private String question;

    private final String message =
            "Find the greatest common divisor of given numbers.";

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
        int firstNumber = rand(MIN_NUMBER, MAX_NUMBER);
        int secondNumber = rand(MIN_NUMBER, MAX_NUMBER);
        question = firstNumber + " " + secondNumber;
        while (secondNumber != 0 && firstNumber != 0) {
            if (secondNumber > firstNumber) {
                secondNumber = secondNumber % firstNumber;
            } else {
                firstNumber = firstNumber % secondNumber;
            }
        }
        answer = String.valueOf(secondNumber + firstNumber);
    }
}
