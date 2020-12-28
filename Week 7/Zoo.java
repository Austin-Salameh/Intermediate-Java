

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal("horse", "Bucky", 10, "male", 780, "gallup", "hay");
        Animal animal2 = new Animal("penguin", "Macaroni", 2, "female" , 110, "slide", "fish");
        Animal animal3 = new Animal("dog", "Charlie", 5, "male", 44, "bark", "dog food");
        Bird bird1 = new Bird();
        bird1.fly();

        animal1.speak();
        animal2.speak();
        animal3.speak();
        animal3.eat(); 

    }
}
