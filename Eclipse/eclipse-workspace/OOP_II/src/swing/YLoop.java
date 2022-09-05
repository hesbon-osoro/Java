package swing;
import javax.swing.JOptionPane;
public class YLoop {

	public static void main(String[] args) {
		final char YES_OPTION = 'y';
		String entryString;
		char entryChar;
		int count = 0;
		entryString = JOptionPane.showInputDialog(null, "Do you want to see a greeting?");
		entryChar = entryString.charAt(0);
		while(Character.toLowerCase(entryChar) == YES_OPTION) {
			++count; 
			entryString = JOptionPane.showInputDialog(null, "Greeting #" + count + " Hello!\nDo you want to see another greeting?");
		entryChar = entryString.charAt(0); 
		}
	}

}
