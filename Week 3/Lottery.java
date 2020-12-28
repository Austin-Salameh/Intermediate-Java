/*
*Assignment 3.1
*Austin Salameh - Bellevue University
*September 4th, 2020
*  Create a lottery game application.  Generate four random numbers, each between 0 and 9 (inclusive).  Allow the user to guess four numbers. 
*  Compare each of the user’s guesses to the four random numbers and display a message that includes the user’s guess, the randomly determined four-digit number
*and the amount of points the user has won as follows (Correct-Points awarded): 0-0, 1-5, 2-100, 3-2,000, 4-1,000,000.
*/
import java.util.Scanner;
import java.util.Random;

public class Lottery {

    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        // Generate 4 random numbers from 1 = 10
        int maxRandom = 10;
        int minRandom = 1;
        int randomOne = rn.nextInt(maxRandom - minRandom + 1) + minRandom;
        int randomTwo = rn.nextInt(maxRandom - minRandom + 1) + minRandom;
        int randomThree = rn.nextInt(maxRandom - minRandom + 1) + minRandom;
        int randomFour = rn.nextInt(maxRandom - minRandom + 1) + minRandom;

        // Retrieve 4 guesses from user
        System.out.println("Enter first guess: ");
        int guessOne = sc.nextInt();
        System.out.println("Enter second guess: ");
        int guessTwo = sc.nextInt();
        System.out.println("Enter third guess: ");
        int guessThree = sc.nextInt();
        System.out.println("Enter fourth guess: ");
        int guessFour = sc.nextInt();

        // Initialize number of matches
        // Separate if statements to determine if a user's guess matches any one of the randomly generated numbers
        int match = 0;
        if (guessOne == randomOne || guessOne == randomTwo || guessOne == randomThree || guessOne == randomFour) {
            match += 1;
        }
        if (guessTwo == randomOne || guessTwo == randomTwo || guessTwo == randomThree || guessTwo == randomFour) {
            match += 1;
        }
        if (guessThree == randomOne || guessThree == randomTwo || guessThree == randomThree || guessThree == randomFour) {
            match += 1;
        }
        if (guessFour == randomOne || guessFour == randomTwo || guessFour == randomThree || guessFour == randomFour) {
            match += 1;
        }

        // Initialize the points score
        // Change points dependent on number of matches
        int points = 0;
        switch (match) {
            case 1:
                points = 5;
                break;
            case 2:
                points = 100;
                break;
            case 3:
                points = 2000;
                break;
            case 4:
                points = 1000000;
                break;
        }

        System.out.println(printGuesses(guessOne, guessTwo, guessThree, guessFour));
        System.out.println(printRandoms(randomOne, randomTwo, randomThree, randomFour));
        System.out.println(printPoints(match, points));
    }

public static String printGuesses (int guessOne, int guessTwo, int guessThree, int guessFour) {
    return "Your guesses were: \t\t" + guessOne + ", " + guessTwo + ", " + guessThree + ", " + guessFour;
}
    public static String printRandoms(int one, int two, int three, int four) {
        return "The random numbers were: " + one + ", " + two + ", " + three + ", " + four;
    }

    public static String printPoints(int one, int two) {
        return "Number of points for " + one + " match(es): " + two;
    }
}