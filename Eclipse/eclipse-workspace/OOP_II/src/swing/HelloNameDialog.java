package swing;
import javax.swing.JOptionPane;
public class HelloNameDialog {

	public static void main(String[] args) {
	String name;
	name=JOptionPane.showInputDialog(null,"What is your Name?: ");
	JOptionPane.showMessageDialog(null,"Hello, "+name+"!");
	}

}
