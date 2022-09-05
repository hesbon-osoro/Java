package swing;

	// Java Program to create a simple JComboBox 
	// and add elements to it 
	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*; 
	public class ComboBox  extends JFrame implements ItemListener { 

		// frame 
		static JFrame f; 

		// label 
		static JLabel l, l1; 

		// combobox 
		static JComboBox c1; 

		// main class 
		public static void main(String[] args) 
		{ 
			// create a new frame 
			f = new JFrame("frame"); 

			// create a object 
			ComboBox s = new ComboBox(); 

			// set layout of frame 
			f.setLayout(new FlowLayout()); 

			// array of string contating cities 
			String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" }; 

			// create checkbox 
			c1 = new JComboBox(s1); 

			// add ItemListener 
			c1.addItemListener(s); 

			// create labels 
			l = new JLabel("select your city "); 
			l1 = new JLabel("Jalpaiguri selected"); 

			// set color of text 
			l.setForeground(Color.red); 
			l1.setForeground(Color.blue); 

			// create a new panel 
			JPanel p = new JPanel(); 

			p.add(l); 

			// add combobox to panel 
			p.add(c1); 

			p.add(l1); 

			// add panel to frame 
			f.add(p); 

			// set the size of frame 
			f.setSize(400, 300); 

			f.setVisible(true); 
		} 
		public void itemStateChanged(ItemEvent e) 
		{ 
			// if the state combobox is changed 
			if (e.getSource() == c1) { 

				l1.setText(c1.getSelectedItem() + " selected"); 
			} 
		} 
	} 
