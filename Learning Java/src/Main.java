import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String question = "What is the largest planet in our solar system?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";
        String correctAnswer = choiceTwo;

        // Write a print statement asking the question
        System.out.println(question);

        // Write a print statement giving the answer choices
        System.out.println("1) "  + choiceOne);
        System.out.println("2) "  + choiceTwo);
        System.out.println("3) "  + choiceThree);

        // Prompt the user for input
        Scanner scanner = new Scanner(System.in);

        // Retrieve the user's input
        String input = scanner.next();

        // If the user's input matches the correctAnswer...
        // then the user is correct and we want to print out a congrats message to the user
        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats. That's the correct answer!");
        } else {
            // If the user's input does not match the correctAnswer...
            // then the user is incorrect and we want to print out a message to the user with the correct answer
            System.out.println("Sorry, the correct answer is: " + correctAnswer);
        }
    }
}
