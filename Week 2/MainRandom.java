import java.util.Random;
public class MainRandom {
    public static void main(String[] args) {         

      Random rand = new Random();

        int firstRandomValue = rand.nextInt(101);     

  int secondRandomValue = rand.nextInt(101);
        System.out.println("First int: " + firstRandomValue);   

    System.out.println("Second int: " + secondRandomValue);
        double firstRandomDouble = rand.nextDouble();     

  double secondRandomDouble = rand.nextInt();
        System.out.println("First double: " + firstRandomDouble);   

    System.out.println("Second double: " + secondRandomDouble); 

  }

}