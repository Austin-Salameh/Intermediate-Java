import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

class HandleClientIN extends Thread{

  private Socket socket;
  private JTextArea textArea;

  public HandleClientIN(Socket socket, JTextArea textArea){

    this.socket = socket;
    this.textArea = textArea;
  }

  public void run(){

    String data;

    try{

      BufferedReader in = new BufferedReader(
                          new InputStreamReader(
                          socket.getInputStream()));

      while((data = in.readLine()) != null){

        textArea.append(data + "\n");
      }
    }
    catch(Exception e){

    }
  }
}
