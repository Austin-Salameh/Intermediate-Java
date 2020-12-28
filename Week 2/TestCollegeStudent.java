/*
*Austin Salameh 
*August 29th, 2020
*Assignment 2.2
*Bellevue University
*
*Create an interactive application that prompts the user for data for two CollegeStudent objects. 
*Prompt the user for first name, last name, enrollment month, enrollment day, and enrollment year for each CollegeStudent, and then instantiate the objects.
* Display all the values, including the projected graduation dates.  Save the application as TestCollegeStudent.java
*
*/

import java.util.Scanner;
import java.util.GregorianCalendar;

public class TestCollegeStudent {

    public static void main(final String [] args) {
        final Scanner scan = new Scanner(System.in);
        

        // Create a CollegeStudent array
        final CollegeStudent arr[] = new CollegeStudent[2];

        
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Student " + (i+1) + " First Name: ");
            final String firstName = scan.next();

            System.out.println("Student " + (i+1) + " Last Name: ");
            final String lastName = scan.next();

            System.out.println("Student " + (i+1) + " Enrollment Year (ex: 2020): ");
            final int year = scan.nextInt();

            System.out.println("Student " + (i+1) + " Enrollment Month (ex: 5): ");
            final int month = scan.nextInt();

            System.out.println("Student " + (i+1) + " Enrollment Day (ex: 20): ");
            final int day = scan.nextInt();

            // Create date for the enrollmentDate
            final GregorianCalendar cal = new GregorianCalendar(year, month, day);

            // Create object student
            final CollegeStudent student = new CollegeStudent(firstName, lastName, cal);

            // Each array is a new instance of CollegeStudent object
            arr[i] = student;

            System.out.println();
        }

        // Print each instance of a student the information that was input.
        System.out.println("Student Information");
        System.out.println("-".repeat(109));
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scan.close();
    }

}