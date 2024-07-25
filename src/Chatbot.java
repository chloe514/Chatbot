import java.util.Scanner;
import java.util.Random;

public class Chatbot {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Call methods to interact with the user
        greetUser();
        askName(scanner);
        guessAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    /**
     * Method to greet the user.
     */
    public static void greetUser() {
        System.out.println("Hi there! Welcome to the ChatBot.");
    }

    /**
     * Method to ask the user for their name and acknowledge it.
     * @param scanner Scanner object to read user input
     */
    public static void askName(Scanner scanner) {
        // Prompt user for their name
        System.out.println("Please tell me your name:");
        // Read the name input from the user
        String name = scanner.nextLine();
        // Acknowledge the user's name
        System.out.println("Nice to meet you, " + name + "!");
    }

    /**
     * Method to guess the user's age based on their preferences.
     * @param scanner Scanner object to read user input
     */
    public static void guessAge(Scanner scanner) {
        System.out.println("I will try to guess your age. Answer the following questions:");

        // Ask the user about their seasonal preference
        System.out.println("Do you prefer summer or winter? (summer/winter)");
        String season = scanner.nextLine();

        // Ask the user about their drink preference
        System.out.println("Do you prefer coffee or tea? (coffee/tea)");
        String drink = scanner.nextLine();

        // Generate a random age guess between 10 and 40
        int ageGuess = new Random().nextInt(30) + 10;
        // Display the age guess to the user
        System.out.println("I guess you are around " + ageGuess + " years old!");
    }

    /**
     * Method to count to a number specified by the user.
     * @param scanner Scanner object to read user input
     */
    public static void countToNumber(Scanner scanner) {
        // Prompt the user to enter a number
        System.out.println("Enter a number, and I will count to it:");
        // Read the number input from the user
        int number = scanner.nextInt();

        // Display the counting process
        System.out.println("Counting to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public Chatbot() {
    }

    /**
     * Method to test the user's programming knowledge with a multiple-choice question.
     * @param scanner Scanner object to read user input
     */
    public static void testProgrammingKnowledge(Scanner scanner) {
        // Correct answer for the multiple-choice question
        String correctAnswer = "B";
        String userAnswer;

        // Introduction to the programming knowledge test
        System.out.println("Let's test your programming knowledge!");
        System.out.println("Which keyword is used to define a class in Java?");
        System.out.println("A. method");
        System.out.println("B. class");
        System.out.println("C. function");
        System.out.println("D. object");

        // Loop until the user provides the correct answer
        do {
            System.out.println("Enter your answer (A, B, C, or D):");
            userAnswer = scanner.nextLine().toUpperCase();

            // Check if the user's answer is correct
            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("Incorrect. Try again.");
            }
        } while (!userAnswer.equals(correctAnswer));

        // Inform the user that they answered correctly
        System.out.println("Correct! The keyword to define a class in Java is 'class'.");
    }
}

