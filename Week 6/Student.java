/*Austin Salameh- 09/28/2020
*Assignment 6.1
*
*Create a class named Student that includes String data fields titled firstName and lastName, and an integer field titled studentID. 
*Create a constructor that requires two String parameters and one integer parameter to populate the firstName, lastName, and studentID fields. 
*Create a LinkedList of 20 Student objects each having different first names, last names, and student IDs. 
*Print your LinkedList, first in the order your items were placed onto the LinkedList and then in reverse order. Save your files as Student.java and ClassRoster.java.
*/


public class Student {

    private String fName; 
    private String lName;
    private int studentID;

    //constructor with parameters fname, lname, studentID
public Student(String fName, String lName, int studentID) {
    this.fName = fName;
    this.lName = lName;
    this.studentID = studentID;
}

public String getfName() {
    return fName;
}
public void setfName(String fName) {
    this.fName = fName;
}
public String getlName() {
    return lName;
}
public void setlName(String lName) {
    this.lName= lName;
}
public int getstudentID() {
    return studentID;
}
public void setstudentID(int studentID) {
    this.studentID = studentID;
}

}