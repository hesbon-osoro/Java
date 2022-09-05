package swing;
import javax.swing.*;//for GUI components
public class UseOptionPane {

	public static void main(String[] args) {
	//read the user's name graphically
		String name=JOptionPane.showInputDialog(null,"What is your name?");
		//asks the user's yes/no question
		int choice=JOptionPane.showConfirmDialog(null, "Do you like cake, "+name+"?",null, JOptionPane.YES_NO_OPTION);
		//show different response depending on answer
		if(choice==JOptionPane.YES_OPTION)
			JOptionPane.showMessageDialog(null, "of course! Who doesn't?");
		if(choice==JOptionPane.NO_OPTION)
			JOptionPane.showMessageDialog(null, "We'll have to agree to disagree.");
	}

}
