import javax.swing.JOptionPane;

public class pass {

    public static void main(String[] args) {

        // password1 is original password
        // This prompts user for password
        String password1 = JOptionPane.showInputDialog(null,
                "Please enter your password ", "Password", 1);

        // While loop ensure system continues to prompt user until parameters are met
        while (true) {

            int length = password1.length();
            boolean valid = true;

            // Checks whether password meets length requirment
            if (length < 6 || length > 10) {
                valid = false;

            } else {

                // Variable to check whether both letter and digits are found
                // If found counts will be increased
                boolean lettersFound = false;
                boolean digitsFound = false;
                int letterCount = 0;
                int digitCount = 0;

                // Break down original password into an array to check each character
                char[] chars = password1.toCharArray();
                int charsLength = chars.length;

                // Loop through array to check for letters and increment count if found
                // Loop through array to check for digits and increment count if found
                for (int i = 0; i < charsLength; i++) {
                    if (Character.isLetter(chars[i])) {
                        letterCount += 1;
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

                // Check whether both letters and digits were found
                if (lettersFound && digitsFound) {
                    valid = true;
                } else {
                    valid = false;
                }
            }

            // If all parameters are met
            // Loop breaks and user is prompted to confirm password below
            if (valid) {
                break;
            }

            // If not valid user will see the parameters and be asked to re-enter password
            password1 = JOptionPane.showInputDialog(
                    null,
                    "Password must be between 6 and 10 characters\n"
                            + "Password must contain at least 1 character and 1 digit"
                            + "\nPlease re-enter your password",
                    "Invalid Password", 1);
        }

        // password2 is the confirmation password that must match password1
        String password2 = JOptionPane.showInputDialog(null,
                "Please confirm your password ", "Password Confirmation", 1);
        // If passwords match while loop will break to confirmation message
        while (true) {
            if (password1.equals(password2)) {
                break;
            }

            // Not matching passwords will be prompted with a retry
            password2 = JOptionPane.showInputDialog(null, "Password Mismatch"
                    + "\nPlease re-enter your password ", "Password Confirmation Error", 1);
        }

        JOptionPane.showMessageDialog(null, "Password Is Confirmed! ",
                "Password Confirmed", 1);
    }
}
