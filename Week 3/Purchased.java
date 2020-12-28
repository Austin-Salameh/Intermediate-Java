import java.util.Scanner;  

public class Purchase  
{  
    public static void main(String[] args)  
    {  
        double item_Cost;
        int invoice = 0;  
        int response;    
        final double sales_Tax = 0.075;
        
        Scanner keyboard = new Scanner(System.in);  
        System.out.print("Enter item price >");  
        double price = keyboard.nextDouble();  





        System.out.println("Do you want to add another item to the list?"); 
         System.out.print("Enter 1 for yes");  
         System.out.print(" or any other number for no >>");  
         response = keyboard.nextInt();  while(response == 1) 

         {  
             item_Cost = price * sales_Tax;
             System.out.print("Invoice Number: " + invoice);  
             System.out.println("Initial cost" + price + " multiplied by the " + sales_Tax +  " sales tax, the final total is:  $"+ item_Cost);   
             System.out.println("\nDo you want to see the balance " +  "at the end of another year?");  
             System.out.print("Enter 1 for yes");  
             System.out.print(" or any other number for no >>");  
             response = keyboard.nextInt();  
            }  
        }

	public void setInvoiceNumber(int invoiceNumber) {
	}

	public void setSaleAmount(double saleAmount) {
	}

	public void display() {
    } 
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    Purchase newPurchase = new Purchase();

    int invoice = rand.nextInt()+1;

    System.out.print("Enter the amount of the item: " + item_cost)
     } 

