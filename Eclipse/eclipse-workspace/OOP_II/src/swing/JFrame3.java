package swing;
import javax.swing.*;
public class JFrame3 {

	public static void main(String[] args) {
		JFrame aFrame=new JFrame("Third frame");
		final int WIDTH = 250;
		final int HEIGHT = 100;
		aFrame.setSize(WIDTH, HEIGHT); 
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel greeting=new JLabel("Good day");
		aFrame.add(greeting);
		}

}
