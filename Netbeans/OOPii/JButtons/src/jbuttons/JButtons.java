
package jbuttons;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class JButtons extends JFrame implements ActionListener {
	private TextField Message=new TextField(13);//instance variable
	
	public static void main(String[] args) {
	new JButtons();
	
	}
	//creating the constructor
	public JButtons() {
		setLayout(new BorderLayout());
		setSize(500,100);
		JPanel top=new JPanel();
		JButton[] digit=new JButton[10];
		for(int b=0;b<10;b++) { 
			digit[b]=new JButton(" " +b);
			top.add(digit[b]);
			digit[b].addActionListener(this);
		}
		add("North", top);
		JPanel bottom=new JPanel();
		bottom.add(Message);
		add("South",bottom);
		setTitle("JButton Arrays Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		Message.setText("Button Number is "+e.getActionCommand());
	}
}
