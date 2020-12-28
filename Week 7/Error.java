import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Error extends JFrame {
	
	JButton b1, b2;
	
	public Error() {
		super("Error program.");
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		class MyActionListener implements ActionListener{
			String buttonMessage;
			public void actionPerformed(ActionEvent event) {
				System.out.println("Thanks for pushing " + buttonMessage);
				System.exit(0);
			}
			MyActionListener(String msg){
				buttonMessage = msg;
			}
		}
		
		cp.add(b1 = new JButton("Button 1"));
		b1.addActionListener(new MyActionListener("Button 1"));
		
		cp.add(b2 = new JButton("Button 2"));
		b2.addActionListener(new MyActionListener("Button 2"));
		
		pack();
	}

	public static void main(String[] args) {
		new Error().setVisible(true);

	}

}