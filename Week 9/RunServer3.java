import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class RunServer3{

  private JFrame frame;
  private JTextArea textArea1 = new JTextArea();
  private JTextArea textArea2 = new JTextArea();
  private JTextArea textArea3 = new JTextArea();
  private JTextArea textArea4 = new JTextArea();

  private JPanel panel1 = new JPanel();
  private JPanel panel2 = new JPanel();
  private JPanel panel3 = new JPanel();
  private JPanel panel4 = new JPanel();

  ServerSocket serverSocketIN;

  Socket socketIN;

  public RunServer3(){

    frame = new JFrame("Server 1");
  }

  public void launch(){

    // width - 270 & height - 170
    frame.setSize(600, 270);

    frame.getContentPane().setBackground(Color.blue);
    frame.getContentPane().setLayout(new GridLayout(1,2));

    panel1.setLayout(new BorderLayout());
    panel2.setLayout(new BorderLayout());
    panel3.setLayout(new BorderLayout());
    panel4.setLayout(new BorderLayout());

    panel1.add(new JScrollPane(textArea1));
    panel2.add(new JScrollPane(textArea2));
    panel3.add(new JScrollPane(textArea3));
    panel4.add(new JScrollPane(textArea4));

    panel1.add(BorderLayout.CENTER, new JScrollPane(textArea1));
    panel2.add(BorderLayout.CENTER, new JScrollPane(textArea2));
    panel3.add(BorderLayout.CENTER, new JScrollPane(textArea3));
    panel4.add(BorderLayout.CENTER, new JScrollPane(textArea4));

    frame.getContentPane().add(panel1);
    frame.getContentPane().add(panel2);
    frame.getContentPane().add(panel3);
    frame.getContentPane().add(panel4);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

    try{

      serverSocketIN = new ServerSocket(8000);
    }
    catch(IOException e){

      e.printStackTrace();
    }

    new Listen(socketIN, textArea1, textArea2, textArea3, textArea4, serverSocketIN).start();
  }

  public static void main(String[] args){

    RunServer3 server_01 = new RunServer3();
    server_01.launch();
  }
}