import java.text.NumberFormat;
import java.util.Scanner;
import java.util.Random;

public class Purchase {

    private int invoiceNumber;
    private double saleAmount, tax;
    private static double salesTax = .075;

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    // Set method for saleAmount also calculating the tax
    public void setSaleAmount(double saleAmount) {
        this.saleAmount = saleAmount;
        this.tax = saleAmount * salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    // Display method to neatly display all appropriate information
    // Include formatting to display double number as a dollar amount
    public void display() {
        NumberFormat ft = NumberFormat.getCurrencyInstance();
        System.out.println("*** SALE INFORMATION ***");
        System.out.println("========================");
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Amount: " + "\t\t" + ft.format(saleAmount));
        System.out.println("Tax: " + "\t\t\t" + ft.format(tax));
    }

    public static void main(String[] args) {

        Random rn = new Random();
        Scanner sc = new Scanner(System.in);

        // Create instance of the "Purchase" Object
        Purchase newPurchase = new Purchase();

        // Generate a realistic invoice number
        int invoiceNumber = rn.nextInt();

        // Have a user input a sale amount for the object saleAmount
        System.out.print("Enter the amount of your item: ");
        double saleAmount = sc.nextDouble();

        // Initialize object values with appropriate variables
        newPurchase.setInvoiceNumber(invoiceNumber);
        newPurchase.setSaleAmount(saleAmount);

        // Print out sale information
        System.out.println();
        newPurchase.display();
    }

}