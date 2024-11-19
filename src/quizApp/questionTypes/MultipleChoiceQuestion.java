package quizApp.questionTypes;

import java.util.List;

public record MultipleChoiceQuestion(String question, List<String> answers, List<String> correctAnswers) {
}