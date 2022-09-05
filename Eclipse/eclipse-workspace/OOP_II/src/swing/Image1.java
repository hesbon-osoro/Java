package swing;
	// Java Program to add a image and string 
	// to a label with horizontal alignment 
	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*; 
	public class Image1 extends JFrame { 

		// frame 
		static JFrame f; 

		// label to diaplay text 
		static JLabel l; 

		// default constructor 
		Image1() 
		{ 
		} 

		// main class 
		public static void main(String[] args) 
		{ 
			// create a new frame to store text field and button 
			f = new JFrame("Image and Text"); 

			// create a new image icon 
			ImageIcon i = new ImageIcon("C:/Users/HB/Pictures/myDiamond/Saidimu.jpg"); 

			// create a label to display text and image 
			l = new JLabel("new image text ", i, SwingConstants.HORIZONTAL); 

			// create a panel 
			JPanel p = new JPanel(); 

			// add label to panel 
			p.add(l); 

			// add panel to frame 
			f.add(p); 

			// set the size of frame 
			f.setSize(600, 500); 

			f.setVisible(true); 
		} 
	} 

