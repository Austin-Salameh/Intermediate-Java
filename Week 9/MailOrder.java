/*
*Austin Salameh
*10/17/2020
*Assignment 9.1
*Write an application for a mail order company. 
*The program uses a data entry screen in which the user types an item number and a quantity. 
*Write each record to a file. Save your file as MailOrder.java.
*
*/

import java.nio.file.*; 
import java.io.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;  

     public class MailOrder 
     {  public static void main(String[] args)
          {  
              Scanner input = new Scanner(System.in);
                Path file =  Paths.get("MailOrder.txt");
                Path fullFile = file.toAbsolutePath();
                  String s ="";
                    String delimiter =",";
                      int itemNum;
                        int quantity;
                            final int QUIT = 999; 
                             try  
                             {  
                                 OutputStream output = new  BufferedOutputStream(Files.newOutputStream(fullFile, CREATE));
                                  BufferedWriter writer = new  BufferedWriter(new OutputStreamWriter(output));
                                    System.out.print("Enter item number >>");
                                    itemNum = input.nextInt();
                                        
                                      while(itemNum != QUIT) 
                                        {  
                                        System.out.print("Enter quantity of item #"+  itemNum + " >>");
                                        input.nextLine(); 
                                            quantity = input.nextInt();
                                                s = itemNum + delimiter + quantity;
                                                  writer.write(s, 0, s.length());
                                                    writer.newLine();
                                                      System.out.print("Enter next item number or " +  QUIT + " to quit >>");
                                                      itemNum = input.nextInt();
                                                      }  
                                                      writer.close();
                                                      } 
                                                       catch(Exception e) 
                                                       {  
                                                           System.out.println("Message: " + e);
                                                      }  
                                                    } 
                                                 } 

 
