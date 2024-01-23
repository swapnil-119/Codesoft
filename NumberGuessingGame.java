import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attemptsLimit = 10;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            
            int generatedNumber = random.nextInt(maxRange - minRange + 1) + minRange;

           
            System.out.println("\nGuess the number between " + minRange + " and " + maxRange + ":");
            
            for (int attempts = 1; attempts <= attemptsLimit; attempts++) {
                System.out.print("Attempt " + attempts + ": ");
                int userGuess = scanner.nextInt();

                
                if (userGuess == generatedNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += attempts;
                    break;
                } else if (userGuess < generatedNumber) {
                    System.out.println("No. is lower than this! Try again.");
                } else {
                    System.out.println("No. is higher than this! Try again.");
                }

                if (attempts == attemptsLimit) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was: " + generatedNumber);
                }
            }

          
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();

            if (playAgain.equals("no")) {
                break;
            }
        } while (true);

       
        System.out.println("Your total score is: " + score);

        scanner.close();
    }
}
