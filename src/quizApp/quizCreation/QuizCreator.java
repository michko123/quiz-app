package quizApp.quizCreation;

import quizApp.core.Quiz;
import quizApp.questionTypes.SingleChoiceQuestion;
import quizApp.questionTypes.MultipleChoiceQuestion;
import java.util.ArrayList;
import java.util.List;

public class QuizCreator {

    public Quiz sampleQuiz() {
        List<SingleChoiceQuestion> scQuestions = new ArrayList<>();
        List<MultipleChoiceQuestion> mcQuestions = new ArrayList<>();

        // Create single-choice questions
        List<String> scOptions1 = new ArrayList<>();
        scOptions1.add("3");
        scOptions1.add("4");
        scOptions1.add("5");

        scQuestions.add(new SingleChoiceQuestion("What is 2 + 2?", scOptions1, "b"));


        List<String> scOptions2 = new ArrayList<>();
        scOptions2.add("8");
        scOptions2.add("9");
        scOptions2.add("10");

        scQuestions.add(new SingleChoiceQuestion("What is 3 * 3?", scOptions2, "b"));

        // Create multiple-choice questions
        List<String> mcOptions1 = new ArrayList<>();
        mcOptions1.add("2");
        mcOptions1.add("4");
        mcOptions1.add("5");
        mcOptions1.add("6");

        mcQuestions.add(new MultipleChoiceQuestion("Which of the following numbers are prime?", mcOptions1, List.of("a", "c"))); // "2" and "5" are correct

        List<String> mcOptions2 = new ArrayList<>();
        mcOptions2.add("1");
        mcOptions2.add("2");
        mcOptions2.add("3");
        mcOptions2.add("4");

        mcQuestions.add(new MultipleChoiceQuestion("Which of the following numbers are even?", mcOptions2, List.of("b", "d"))); // "2" and "4" are correct

        // Return a new Quiz instance with the created questions
        return new Quiz(scQuestions, mcQuestions);
    }
}
