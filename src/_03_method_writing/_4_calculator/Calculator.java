package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("Enter a number");
		String input2 = JOptionPane.showInputDialog("Enter another number");
		int number1 = Integer.parseInt(input1);
		int number2 = Integer.parseInt(input2);
		int task = JOptionPane.showOptionDialog(null, "What do you choose?", "Calculator", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Divide", "Multiply", "Subtract", "Add" }, null);
		
		if (task == 0) {
			JOptionPane.showMessageDialog(null, "Results: " + divide(number1, number2));
			
			
		}
		
		if (task == 1) {
			JOptionPane.showMessageDialog(null, "Results: " + multiply(number1, number2));
			
		}
		
		if (task == 2) {
			JOptionPane.showMessageDialog(null, "Results: " + subtract(number1, number2));
			
		}
		
		if (task == 3) {
			JOptionPane.showMessageDialog(null, "Results: " + add(number1, number2));
			
		}

	}
	
	public static double divide(int number1, int number2) {
		if (number2 == 0) {
			return 0;
		}
		return (double) (number1 / number2);
	}

	public static int multiply(int number1, int number2) {
		return (number1 * number2);

	}
	
	public static int subtract(int number1, int number2) {
		return (number1 - number2);
		
	}
	
	public static int add(int number1, int number2) {
		return (number1 + number2);
		

	}

}
