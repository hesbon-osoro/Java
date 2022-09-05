package polymorphism;

//Represents the screen of the ATM

public class Screen {

	public void displayMessageLine(String message) {
		System.out.println(message);
	}

	public void displayMessage(String message) {
		System.out.println(message);
	}
	public void displayDollarAmount(double amount) {
		System.out.printf("$%,.2f", amount);
	}

}
