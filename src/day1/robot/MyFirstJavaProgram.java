package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		Robot John=new Robot();
		John.penDown();
		John.setPenWidth(20);
		John.setPenColor(Color.blue);
John.setSpeed(15);
for (int i = 0; i < 4; i++) {
John.setRandomPenColor();
John.move(90);
John.turn(45);

}
		
		
	}
}
