package quizApp;

import quizApp.core.Quiz;
import quizApp.quizCreation.QuizCreator;

public class Main {
    public static void main(String[] args) {
        QuizCreator quizCreator = new QuizCreator();
        Quiz quiz = quizCreator.sampleQuiz();
        quiz.start();
    }
}