package swing;


	// Java Program to create a checkbox 
	// and add or remove items from it 
	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*; 
	public class ComboBox2  extends JFrame implements ItemListener, ActionListener { 

		// frame 
		static JFrame f; 

		// label 
		static JLabel l, l1; 

		// combobox 
		static JComboBox c1; 

		// textfield to add and delete items 
		static JTextField tf; 

		// main class 
		public static void main(String[] args) 
		{ 
			// create a new frame 
			f = new JFrame("frame"); 

			// create a object 
			ComboBox2 s = new ComboBox2(); 

			// set layout of frame 
			f.setLayout(new FlowLayout()); 

			// array of string contating cities 
			String s1[] = { "Jalpaiguri", "Mumbai", "Noida", "Kolkata", "New Delhi" }; 

			// create checkbox 
			c1 = new JComboBox(s1); 

			// create textfield 
			tf = new JTextField(16); 

			// create add and remove buttons 
			JButton b = new JButton("ADD"); 
			JButton b1 = new JButton("REMOVE"); 

			// add action listener 
			b.addActionListener(s); 
			b1.addActionListener(s); 

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
			p.add(tf); 
			p.add(b); 
			p.add(b1); 

			f.setLayout(new FlowLayout()); 

			// add panel to frame 
			f.add(p); 

			// set the size of frame 
			f.setSize(700, 200); 

			f.setVisible(true); 
		} 
		// if button is pressed 
		public void actionPerformed(ActionEvent e) 
		{ 
			String s = e.getActionCommand(); 
			if (s.equals("ADD")) { 
				c1.addItem(tf.getText()); 
			} 
			else { 
				c1.removeItem(tf.getText()); 
			} 
		} 

		public void itemStateChanged(ItemEvent e) 
		{ 
			// if the state combobox is changed 
			if (e.getSource() == c1) { 

				l1.setText(c1.getSelectedItem() + " selected"); 
			} 
		} 
	} 
