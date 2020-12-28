/*Austin Salameh - 10/04/2020 
*Assignment 7.1
*The InternationalDivision class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created. 
*
*/

public class InternationalDivision extends Division {

    private String country, language;

    // Constructor with addtional country and langauge attribute
    public InternationalDivision(String divisionName, int accountNum, String country, String language) {
        super(divisionName, accountNum);
        this.country = country;
        this.language = language;
    }
    
    public String getCountry()
    {
        return country;
    }
    public void setCountry(String country)
    {
        this.country= country;
    }
    public String getLanguage()
    {
        return language;
    }
    public void setLanguage(String language)
    {
        this.language = language;
    }
public String display() 
{
    return "Division: " + getDivisionName() + "\n" + "Account Number: " +getAccountNum() + "\n" + "Country: " + country +  "\n" + "Language: " + language; 
}
}
