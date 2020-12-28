/*Austin Salameh
*Assignment 8.1
*10/11/2020
*Modify the following 'MessageBoxes' application so it uses a single action listener for each button.
*This will require you to separate the single action listener logic into multiple listeners, one for each button.
*Then modify the code to provide additional options to two or more buttons.
*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBoxes {

    private JButton[] b = {
        new JButton("Alert"),
        new JButton("Yes/No"),
        new JButton("Color"),
        new JButton("Input"),
        new JButton("3 Vals"),
        };

private JTextField txt = new JTextField(15);

private JFrame frame;

private ActionListener al = new ActionListener(){
public void actionPerformed(ActionEvent e){
int val = JOptionPane.showConfirmDialog(null,
                               "yes or no", "Are you scared?",
                               JOptionPane.YES_NO_OPTION);

     if(val != JOptionPane.CLOSED_OPTION){

         if(val == 0){
            JOptionPane.showMessageDialog(null,
            "There's a bug on you!", "Hey!",
            JOptionPane.ERROR_MESSAGE);
         }
         else{
            JOptionPane.showMessageDialog(null,
            "False alarm, I'm sorry!", "Hey!",
            JOptionPane.ERROR_MESSAGE);
         }
        }
    }
};

private ActionListener yesNo = new ActionListener(){
    public void actionPerformed(ActionEvent e){
    int val = JOptionPane.showConfirmDialog(null,
                               "or no", "Chose yes",
                               JOptionPane.YES_NO_OPTION);

if(val != JOptionPane.CLOSED_OPTION){

if(val == 0){

txt.setText("Yes" + " I want to go to the grocery store.");
}
else{

txt.setText("No" + " I do not want to go to the grocery store.");
}
}
}
};

private ActionListener color = new ActionListener(){
    public void actionPerformed(ActionEvent e){
Object[] options = {"Red", "Green"};
Object[] options1 = {"Orange", "Yellow"};

int sel = JOptionPane.showOptionDialog(null,
                              "Choose a Color!", "Warning",
                              JOptionPane.DEFAULT_OPTION,
                              JOptionPane.WARNING_MESSAGE, null,
                              options, options[0]);

if(sel != JOptionPane.CLOSED_OPTION){

int sel1 = JOptionPane.showOptionDialog(null,
                              "Choose a Color!", "Warning",
                              JOptionPane.DEFAULT_OPTION,
                              JOptionPane.WARNING_MESSAGE, null,
                              options1, options1[0]);

if(sel == 0) 
{
    if(sel1 == 0) 
    {
        txt.setText(options[0].toString() + " + " + options1[0].toString() + " = " + "You Love Fall");
    } 
    else if(sel1 == 1) 
    {
        txt.setText(options[0].toString() + " + " + options1[1].toString() + " = " + "You Love Summer");
    }
} 
else if(sel == 1) 
{
    if(sel1 == 0) 
    {
        txt.setText(options[1].toString() + " + " + options1[0].toString() + " = " + "You Love Winter");
    } 
    else if(sel1 == 1) 
    {
        txt.setText(options[1].toString() + " + " + options1[1].toString() + " = " + "You Love Spring");
                }
            }
        }
    }
};

private ActionListener input = new ActionListener(){
public void actionPerformed(ActionEvent e){
String val = JOptionPane.showInputDialog("How mant fingers do you see?");

txt.setText("You see " + val + " fingers!");
}
};

private ActionListener values = new ActionListener(){
public void actionPerformed(ActionEvent e){
Object[] selections = {"First", "Second", "Third"};

Object val = JOptionPane.showInputDialog(null,
                                "Choose one", "Input",
                                JOptionPane.INFORMATION_MESSAGE,
                                null, selections, selections[0]);

if(val != null){

txt.setText(val.toString());
}
}
};


public MessageBoxes(){

frame = new JFrame("Button Options");

frame.setSize(250, 250);

frame.getContentPane().setLayout(new FlowLayout());

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

for(int i = 0; i < b.length; i++){

frame.getContentPane().add(b[i]);
}

frame.getContentPane().add(txt);

frame.setVisible(true);

}

public void launchJFrame(){
    
for(int i = 0; i < b.length; i++){
        ActionListener[] alArr = new ActionListener[5];
        alArr[0] = al;
        alArr[1] = yesNo;
        alArr[2] = color;
        alArr[3] = input;
        alArr[4] = values;

b[i].addActionListener(alArr[i]);
    }
}

public static void main(String [] args){

MessageBoxes messageBoxes = new MessageBoxes();
messageBoxes.launchJFrame();
}
}



