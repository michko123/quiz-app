package quizApp.questionTypes;

import java.util.List;

public record SingleChoiceQuestion(String question, List<String> answers, String correctAnswer) {
}