/*
*Austin Salameh- (9/16/20)
*Assignment 5.2-debugger5
*Two syntax errors can be found within the code below. 
*
*/

class debugger5 
{ 
    public static void main (String[] args)  
    {          
      // declares an Array of integers. 
      int arr; 
          
      // allocating memory for 5 integers. 
      arr = new int[5]; 
          
      // initialize the first elements of the array 
      arr[0] = 25; 
          
      // initialize the second elements of the array 
      arr[1] = 50; 
          
      //so on... 
      arr[2] = 75; 
      arr[3] = 100; 
      arr[4] = 125; 
          
      // accessing the elements of the specified array 
      for (int i = 0; i < arrlength; i++) 
         System.out.println("Element at index " + i +  
        " : "+ arr[i]);           
    } 
} 
