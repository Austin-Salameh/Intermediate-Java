import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBox {

    private JButton[] b = {
            new JButton("Alert"),
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

    public MessageBox(){
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
            ActionListener[] alArr = new ActionListener[1];
            alArr[0] = alert;
           

            b[i].addActionListener(alArr[i]);
        }
    }
    public static void main(String [] args){
        MessageBoxes messageBoxes = new MessageBoxes();
        messageBoxes.launchJFrame();
    }   
    
}
