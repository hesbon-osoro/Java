package swing;
import javax.swing.*;
public class JDemoThatCloses {
	public static void main(String[]args) {
		JFrame aFrame=new JFrame("JFrame That Closes on Exit");
		final int WIDTH = 250;
		final int HEIGHT = 250;
		aFrame.setSize(WIDTH, HEIGHT); 
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
