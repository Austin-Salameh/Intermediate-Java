/*Austin Salameh
*09/28/20
*debug week 7
*
*/
class Vehicle {
    protected String make = "Ferrari";
    public void engineRev() {
      System.out.println("Vroom! Vroom!");
    }
  }
  
  class Car extends Vehicle {
    private String model = "488 Spider";
    public static void main(String[] args) {
      Car myFastCar = new Car();
      myFastCar.engine();
      System.out.println(myFastCar.type + " " + myFastCar.model);
    }
  }