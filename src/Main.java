import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Scanner userInput = new Scanner(System.in);

        int attemptsLeft = 3;
        Random rand = new Random();
        int computerGuess = rand.nextInt(10);
        computerGuess += 1;


        System.out.println("Welcome to the number guessing game!\n");


        do {
            if (attemptsLeft > 0) {

                System.out.println("\nYou have " + attemptsLeft + " attempts left");
                System.out.println("Please guess a number between 1 - 10");
                int userGuess = userInput.nextInt();

                if (userGuess == computerGuess) {
                    System.out.println("Congratulations, you guessed the correct number! The computer chose number " + computerGuess);
                    break;
                } else {
                    System.out.println("Sorry, that was incorrect.");

                    attemptsLeft--;
                    if (attemptsLeft == 0) {
                        System.out.println("\n**** Game Over ****");
                        System.out.println("*The Number was " + computerGuess + " *");
                        System.out.println("****  You Lose ****");
                    } else {
                        System.out.println("Guess Again!");
                    }
                }
            }
        } while (attemptsLeft > 0) ;
    }
}