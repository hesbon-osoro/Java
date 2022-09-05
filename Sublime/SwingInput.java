import javax.swing.*;

public class SwingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str;
	int n;
	str=JOptionPane.showInputDialog(null,"Enter a number: ");
	n=Integer.parseInt(str);//string to integer
	JOptionPane.showMessageDialog(null, "You Entered:"+n);
	}
}