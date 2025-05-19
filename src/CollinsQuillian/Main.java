package CollinsQuillian;

import CollinsQuillian.Constants.Constants;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(Constants.OPENING_MESSAGE);
        QuestionProcessor questionProcessor = new QuestionProcessor();

        while (true) {
            String question = scanner.nextLine();
            if (question.equalsIgnoreCase("Finish")) break;

            String answer = questionProcessor.answerQuestion(question);
            System.out.println("Answer: " + answer);
        }
    }
}
