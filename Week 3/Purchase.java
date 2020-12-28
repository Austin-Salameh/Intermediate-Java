/*
*Assignment 3.2
*Austin Salameh - Bellevue University
*September 4th, 2020
*Create a class named Purchase.  Each Purchase contains an invoice number, amount of sale, and amount of sales tax.
*clude set methods for the invoice number and sale amount.  Within the set() method for the sale amount, calculate the sales tax as 7.5% 
*(using a static field in the Purchase class) of the sale amount.  Also include a display method that displays a purchase's details in a well formatted output display.  
*
*/

import java.util.Scanner;
import java.util.Random;

public class Purchase {

    int invoice;
    Double saleAmount, tax;
    public static double salesTax = .075;

    public void setInvoiceNumber(final int invoice) {
        this.invoice = invoice;
    }

    // Set method for saleAmount also calculating the tax
    public void setSaleAmount(final double saleAmount) {
        this.saleAmount = saleAmount;
        this.tax = saleAmount * salesTax;
    }

    public void setSalesTax(final double salesTax) {
        this.salesTax = salesTax;
    }

    public void display() {
        System.out.println("\tSale Invoice");
        System.out.println("Invoice Number: " + invoice);
        System.out.println("Amount: " + "\t\t$" + saleAmount);
        System.out.println("Tax: " + "\t\t\t$" + tax);
    }

    public static void main(final String[] args) {

        final Random rand = new Random();
        final Scanner sc = new Scanner(System.in);

        final Purchase newPurchase = new Purchase();

        final int invoice = rand.nextInt(100) + 1;

        System.out.print("Enter the amount of the item: ");
        final double saleAmount = sc.nextDouble();

        newPurchase.setInvoiceNumber(invoice);
        newPurchase.setSaleAmount(saleAmount);

        System.out.println();
        newPurchase.display();
}
}