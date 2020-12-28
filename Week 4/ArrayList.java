import java.util.Arrays;

public class ArrayList {
    /*  @param args the command line arguments     */   

public static void main(String[] args) 
{       

 int[] array = { 100, 1516, 23, 20, 11, 21, 55, 32, 3, 4 };    

 
 System.out.println("Array before sorting : " + Arrays.toString(array));     

Arrays.sort(array);

System.out.printf("Array sorted in ascending order : %s", 
                    Arrays.toString(array));

      }
    }
