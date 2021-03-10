package main.java.hexlet.code;

public final class Calc extends Game {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 10;
    private static final int PLUS = 1;
    private static final int MINUS = 2;
    private static final int MULTIPLY = 3;

    private String answer;

    private String question;

    private final String message =
            "What is the result of the expression?";

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
        final int firstNumber = Game.rand(MIN_NUMBER, MAX_NUMBER);
        final int secondNumber = Game.rand(MIN_NUMBER, MAX_NUMBER);
        final int operation = Game.rand(1, 3);
        switch (operation) {
            case PLUS:
                question = firstNumber + " + " + secondNumber + ": ";
                answer = String.valueOf(firstNumber + secondNumber);
                break;
            case MINUS:
                question = firstNumber + " - " + secondNumber + ": ";
                answer = String.valueOf(firstNumber - secondNumber);
                break;
            case MULTIPLY:
                question = firstNumber + " * " + secondNumber + ": ";
                answer = String.valueOf(firstNumber * secondNumber);
                break;
            default:
                //do nothing
        }
    }
}
