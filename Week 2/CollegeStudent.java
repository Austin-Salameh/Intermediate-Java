/*
*Austin Salameh 
*August 29th, 2020
*Assignment 2.2
*Bellevue University
*
*Create a CollegeStudent class.  This class will contain data fields that hold a student's first name, last name,
*enrollment date, and projected graduation date, using the GregorianCalendar class for each date. 
*Provide get() and set() methods for each field.
*Also provide a constructor that requires first and last names and enrollment date,
*and sets the project graduation date to exactly four years after enrolment.  Save the class as CollegeStudent.java.
*/

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CollegeStudent {

    private String firstName, lastName;
    private GregorianCalendar enrollmentDate, projectedGradDate;

    public CollegeStudent(String firstName, String lastName, GregorianCalendar enrollmentDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.enrollmentDate = enrollmentDate;
        int day = enrollmentDate.get(Calendar.DAY_OF_MONTH);
        int month = enrollmentDate.get(Calendar.MONTH);
        int year = enrollmentDate.get(Calendar.YEAR);
        GregorianCalendar cal = new GregorianCalendar(year+4, month, day);

        setProjectedGradDate(cal);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public GregorianCalendar getEnrollmentDate() {
        return enrollmentDate;
    }
    public void setEnrollmentDate(GregorianCalendar enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
    public GregorianCalendar getProjectedGradDate() {
        return projectedGradDate;
    }
    public void setProjectedGradDate(GregorianCalendar projectedGradDate) {
        this.projectedGradDate = projectedGradDate;
    }
    // Format date to read: month/day/year 
    public static String format(GregorianCalendar date){
        Date newDate = date.getTime();
        SimpleDateFormat fmt = new SimpleDateFormat("MM-dd-yyyy");
        String dateFormatted = fmt.format(newDate);
        return dateFormatted;
    }
    // Return input data and display it
    public String toString() {
        return "First Name : "+firstName+"\t Last Name : "+lastName+"\t Enrollment Date : "+format(enrollmentDate)+"\t Graduation Date : "+format(projectedGradDate);
    }
}