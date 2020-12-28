/*
*Austin Salameh
*Bellevue University
*9/10/2020
*Assignment 4.1 -Write an application that accepts a user's password from an input dialogs.  When the entered password is less than six characters, more than 10 characters
*or does not contain at least one letter and one digit, prompt the user again.  When the user's entry meets all the password requirements, prompt the user to reenter the password, 
*and do not let the user continue until the second password matches the first one.  Save the file as Password.java.
*
*/

import javax.swing.JOptionPane;
  
public class Password  
  {  
      public static void main(String[] args)  { 

     String newPassword = JOptionPane.showInputDialog(null, "Please enter a password", "Password", 1);

     while(true) {
         int passwordLength = newPassword.length();
         boolean valid = true;

         if (passwordLength < 6 || passwordLength > 10) {
             valid= false; 
         }
         else {
             boolean lettersFound = false;
             boolean digitsFound = false;
             int letterCount = 0;
             int digitCount = 0;

             char[] chars = newPassword.toCharArray();
             int charsLength = chars.length;

             for (int i = 0; i < charsLength; i++) {
                 if (Character.isLetter(chars[i])) {
                     letterCount +=1;
                     if (letterCount > 0) { 
                         lettersFound = true;
                     }
                    }
             if (Character.isDigit(chars[i])) {
                digitCount += 1;
             if (digitCount > 0) {
                digitsFound = true;
          }

         }

        }

        if (lettersFound && digitsFound) {
            valid = true;
        } 
        else 
        {
            valid = false;
        }
    }

    if (valid) 
    {
        break;
    }

    newPassword = JOptionPane.showInputDialog(null, 
    "Please re-enter a password" + "\nPassword did not meet the criteria:" + "\nbetween 6-10 characters" + "\nMust contain at least 1 character and 1 digit","Password Error", 1);
    
    }

    String confirmPassword = JOptionPane.showInputDialog(null, "Please confirm your password ", "Confirm Password", 1);

        while (true) 
        {
            if (newPassword.equals(confirmPassword)) {
                break;
            }

            confirmPassword = JOptionPane.showInputDialog(null, "Password doesn't match"
            + "\nPlease re-enter the password " + "Password Error", 1);
}

    JOptionPane.showMessageDialog(null, "Password Is Confirmed! ",
    "Password Confirmed", 1);
    }
}
  
    
