/*Austin Salameh- 09/19/2020
*Assignment 5.1
*
*Write an application with an array that holds 5 instances of the SchoolTextBook class, filled without prompting the user for input. Next prompt the used to enter a field for sorting, 
*sort the array of objects based on the user input, and then display the newly sorted array of objects. Save this class in a file titled SchoolTextBookSort.java.
*/


import java.util.Arrays;
import java.util.Scanner;


public class SchoolTextBookSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array with 5 elements
        SchoolTextBook [] booksArr = new SchoolTextBook[5];

        // Create 5 textbooks for each index in the array
        SchoolTextBook bookOne = new SchoolTextBook("Leiserson", "Introduction to Algorithms", 1312, 12345789, 100.99);
        SchoolTextBook bookTwo = new SchoolTextBook("Casteel", "Oracle 12c: SQL", 627, 1123344, 84.23);
        SchoolTextBook bookThree = new SchoolTextBook("Heldman", "CompTIA Project+", 280, 232345567, 98.17);
        SchoolTextBook bookFour = new SchoolTextBook("Farrell", "Java Programming", 472, 987654321, 155.87);
        SchoolTextBook bookFive = new SchoolTextBook("Coronel", "Database Systems", 398, 112233445, 121.25);

        // Fill index in the array with each object
        booksArr[0] = bookOne;
        booksArr[1] = bookTwo;
        booksArr[2] = bookThree;
        booksArr[3] = bookFour;
        booksArr[4] = bookFive;

        // sort options displayed for the user
        System.out.println("Choose a number to sort the data:");
        System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
        System.out.print("Sort Method Choice: ");
        String selection = sc.next();

      
        // Input should be of numeric value
        for (int i = 0; i < selection.length(); i++)
        while (Character.isLetter(selection.charAt(i)) ) {
            System.out.println();
            System.out.println("Input must be a numeric value of 1 through 5.");
            System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
            System.out.print("Re-enter Sort Method: ");
            selection = sc.next();
        }

        int intSelection = Integer.parseInt(selection);

        // Check to see if input is within the parameters
        while (intSelection < 1 || intSelection > 5) {
            System.out.println();
            System.out.println("ERROR: Input was larger than 5 or less than 1.");
            System.out.println("1) Author\n2) Title\n3) Page Count\n4) ISBN\n5) Price ");
            System.out.print("Re-enter Sort Method: ");
            intSelection = sc.nextInt();
        }


       
        // Compare classes that were created in SchoolTextBook.java using a switch method
        switch (intSelection) {
            case 1:
                Arrays.sort(booksArr, new SchoolTextBook.CompareAuthor());
                break;
            case 2:
                Arrays.sort(booksArr, new SchoolTextBook.CompareTitle());
                break;
            case 3:
                Arrays.sort(booksArr, new SchoolTextBook.ComparePageCount());
                break;
            case 4:
                Arrays.sort(booksArr, new SchoolTextBook.CompareISBN());
                break;
            case 5:
                Arrays.sort(booksArr, new SchoolTextBook.ComparePrice());
                break;
        }
        
        System.out.println("\n\n");

        // Loop through the array to output results
        for (int i = 0; i < booksArr.length; i++) {
            System.out.println(booksArr[i]);
        }
//close the scanner
sc.close();

    }
}
