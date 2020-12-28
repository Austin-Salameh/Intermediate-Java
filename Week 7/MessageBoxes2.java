import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBoxes2{

    private JButton[] b = {
            new JButton("Alert"),
            new JButton("Yes/No"),
            new JButton("Color"),
            new JButton("Input"),
            new JButton("3 Vals"),
    };

    private JTextField txt = new JTextField(15);

    private JFrame frame;

    private ActionListener alert = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null,
                    "There's a bug on you!", "Hey!",
                    JOptionPane.ERROR_MESSAGE);
        }
    };

    private ActionListener yesNo = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            int val = JOptionPane.showConfirmDialog(null,
                    "or no", "Chose yes",
                    JOptionPane.YES_NO_OPTION);

            if(val != JOptionPane.CLOSED_OPTION){

                if(val == 0){

                    txt.setText("Yes");
                }
                else{

                    txt.setText("No");
    
                }
            }
        }
    };

    private ActionListener color = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Object[] options = {"Red", "Green"};
            Object[] option2 = {"Yellow", "Blue"};

            int sel = JOptionPane.showOptionDialog(null,
                    "Choose a Color!", "Warning",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null,
                    options, options[0]);

            if(sel != JOptionPane.CLOSED_OPTION){

                // Additional option for color button
                // This will choose another color and display the result of both colors
                int sel2 = JOptionPane.showOptionDialog(null,
                        "Choose another color!", "Warning",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.WARNING_MESSAGE, null,
                        option2, option2[0]);

                // If else statements to determine outcome color
                if(sel == 0) {
                    if(sel2 == 0) {
                        txt.setText(options[0].toString() + " + " + option2[0].toString() + " = " + "Orange");
                    } else if(sel2 == 1) {
                        txt.setText(options[0].toString() + " + " + option2[1].toString() + " = " + "Purple");
                    }
                } else if(sel == 1) {
                    if(sel2 == 0) {
                        txt.setText(options[1].toString() + " + " + option2[0].toString() + " = " + "Blue");
                    } else if(sel2 == 1) {
                        txt.setText(options[1].toString() + " + " + option2[1].toString() + " = " + "Teal");
                    }
                }
            }
        }
    };

    private ActionListener input = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String val = JOptionPane.showInputDialog("How mant fingers do you see?");

            txt.setText(val);
        }
    };

    private ActionListener vals = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            Object[] selections = {"First", "Second", "Third"};
            Object[] selection2 = {"A", "B", "C"};

            Object val = JOptionPane.showInputDialog(null,
                    "Choose one", "Input",
                    JOptionPane.INFORMATION_MESSAGE,
                    null, selections, selections[0]);

            if(val != null){

                // Additional option for vals button
                // Add additional option to drop down
                Object val2 = JOptionPane.showInputDialog(null,
                        "Choose one", "Input",
                        JOptionPane.INFORMATION_MESSAGE,
                        null, selection2, selection2[0]);

                txt.setText(val.toString() + val2.toString());
            }
        }
    };

    public MessageBoxes(){
        frame = new JFrame("Title");

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
        // Assign "ActionListener" to buttons from array
        for(int i = 0; i < b.length; i++){
            ActionListener[] alArr = new ActionListener[5];
            alArr[0] = alert;
            alArr[1] = yesNo;
            alArr[2] = color;
            alArr[3] = input;
            alArr[4] = vals;

            b[i].addActionListener(alArr[i]);
        }
    }

    public static void main(String [] args){
        MessageBoxes messageBoxes = new MessageBoxes();
        messageBoxes.launchJFrame();
    }
}
