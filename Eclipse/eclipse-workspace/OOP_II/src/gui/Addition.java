package gui;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		String firstNumber = JOptionPane.showInputDialog("Enter first integer");
		String secondNumber = JOptionPane.showInputDialog("Enter second integer");
		int num1 = Integer.parseInt(firstNumber);
		int num2 = Integer.parseInt(secondNumber);
		JOptionPane.showMessageDialog(null, "the sum is: "+(num1+num2), "Sum of Two Integers",JOptionPane.INFORMATION_MESSAGE);

	}

}
