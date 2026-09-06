import java.util.Random;
import java.util.Scanner;

public class Simplenumbergussinggame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String playAgain = "yes";

        while (playAgain.equalsIgnoreCase("yes")) {

            int secretNumber = random.nextInt(100) + 1;
            int maxAttempts = 7;
            int attempts = 0;
            boolean won = false;

            System.out.println("\n================================");
            System.out.println("       NUMBER GUESSING GAME");
            System.out.println("================================");
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (attempts < maxAttempts) {

                System.out.print("\nEnter your guess: ");

                if (!sc.hasNextInt()) {
                    System.out.println("Please enter a number only.");
                    sc.next();
                    continue;
                }

                int guess = sc.nextInt();

                if (guess < 1 || guess > 100) {
                    System.out.println("Enter a number between 1 and 100.");
                    continue;
                }

                attempts++;

                if (guess == secretNumber) {
                    System.out.println("Correct! You won!");
                    System.out.println("Attempts used: " + attempts);

                    int score = (maxAttempts - attempts + 1) * 10;
                    System.out.println("Your score: " + score);

                    won = true;
                    break;
                }
                else if (guess < secretNumber) {
                    System.out.println("Too Low! Try again.");
                }
                else {
                    System.out.println("Too High! Try again.");
                }

                System.out.println("Attempts left: " + (maxAttempts - attempts));
            }

            if (!won) {
                System.out.println("\nGame Over!");
                System.out.println("The correct number was: " + secretNumber);
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = sc.next();
        }

        System.out.println("\nThanks for playing!");
        sc.close();
    }
}