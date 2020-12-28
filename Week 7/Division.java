/*Austin Salameh - 10/04/2020 
*Assignment 7.1
*Create an abstract Division class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses. 
*Use a constructor in the superclass that requires values for both fields.  Create two subclasses named InternationalDivision and DomesticDivision.
*/

public abstract class Division {

    private String divisionName;
    private int accountNum;

    public Division(String divisionName, int accountNum)
    {
       this.divisionName = divisionName;
       this.accountNum = accountNum;
    }
    public String getDivisionName()
    {
        return divisionName;
    }

    public int getAccountNum()
    {
        return accountNum;
    }
   
    public void setDivisionName(String divisionName)
    {
        this.divisionName = divisionName;
    }
   
    public void setAccount(int accountNum)
    {
        this.accountNum = accountNum;
    }
}

    
