import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numberToGuess = rand.nextInt(5) + 1;
        int attempts = 3, guess;

        System.out.println("🎯 Guess a number between 1 and 5. You have 3 attempts!");

        while (attempts > 0) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            if (guess == numberToGuess) {
                System.out.println("✅ Correct! You win!");
                break;
            } else {
                attempts--;
                if (attempts > 0)
                    System.out.println("❌ Wrong! Try again. Attempts left: " + attempts);
                else
                    System.out.println("Game Over! The number was: " + numberToGuess);
            }
        }
        input.close();
    }
}
