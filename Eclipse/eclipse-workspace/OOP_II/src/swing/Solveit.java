package swing;
//Java program to create a 
//translucent frame and control 
//its translucency with 
//the help of a JSlider 
import javax.swing.event.*; 
import java.awt.*; 
import javax.swing.*; 
public class Solveit extends JFrame implements ChangeListener { 

	// frame 
	static JFrame f; 

	// slider 
	static JSlider b; 

	// label 
	static JLabel l; 

	// main class 
	public static void main(String[] args) 
	{ 
		// create a new frame 
		f = new JFrame("translucent window"); 

		// create a object 
		Solveit s = new Solveit(); 

		// create label 
		l = new JLabel(); 

		// create a panel 
		JPanel p = new JPanel(); 

		// create a slider 
		b = new JSlider(0, 100, 100); 

		// paint the ticks and tarcks 
		b.setPaintTrack(true); 
		b.setPaintTicks(true); 
		b.setPaintLabels(true); 

		// set spacing 
		b.setMajorTickSpacing(20); 
		b.setMinorTickSpacing(5); 

		// setChangeListener 
		b.addChangeListener(s); 

		// add slider to panel 
		p.add(b); 
		p.add(l); 

		f.add(p); 

		// set the text of label 
		l.setText("Opacity value is =" + b.getValue()); 

		// set the size of frame 
		f.setSize(300, 300); 

		// decorated frame's opacity cant be set 
		// so make the frame undecorated 
		f.setUndecorated(true); 

		// set opacity value for the window 
		f.setOpacity(b.getValue() * 0.01f); 

		f.setLocation(500, 300); 

		f.setVisible(true); 
	} 

	// if opacity value is changed 
	public void stateChanged(ChangeEvent e) 
	{ 
		l.setText("opacity value is =" + b.getValue()); 

		// set opacity value for the window 
		f.setOpacity(b.getValue() * 0.01f); 
	} 
} 

