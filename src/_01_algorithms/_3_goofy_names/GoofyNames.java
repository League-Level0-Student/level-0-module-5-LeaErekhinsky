package _01_algorithms._3_goofy_names;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
		String userName = JOptionPane.showInputDialog("Type a name.");
		// 2. Print upper case name to the console using .toUpperCase()
		// Run your program to see that this works.

		// 3. Loop through each character of the name (steps 4 - 7).
		// HINT: Use .length() to determine the number of characters in the String.

		for (int count = 0; count < userName.length(); count++) {
			char charAt = userName.charAt(count);
			if (count % 2 == 0) {
				charAt = Character.toUpperCase(charAt);
			} else {
				charAt = Character.toLowerCase(charAt);

			}
			goofyName += charAt;

		}

		JOptionPane.showMessageDialog(null, goofyName);

	}
}
