package main.java.hexlet.code;

public final class Prime extends Game {

    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String YES = "yes";
    private static final String NO = "no";

    private int basePrimeNumber = 2;

    private String answer;

    private String question;

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
        return "Answer \"yes\" if given number"
                + " is prime. Otherwise answer \"no\".";
    }

    @Override
    public void generateTour() {
        basePrimeNumber = 2;
        int number = rand(MIN_NUMBER, MAX_NUMBER);
        question = String.valueOf(number);
        if (checkIsItANaturalNumber(number)) {
            answer = YES;
        } else {
            answer = NO;
        }
    }

    private boolean checkIsItANaturalNumber(final int number) {
        if (number > 1) {
            if (number == basePrimeNumber) {
                return true;
            } else if (number % basePrimeNumber != 0) {
                basePrimeNumber++;
                return checkIsItANaturalNumber(number);
            } else if (number % basePrimeNumber == 0) {
                return false;
            }
        }
        return false;
    }
}
