import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Debug1{

  private JFrame frame;

  private JButton one;
  private JButton two;
  private JButton three;
  private JButton four;
  private JButton five;
  private JButton six;

  GridLayout grid1;
  GridLayout grid2;

  boolean toggle = true;

  public Debug1(){

    frame = new JFrame("Change Layouts");

    one = new JButton("one");
    two = new JButton("two");
    three = new JButton("three");
    four = new JButton("four");
    five = new JButton("five");
    six = new JButton("six");

    grid1 = new GridLayout(3, 2, 10, 10);
    grid2 = new GridLayout(2, 3, 10, 10);

    frame.setSize(300, 300);

    ButtonListener buttonListener = new ButtonListener();

    one.addActionListener(buttonListener);
    two.addActionListener(buttonListener);
    three.addActionListener(buttonListener);
    four.ActionListener(buttonListener);
    five.addActionListener(buttonListener);
    six.addActionListener(buttonListener);

// GridLayout(rows, clos)
    frame.setLayout(grid1);
    frame.getContentPane().setBackground(Color.blue);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.add(one);
    frame.add(two);
    frame.add(three);
    frame.add(four); 
    frame.add(five);
    frame.add(six);

    frame.setVisible(true);
  }

  private class ButtonListener implements ActionListener{

    public void actionPerformed(ActionEvent e){

      if(toggle){
        frame.setLayout(grid3);
        frame.validate();
        toggle = false;
      }
      else{
        frame.setLayout(grid1);
        frame.validate();
        toggle = true;
      }
    }
  }

  public static void main(String[] args){

    Debug1 layout = new Debug1();
  }
}
