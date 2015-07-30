
import javax.swing.JOptionPane;

public class Coding_Part7 {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String Answer = JOptionPane.showInputDialog("Do you know how to code");
		// 2. If they say "yes", tell them they will rule the world.
		if (Answer.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null,
					"Then you will rule the world!!");

		} else {
			JOptionPane.showMessageDialog(null,
					"Good luck washing dishes!");

		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}
