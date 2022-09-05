package swing;

//Java Program to create a shaped translucent 
//window (using AWTUtilities)and 
//control its translucency using a slider 
import javax.swing.event.*; 
import java.awt.*; 
import javax.swing.*; 
import java.awt.geom.*; 
//import com.sun.awt.AWTUtilities; 
public class Solveit1  extends JFrame implements ChangeListener { 

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
		Solveit1 s = new Solveit1(); 

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

		// decorated frame's opacity cant be set so make the frame undecorated 
		f.setUndecorated(true); 

		// set opacity value for the window 
		f.setOpacity(b.getValue() * 0.01f); 

		// set window shape using AWTUtilities class 
		//AWTUtilities.setWindowShape(f, new Ellipse2D.Float(20f, -30f, 250.0f, 150.0f)); 

		f.setLocation(500, 300); 

		f.show(); 
	} 

	// if opacity value is changed 
	public void stateChanged(ChangeEvent e) 
	{ 
		l.setText("opacity value is =" + b.getValue()); 

		// set opacity value for the window 
		f.setOpacity(b.getValue() * 0.01f); 
	} 
} 

