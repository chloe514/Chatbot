import java.util.Scanner;

public class Chatbot {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Call methods to interact with the user
        greetUser();
        String name = askAndRepeatName(scanner); // Capture the user's name and ask to repeat
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
     * Method to ask the user for their name and then ask them to repeat it.
     * @param scanner Scanner object to read user input
     * @return The user's name
     */
    public static String askAndRepeatName(Scanner scanner) {
        System.out.println("Please tell me your name:");
        String name = scanner.nextLine();

        System.out.println("Can you please repeat your name?");
        String repeatedName = scanner.nextLine();

        if (repeatedName.equals(name)) {
            System.out.println("Nice to meet you, " + repeatedName + "!");
        } else {
            System.out.println("It seems there was a mistake. Your original name was " + name + ".");
        }

        return name;
    }

    /**
     * Method to guess the user's age based on their responses.
     * @param scanner Scanner object to read user input
     */
    public static void guessAge(Scanner scanner) {
        System.out.println("I will try to guess your age. Answer the following questions:");

        // Ask the user about rotary phone
        System.out.println("Do you remember using a rotary phone? (yes/no)");
        String phone = scanner.nextLine().trim().toLowerCase();

        // Ask the user about their high school graduation year
        System.out.println("What year did you graduate high school?");
        int graduationYear = getValidYear(scanner);

        // Generate a random age guess based on the graduation year
        int currentYear = 2024; // You might want to update this based on the current year
        int ageGuess = currentYear - graduationYear;

        // Display the age guess to the user
        System.out.println("I guess you are around " + ageGuess + " years old!");
    }

    /**
     * Method to get a valid graduation year from the user.
     * @param scanner Scanner object to read user input
     * @return Valid graduation year
     */
    private static int getValidYear(Scanner scanner) {
        int year = -1;
        while (year < 1900 || year > 2024) { // Assuming graduation year should be in this range
            System.out.println("Please enter a valid graduation year (between 1900 and 2024):");
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine(); // Clear the buffer
            } else {
                scanner.next(); // Clear invalid input
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        return year;
    }

    /**
     * Method to count to a number specified by the user.
     * @param scanner Scanner object to read user input
     */
    public static void countToNumber(Scanner scanner) {
        System.out.println("Enter a number, and I will count to it:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid number:");
            scanner.next(); // Clear invalid input
        }
        int number = scanner.nextInt();
        System.out.println("Counting to " + number + ":");
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        scanner.nextLine(); // Clear the buffer after nextInt()
    }

    /**
     * Method to test the user's programming knowledge with a multiple-choice question.
     * @param scanner Scanner object to read user input
     */
    public static void testProgrammingKnowledge(Scanner scanner) {
        String correctAnswer = "B";
        String userAnswer;

        System.out.println("Let's test your programming knowledge!");
        System.out.println("Which keyword is used to define a class in Java?");
        System.out.println("A. method");
        System.out.println("B. class");
        System.out.println("C. function");
        System.out.println("D. object");

        do {
            System.out.println("Enter your answer (A, B, C, or D):");
            userAnswer = scanner.nextLine().trim().toUpperCase();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("Incorrect. Try again.");
            }
        } while (!userAnswer.equals(correctAnswer));

        System.out.println("Correct! The keyword to define a class in Java is 'class'.");
    }
}






