/*Austin Salameh- 09/28/2020
*Assignment 6.1
*
*Create a class named Student that includes String data fields titled firstName and lastName, and an integer field titled studentID. 
*Create a constructor that requires two String parameters and one integer parameter to populate the firstName, lastName, and studentID fields. 
*Create a LinkedList of 20 Student objects each having different first names, last names, and student IDs. 
*Print your LinkedList, first in the order your items were placed onto the LinkedList and then in reverse order. Save your files as Student.java and ClassRoster.java.
*/


import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class classRoster {
    public static void main(String[] args) {

        List<Student> students = new LinkedList<Student>();

        students.add(new Student("Jim", "Cramer", 1));
        students.add(new Student("Tim", "Hamer", 2));
        students.add(new Student("Chad", "Boon", 3));
        students.add(new Student("Hank", "Artimeis", 4));
        students.add(new Student("Linda", "Oaks", 5));
        students.add(new Student("Sequoia", "Swimmer", 6));
        students.add(new Student("Laura", "Beasley", 7));
        students.add(new Student("Lebron", "James", 8));
        students.add(new Student("Lionel", "Messi", 9));
        students.add(new Student("Virgil", "Van Diyk", 10));
        students.add(new Student("Joe", "Biden", 11));
        students.add(new Student("Donald", "Trump", 12));
        students.add(new Student("Leonardo", "Da Vinci", 13));
        students.add(new Student("Edgar", "Allen Poe", 14));
        students.add(new Student("Nancy", "Pelosi", 15));
        students.add(new Student("Debrah", "Oligard", 16));
        students.add(new Student("Carson", "Wentz", 17));
        students.add(new Student("Miles", "Sanders", 18));
        students.add(new Student("Fletcher", "Cox", 19));
        students.add(new Student("Doug", "Pederson", 20));

   System.out.println("--Original Order--");
        ListIterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("ID Number: " + student.getstudentID() + " First Name: " + student.getfName() + " Last Name: "+ student.getlName());
        }
        System.out.println("\n");

        System.out.println("--Reverse Order--");
        ListIterator<Student> reverseIterator = students.listIterator(students.size());
        while (reverseIterator.hasPrevious()) {
             Student student = reverseIterator.previous();
            System.out.println("ID Number: " + student.getstudentID() + " First Name: " + student.getfName() + " Last Name: "+ student.getlName());
    }
}

}
