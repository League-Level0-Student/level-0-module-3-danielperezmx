package _16_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	static Robot shape = new Robot();
	public static void main(String[] args) {
		shape.setPenWidth(5);
//		drawSquare();
//		drawTriangle();
//		drawCircle();
		String asking = JOptionPane.showInputDialog("do you want the robot to draw a square, triangle or circle?");
		String color = JOptionPane.showInputDialog("what color do you want? red, green or blue?" );
		if(color.equals("red")) {
			shape.setPenColor(Color.RED);
		}
		else if(color.equals("green")) {
			shape.setPenColor(Color.GREEN);
		}
		else if(color.equals("blue")) {
			shape.setPenColor(Color.blue);
		}
		
		
		
		if(asking.equals ("square")){
			drawSquare();
			
		}
		else if(asking.equals("triangle")){
			drawTriangle();
			
		}
		else if(asking.equals("circle")) {
			drawCircle();
		}
		}
		
				
				
				
				
	
	
	
	static void drawSquare() {
		shape.penDown();
		shape.setSpeed(100);
		for (int i = 0; i < 4; i++) {
			shape.move(180);
			shape.turn(360 / 4);
		}
		
		
	}
	
	static void drawTriangle() {
		shape.penDown();
		shape.setSpeed(100);
		for (int i = 0; i < 3; i++) {
			shape.move(180);
			shape.turn(360 / 3);
		}
		
		
	}
	static void drawCircle() {
		shape.penDown();
		shape.setSpeed(100);
		for (int i = 0; i < 360; i++) {
			shape.move(1);
			shape.turn(360 / 360);
		}
		
		
	}
	
	
	
	
}



