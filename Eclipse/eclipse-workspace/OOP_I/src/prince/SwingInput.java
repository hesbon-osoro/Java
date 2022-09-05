package prince;
import javax.swing.*;

public class SwingInput {

	public static void main(String[] args) {
	String temp;
	temp=JOptionPane.showInputDialog("Enter First Number");
	int a=Integer.parseInt(temp);
	temp=JOptionPane.showInputDialog("Enter Second Number");
	int b=Integer.parseInt(temp);
	temp=JOptionPane.showInputDialog("Enter Third Number");
	int c=Integer.parseInt(temp);
	JOptionPane.showMessageDialog(null,"Average is "+(a+b+c)/3);

	}

}
