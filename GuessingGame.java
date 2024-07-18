import java.util.Random;
import java.util.Scanner;
public class GuessingGame {
            public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rangeStart = 1;
        int rangeEnd = 100;
        int maxAttempts = 10;
        int roundsPlayed = 0;
        int totalAttempts = 0;
        while (true) {
            System.out.println("\nRound " + (roundsPlayed + 1));
            int number = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
            int attempts = 0;
            boolean guessedCorrectly = false;
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess < number) {
                    System.out.println("Too low!");
                } else if (guess > number) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct!");
                    guessedCorrectly = true;
                    break;
                }
            }
            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The number was " + number + ".");
            }
            totalAttempts += attempts;
            roundsPlayed++;
            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); 
            String playAgain = scanner.nextLine().trim().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }
        System.out.println("\nGame Over! You played " + roundsPlayed + " rounds with a total of " + totalAttempts + " attempts.");
        System.out.printf("Average attempts per round: %.2f\n", (double) totalAttempts / roundsPlayed);
        scanner.close();
    }
}
