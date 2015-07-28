package day1.robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 1. Create a new Robot
	Robot John=new Robot (); 

	void go() {
		// 3. Make the robot move as fast as possible
		John.hide();
		John.penDown();
		John.setSpeed(10);
		// 4. Set the pen width to 5
		John.setPenWidth(5);
		// 5. Do steps #6 to #7 four times...
		for (int i = 0; i < 4; i++) {
			
		
			// 6. Set the pen color to random
		John.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
			// 7. Turn the robot 90 degrees to the right
		John.turn(90);
		}
		
	}

	/* 2. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		//JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		for (int i = 0; i < 4; i++) {
			John.move(200);
			John.turn(90);
				
			
		}
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
