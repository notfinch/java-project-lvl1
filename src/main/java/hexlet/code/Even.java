package main.java.hexlet.code;

public final class Even extends Game {

    private static final int IS_EVEN = 0;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final String YES = "yes";
    private static final String NO = "no";

    private String answer;

    private String question;

    private final String message =
            "Answer 'yes' if number even otherwise answer 'no'.";

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String getAnswer() {
        return answer;
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public void generateTour() {
        final int number = rand(MIN_NUMBER, MAX_NUMBER);
        question = String.valueOf(number);
        final int evenCheck = number % 2;
        if (evenCheck == IS_EVEN) {
            answer = YES;
        } else {
            answer = NO;
        }
    }
}
