package TASK2_GAME;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Get Ready for the Challenge , Enter your Name ?");
        String name = sc.nextLine();

        System.out.println("well , " + name + ", i am Thinking of a number between 1 and 20");
        int num = getGuessNumber(1, 21);
        int attempts = 0;
        for (int i = 0; i < 6; i++) {
            attempts++;

            Scanner sc2 = new Scanner(System.in);
            System.out.println("Take a Guess");
            int yourguess = sc2.nextInt();
            if (yourguess < num) {
                System.out.println("Too low! Try guessing higher.");
            } else if (yourguess > num) {
                System.out.println("Too high! Try guessing lower.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + num + " correctly!");
                System.out.println("It took you " + attempts + " attempts to win the game.");
                break;
            }
        }

    }

    public static int getGuessNumber(int min, int max) {
        Random random = new Random();
        return random.ints(min, max).findFirst().getAsInt();

    }

}

// ChatGpt

// import java.util.Scanner;
// import java.util.Random;

// public class GuessGame {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// Random random = new Random();

// int generatedNumber = random.nextInt(100) + 1;
// int attempts = 0;
// int userGuess;

// System.out.println("Welcome to the Number Guessing Game!");
// System.out.println("Guess the number between 1 and 100:");

// while (true) {
// userGuess = scanner.nextInt();
// attempts++;

// if (userGuess < generatedNumber) {
// System.out.println("Too low! Try guessing higher.");
// } else if (userGuess > generatedNumber) {
// System.out.println("Too high! Try guessing lower.");
// } else {
// System.out.println("Congratulations! You've guessed the number " +
// generatedNumber + " correctly!");
// System.out.println("It took you " + attempts + " attempts to win the game.");
// break;
// }
// }
// scanner.close();
// }
// }
