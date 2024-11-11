// Write a Java program that generates a random number between 1 and 100 and allows the user to guess the number.
// The program should give hints whether the guessed number is too high or too low,and count the number of attempts until the correct number is guessed.

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 101);
        int guess;

        int attempts = 0;
        do {
            System.out.print("Guess the number between 1 and 100 :");
            guess = sc.nextInt();
        
            if (guess > randomNum) {
                System.out.println("Too High Try Again");
            } else if (guess < randomNum) {
                System.out.println("Too Low Try Again");
            } else {
                System.out.println("Congratulations! You guessed it right");
                break;
            }
            attempts++;

        } while (guess != randomNum);
        System.out.println("Total Attempts: " + attempts);
        sc.close();

    }

}
