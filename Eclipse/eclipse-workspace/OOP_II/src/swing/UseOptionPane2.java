package swing;
import javax.swing.*;
public class UseOptionPane2 {
	static int age;
	static double money;
	public static void main(String[] args) {
		String ageText=JOptionPane.showInputDialog(null,"How old are you?");
		
		try{ 
			age = Integer.parseInt(ageText); 
		} catch (NumberFormatException nfe)
		{ 
			JOptionPane.showMessageDialog(null, "Invalid integer.");
		}
		String moneyText=JOptionPane.showInputDialog(null, "How much do you have?");
		
		try{ 
			money =Double.parseDouble(moneyText);
		} catch (NumberFormatException nfe)
		{ 
			JOptionPane.showMessageDialog(null, "Invalid number.");
		}
		JOptionPane.showMessageDialog(null, "If you can double your money each year,\n" +
				"You'll have $" + (money * 32) +
				" at age " + (age + 5) + "!");
	}

}
