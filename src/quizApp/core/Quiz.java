package quizApp.core;

import quizApp.questionTypes.SingleChoiceQuestion;
import quizApp.questionTypes.MultipleChoiceQuestion;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private final List<SingleChoiceQuestion> singleChoiceQuestions;
    private final List<MultipleChoiceQuestion> multipleChoiceQuestions;

    public Quiz(List<SingleChoiceQuestion> singleChoiceQuestions, List<MultipleChoiceQuestion> multipleChoiceQuestions) {
        this.singleChoiceQuestions = singleChoiceQuestions;
        this.multipleChoiceQuestions = multipleChoiceQuestions;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int singleChoiceScore = 0;
        int multipleChoiceScore = 0;
        int totalMultipleChoiceCorrectAnswers = 0;

        for (SingleChoiceQuestion question : singleChoiceQuestions) {
            System.out.println(question.question());
            for (int i = 0; i < question.answers().size(); i++) {
                System.out.println((char) ('a' + i) + ". " + question.answers().get(i));
            }
            System.out.print("Enter your answer: ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(question.correctAnswer())) {
                singleChoiceScore++;
            }
        }

        for (MultipleChoiceQuestion question : multipleChoiceQuestions) {
            System.out.println(question.question());
            for (int i = 0; i < question.answers().size(); i++) {
                System.out.println((char) ('a' + i) + ". " + question.answers().get(i));
            }
            System.out.print("Enter your answers (e.g. abcd): ");
            String answer = scanner.nextLine();
            for (String correctAnswer : question.correctAnswers()) {
                if (answer.contains(correctAnswer)) {
                    multipleChoiceScore++;
                }
            }
            totalMultipleChoiceCorrectAnswers += question.correctAnswers().size();
        }

        int totalSingleChoiceQuestions = singleChoiceQuestions.size();

        System.out.println("Your total score is " + (singleChoiceScore + multipleChoiceScore) +
                ". You got " + singleChoiceScore + " out of " + totalSingleChoiceQuestions + " single-choice questions correct, and " +
                multipleChoiceScore + " out of " + totalMultipleChoiceCorrectAnswers + " multiple-choice answers correct.");
    }
}