import java.net.*;
import java.io.*;

class ClientSend extends Thread{

  // Example:
  // String name = "Darrell";
  // Change here
  String name = "ClientSend";

  public void run(){

    try {

      // Make change here
      // Example:
      // Socket connectToServer = new Socket("192.168.1.1", 8000);
      // Change here
      Socket connectToServer = new Socket("127.0.0.1", 8000);

      PrintWriter write = new PrintWriter(connectToServer.getOutputStream(), true);

      write.println("Test text from Client " + name);
    }
    catch (IOException e) {

      e.printStackTrace();
    }
  }
}