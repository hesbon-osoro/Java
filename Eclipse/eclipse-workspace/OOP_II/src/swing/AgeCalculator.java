package swing;

import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class AgeCalculator {

	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		int nowYear;
		int birthYear;
		int yearsOld;
		birthYear = Integer.parseInt (JOptionPane.showInputDialog(null, "In what year were you born?"));
		nowYear = now.get(GregorianCalendar.YEAR);
		yearsOld = nowYear - birthYear; JOptionPane.showMessageDialog(null, "This is the year you become " + yearsOld + " years old");
	}

}
