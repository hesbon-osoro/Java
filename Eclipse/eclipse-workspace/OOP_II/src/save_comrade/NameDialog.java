package save_comrade;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "Enter your name","Name input",JOptionPane.QUESTION_MESSAGE);
	String message = String.format("Welcome, %s, to Real Java Programming!", name);
	JOptionPane.showMessageDialog(null, message, "Name output", JOptionPane.INFORMATION_MESSAGE);
	}

}
