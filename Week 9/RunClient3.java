import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class RunClient3{

  private JFrame frame;

  private JButton button1 = new JButton("Send");

  private JPanel panel1 = new JPanel();

  public RunClient3() {

    frame = new JFrame("Client 1");

    button1.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e){
        new ClientSend().start();
      }
    });
  }

  public void launch(){

    // width - 270 & height - 170
    frame.setSize(100, 100);

    frame.getContentPane().setBackground(Color.blue);
    frame.getContentPane().setLayout(new GridLayout(1,2));

    panel1.setLayout(new BorderLayout());

    panel1.add(BorderLayout.CENTER, button1);

    frame.getContentPane().add(panel1);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  public static void main(String[] args) {

    RunClient3 client_01 = new RunClient3();
    client_01.launch();
  }
}