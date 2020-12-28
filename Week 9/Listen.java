import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class Listen extends Thread{

  JTextArea textArea1;
  JTextArea textArea2;
  JTextArea textArea3;
  JTextArea textArea4;

  Socket socket;
  ServerSocket serverSocket;

  int test = 0;

  public Listen(Socket socket, JTextArea textArea1,
                               JTextArea textArea2,
                               JTextArea textArea3,
                               JTextArea textArea4,
                               ServerSocket serverSocket){

    this.socket = socket;

    this.textArea1 = textArea1;
    this.textArea2 = textArea2;
    this.textArea3 = textArea3;
    this.textArea4 = textArea4;

    this.serverSocket = serverSocket;
  }

  public void run(){

    while(true){

      try{

        socket = serverSocket.accept(); // Required try catch

        switch(test){
          case 0:
            new HandleClientIN(socket, textArea1).start();
            test++;
            break;
          case 1:
            new HandleClientIN(socket, textArea2).start();
            test++;
            break;
          case 2:
            new HandleClientIN(socket, textArea3).start();
            test++;
            break;
          case 3:
            new HandleClientIN(socket, textArea4).start();
            test = 0;
            break;
        } // switch
      } // try
      catch(Exception e){

        System.out.println("Error");
      } // catch
    } // while
  } // run
}