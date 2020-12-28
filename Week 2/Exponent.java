/*
*Austin Salameh 
*August 29th, 2020
*Assignment 2.1
*Bellevue University
*
*Create a public class named Exponent.  Inside the main method of this class, obtain a double input using a dialog box. 
*Pass the input value to a non-static method that returns the square value of the parameter. 
*Display the return value of the method using an output dialog.  Next pass the input value to a non-static method that returns the cube of the parameter. 
*Display the return value of the method using an output dialog.  Save the class as Exponent.java.
*
*/

import javax.swing.*;

public class Exponent {

    public static void main (String [] args) {

        String userInput;
        double number, sqAnswer, cubeAnswer;
        Exponent squared = new Exponent();
        Exponent cubed = new Exponent();

        userInput = JOptionPane.showInputDialog(null, "Enter a number: ");
        number = Double.parseDouble(userInput);

        sqAnswer = squared.squareMethod(number);
        cubeAnswer = cubed.cubeMethod(number);


        //Display box with user previous users input number calling on the squaredMethod
        JOptionPane.showMessageDialog(null,"Number entered: " + userInput + "\n\n" +
                "Number squared: " + sqAnswer);

        //Display box with user previous users input number calling on the cubedMethod
        JOptionPane.showMessageDialog(null,"Number entered: " + userInput + "\n\n" +
                "Number cubed: " + cubeAnswer);
    }

    public double squareMethod(double number) {
        double sq;
        sq = Math.pow(number, 2);

        return sq;
    }

    public double cubeMethod(double number) {
        double cube;
        cube = Math.pow(number, 3);

        return cube;
    }
}