/* Austin Salameh
*School: Bellevue University
*Assignment: 1.1
*Date: August 23, 2020
*
*Purpose: Create a class that calculates and displays the conversion of an entered number of dollars into currency denominations - 100s, 50s, 20s, 10s, 5s, and 1s.  
*Obtain all inputs and display all outputs using dialog boxes.  Save the class as Dollars.Java. 
*/

import javax.swing.JOptionPane;
public class Dollars {
    public static void main(String [] args){

        int dollarAmount, hundreds, fifties, twenties, tens, fives, ones;
        String input;

        input = JOptionPane.showInputDialog(null, "Please enter a dollar amount: ");
        dollarAmount = Integer.parseInt(input);

        hundreds = dollarAmount /100;
        dollarAmount %=100;
        fifties = dollarAmount /50;
        dollarAmount %=50;
        twenties = dollarAmount /20;
        dollarAmount %=20;
        tens = dollarAmount /10;
        dollarAmount %=10;
        fives = dollarAmount /5;
        dollarAmount %=5;
        ones = dollarAmount /1;
        dollarAmount %=1;

        JOptionPane.showMessageDialog(null, "The dollar amount entered was: " + input + "\n100's: " + 
        hundreds + "\n50's: " + fifties + "\n20's: " + 
        twenties + "\n10's: " + tens + "\n5's: " + fives + "\n1's: " + ones);
      
        System.exit(0);
      }
    }