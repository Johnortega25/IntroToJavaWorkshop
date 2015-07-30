import javax.swing.JOptionPane;


public class Coding_Part5 {
public static void main(String[] args) {
String Answer=JOptionPane.showInputDialog("How are you?");
String Response=JOptionPane.showInputDialog("How do you look?");
String answer=JOptionPane.showInputDialog("Where do you live?");
String response=JOptionPane.showInputDialog("How old are you?");
String Answers=JOptionPane.showInputDialog("What is your phone number?");
JOptionPane.showMessageDialog(null, "I know that you are "+ Answer+" and I know");
JOptionPane.showMessageDialog(null, "Now I know how you look"+ Response+"Thank you");
JOptionPane.showMessageDialog(null, "Thank you for the information "+ answer+" Have a nice day");
JOptionPane.showMessageDialog(null, "You are very young!"+ response);
JOptionPane.showMessageDialog(null, "Thank you for your phone number");

}
}
