public class Animal {
    String breed;
    String name;
    int age;
    String gender;
    int weight;
    String movement;
    String eats;

    public Animal(String breed, String name, int age, String gender, int weight, String movement, String eats)
    {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.movement = movement;
        this.eats = eats;
    }

    public void speak()
    {
        System.out.println("Hello, my name is " + name + " I am a " + breed);
        System.out.println("\nI am " + weight + " pounds");
        System.out.println("\nI am " + age + " years old");
    }

    public void eat()
    {
        System.out.println("Eating...");
    }

    public void sleep()
    {
        System.out.println( "Sleeping...");
    }
 
}
