
import javax.swing.JOptionPane;

public class Debugger {
    public static void main(String[] args) {
        // get two String inputs from user
        String someString = JOptionPane.showInputDialog(null, "Please enter some String");
        String anotherString = JOptionPane.showInputDialog(null, "Please enter some other " +
                "String");

        // check to make sure the two string are NOT the same
        while(true){
            if (someString == anotherString){
                JOptionPane.showMessageDialog(null, "Error, the two Strings you entered are " +
                        "the same");
                someString = JOptionPane.showInputDialog(null, "Please enter some String");
                anotherString = JOptionPane.showInputDialog(null, "Please enter some other " +
                        "String");
            }
            else{
                JOptionPane.showMessageDialog(null, "Thank you for entering two different " +
                        "Strings");
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "The two Strings you entered will now be combined.");
        StringBuilder combinedString = new StringBuilder(someString + anotheString);
        JOptionPane.showMessageDialog(null, "Combined String: \n>> " + combinedString);

    }
}