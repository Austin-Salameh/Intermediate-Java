public class Earth {
    public static void main(String[] args) 
    {
        Human human1 = new Human("Bobby", 28, 88, "red");
        Human human2 = new Human("Boy", 18, 98, "brown");
        Human human3 = new Human("Bob", 27, 78, "blue");

        human1.speak();
        human2.speak();
        human3.speak();
    }
}
