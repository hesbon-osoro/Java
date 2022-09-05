package polymorphism;

//Represents the keypad of the ATM

import java.util.Scanner; 

public class Keypad {
	private Scanner input;
	//no-argument constructor initializes the Scanner
	public Keypad() {
		input = new Scanner(System.in);
	}
	public int getInput() {
		return input.nextInt(); //assume that the user enters an integer
	}
}
