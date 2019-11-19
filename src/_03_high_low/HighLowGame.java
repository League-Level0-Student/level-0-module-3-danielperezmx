//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(100);

		// 2. Print out the random variable above
		
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 10; i++) {

			// 1. Ask the user for a guess using a pop-up window, and save their response
			String original = JOptionPane.showInputDialog("hey you! G U E S S");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int num = Integer.parseInt(original);
			if (num == random) {
				JOptionPane.showMessageDialog(null, "guess what? you win");
			System.exit(0);
			} else if (num > random){
				JOptionPane.showMessageDialog(null, "that is way to H I G H");

			} else if (num < random) {
				JOptionPane.showMessageDialog(null, "that is way to L O W");
			}
		}
		// 5. if the guess is correct
		// 6. Win
		// 12. Use "System.exit(0);" to quit the game if the user guessed the right
		// answer.
		// 7. if the guess is high
		// 8. Tell them it's too high
		// 9. if the guess is low
		// 10. Tell them it's too low

		// 13. Tell them they lose

	}
}
