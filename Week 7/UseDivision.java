/*Austin Salameh - 10/04/2020 
*Assignment 7.1
*Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).  
*Save the files as: Division, InternationalDivision, DomesticDivision, and UseDivision.
*
*/
public class UseDivision {
    public static void main(String[] args) {

        // Create an array 
        Object[] divisionArr = new Object[4];

        // Create two instances of each subclass (InternationalDivision and Domestic Division)
        InternationalDivision divisionOne = new InternationalDivision("Software Developer", 123456, "Kuwait", "Arabic");
        InternationalDivision divisionTwo = new InternationalDivision("Administration", 654321, "Japan", "Japanese");
        DomesticDivision divisionThree = new DomesticDivision("HR", 00112233, "South Dakota");
        DomesticDivision divisionFour = new DomesticDivision("Project Manager", 33221100, "New Jersey");

        // Add instances to the array
        divisionArr[0] = divisionOne.display();
        divisionArr[1] = divisionTwo.display();
        divisionArr[2] = divisionThree.display();
        divisionArr[3] = divisionFour.display();


        // output all instances to console
        System.out.println("---Bellevue Inc---");

        for (Object division : divisionArr) {
            System.out.println(division);
            System.out.println();
        }

    }
}
