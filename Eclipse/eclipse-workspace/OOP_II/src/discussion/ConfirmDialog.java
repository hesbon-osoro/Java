package discussion;
import javax.swing.JOptionPane;
//public class InputDialog {

	
	/*	String nString;
		int num;
		nString=JOptionPane.showInputDialog(null,"Enter a number: ", "MyInputScreen", JOptionPane.PLAIN_MESSAGE);
		num = Integer.parseInt(nString);
		JOptionPane.showMessageDialog(null, "The number is: " + num);
	}

}*/


public class ConfirmDialog{
	public static void main(String[] args) {
	int n;
	boolean isYes;
	
	n = JOptionPane.showConfirmDialog(null, "Do you want to upgrade?", "Upgrade", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	isYes = (n == JOptionPane.NO_OPTION);
	JOptionPane.showMessageDialog(null, "You chose: " + isYes);
}
}
