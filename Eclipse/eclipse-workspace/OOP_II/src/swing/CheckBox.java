package swing;


	// java Program to create a simple checkbox using JCheckBox 
	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*; 
	public class CheckBox extends JFrame { 

		// frame 
		static JFrame f; 

		// main class 
		public static void main(String[] args) 
		{ 
			// create a new frame 
			f = new JFrame("frame"); 

			// set layout of frame 
			f.setLayout(new FlowLayout()); 

			// create checkbox 
			JCheckBox c1 = new JCheckBox("checkbox 1"); 
			JCheckBox c2 = new JCheckBox("checkbox 2"); 

			// create a new panel 
			JPanel p = new JPanel(); 

			// add checkbox to panel 
			p.add(c1); 
			p.add(c2); 

			// add panel to frame 
			f.add(p); 

			// set the size of frame 
			f.setSize(300, 300); 

			f.setVisible(true); 
		} 
	} 
