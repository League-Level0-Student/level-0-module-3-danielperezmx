package _04_are_you_happy;

import javax.swing.JOptionPane;

public class arUhappy {
	public static void main(String[] args) {
		String joy = JOptionPane.showInputDialog("are you happy?");
		if (joy.equals("yes")) {
			JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
		} else if (joy.equals("no")) {
			String na = JOptionPane.showInputDialog("do you want to be happy?");
			if (na.equals("no")) {
				JOptionPane.showMessageDialog(null, "keep doing whatever you are doing");
			} else if (na.equals("yes"))
			JOptionPane.showMessageDialog(null,"change something");{

			}
		}

	}
}
