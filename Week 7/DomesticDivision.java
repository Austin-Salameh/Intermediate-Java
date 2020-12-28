/*Austin Salameh - 10/04/2020 
*Assignment 7.1
*The DomesticDivision class include a field for the state in which the division is located and a constructor that requires all fields when created.
*
*/

public class DomesticDivision extends Division 
{
    private String state;

    // Constructor with additional state attribute
    public DomesticDivision(String divisionName, int accountNum, String state) 
    {
        super(divisionName, accountNum);
        this.state = state;
    }
    
    public String getState() 
    {
        return state;
    }
    
    public void setState(String state) 
    {
        this.state = state;
    }

    public String display() {
        return "Division: " + getDivisionName() + "\n" + "Account Number: " + getAccountNum() + "\n" + "State: " + state;
    }
}
