import java.util.Scanner;
import java.util.Random;

public class exampleLottery {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in); 

        //Generate four random numbers
       int min= 0, max=9;
        int randomNumOne = (int)(Math.random()*((max-min)+1))+min;
        int randomNumTwo = (int)(Math.random()*((max-min)+1))+min;
        int randomNumThree = (int)(Math.random()*((max-min)+1))+min;
        int randomNumFour = (int)(Math.random()*((max-min)+1))+min;

        //Get 4 guesses from the user input
        System.out.print("Enter a guess: ");
        int guessOne= input.nextInt();

        System.out.print("Enter a guess: ");
        int guessTwo= input.nextInt(); 

        System.out.print("Enter a guess: ");
        int guessThree= input.nextInt();

        System.out.print("Enter a guess: ");
        int guessFour= input.nextInt();
        
//initialize matches and compare each guess to the random number generated using an if statment and logical OR operator
        int match= 0;
        if (guessOne == randomNumOne || guessOne == randomNumTwo || guessOne == randomNumThree || guessOne == randomNumFour){
            match +=1;
        }
        if (guessTwo == randomNumOne || guessTwo == randomNumTwo || guessTwo == randomNumThree || guessTwo == randomNumFour){
            match +=1;
        }
        if (guessThree == randomNumOne || guessThree == randomNumTwo || guessThree == randomNumThree || guessThree == randomNumFour){
            match +=1;
        }
        if (guessFour == randomNumOne || guessFour == randomNumTwo || guessFour == randomNumThree || guessFour == randomNumFour){
            match +=1;
        }

        //initialize total number of points based on correct matches from user input
        int points = 0;
        switch(match)
        {
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
                //print these statements in order on the console at the end by invoking each method
                System.out.println(printPlayerGuesses(guessOne, guessTwo, guessThree, guessFour));
                System.out.println(printRandomNumbers(randomNumOne, randomNumTwo, randomNumThree, randomNumFour));
                System.out.println(printMatches(match, points));
    }
                public static String printPlayerGuesses(int guessOne,int guessTwo,int guessThree,int guessFour) {
                    return "Your Guesses: " + guessOne + ", " + guessTwo + ", " + guessThree + ", " + guessFour;
                }
                public static String printRandomNumbers(int randomNumOne,int randomNumTwo,int randomNumThree,int randomNumFour) {
                    return "Random Numbers: " + randomNumOne + ", " + randomNumTwo + ", " + randomNumThree + ", " + randomNumFour;
                }
                public static String printMatches (int one, int two) {
                    return "You got " + one + " match(es) " +  " for a total of " + two + " points!";
                }
}
