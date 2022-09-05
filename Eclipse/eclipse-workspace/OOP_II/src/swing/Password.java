package swing;


	// Java Program to enter name and password 
	// using JTextField and JPasswordField 
	import java.awt.event.*; 
	import java.awt.*; 
	import javax.swing.*; 
	public class Password extends JFrame implements ActionListener { 
		// JTextField 
		static JTextField t; 

		// JPasswodField 
		static JPasswordField pass; 

		// JFrame 
		static JFrame f; 

		// JButton 
		static JButton b; 

		// label to diaplay text 
		static JLabel l; 

		// default constructor 
		Password() 
		{ 
		} 

		// main class 
		public static void main(String[] args) 
		{ 
			// create a new frame to store text field and button 
			f = new JFrame("textfield"); 

			// create a label to display text 
			l = new JLabel("nothing entered"); 

			// create a new button 
			b = new JButton("submit"); 

			// create a object of the text class 
			Password te = new Password(); 

			// addActionListener to button 
			b.addActionListener(te); 

			// create a object of JTextField with 16 columns and initial text 
			t = new JTextField("enter name", 16); 

			// create a object of passwodField with 16 columns 
			pass = new JPasswordField(16); 

			// create an object of font type 
			Font fo = new Font("Serif", Font.ITALIC, 20); 

			// set the font of the textfield 
			t.setFont(fo); 

			// create a panel to add buttons and textfield 
			JPanel p = new JPanel(); 

			// add buttons and textfield to panel 
			p.add(t); 
			p.add(pass); 
			p.add(b); 
			p.add(l); 

			// add panel to frame 
			f.add(p); 

			// set the size of frame 
			f.setSize(300, 300); 

			f.setVisible(true); 
		} 

		// if the button is pressed 
		public void actionPerformed(ActionEvent e) 
		{ 
			String s = e.getActionCommand(); 
			if (s.equals("submit")) { 
				// set the text of the label to the text of the field 
				l.setText("name = " + t.getText() + "\t Password = " + pass.getText()); 

				// set the text of field to blank 
				t.setText(" "); 

				// set the text of password field to blank 
				pass.setText(""); 
			} 
		} 
	}
