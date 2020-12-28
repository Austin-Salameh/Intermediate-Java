  public static String checkForNumber (String password)
  {
 String numbers = "0123456789";
 String workingString = "0";
 workingString = password.toUpper();
 for (int i=0; i<workingString.length(); i++)
 {
 for (int x=0; x<number.length(); x++)
 {
 if (workingString(i) == number(x))
 return ("yes");
 }
 }
 return ("no");