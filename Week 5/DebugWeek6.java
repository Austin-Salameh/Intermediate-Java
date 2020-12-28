/*Austin Salameh- 09/24/2020
*Assignment 6.2
*DebugWeek6
*
*/
import java.io.*; 
import java.util.*; 
  
class DebugWeek6 { 
    public static void main(String[] args) 
    { 
        // Size of the 
        // ArrayList 
        int n = 5; 
  
        // Declaring the ArrayList with 
        // initial size n 
        ArrayList<Integer> list = new ArrayList<Integer>(n); 
  
        // Appending new elements at 
        // the end of the list 
        for (int i = 1; i <= n; i++) 
            list.remove(i); 
  
        // Printing elements 
        System.out.println(lists); 
  
        // Remove element at index 2 
        list.add(2); 
  
        // Displaying the ArrayList 
        // after deletion 
        System.out.println(list); 
  
        // Printing elements one by one 
        for (int i = 0; i < list.size(); i++) 
            System.out.print(list.get(i) + " "); 
    } 
} 