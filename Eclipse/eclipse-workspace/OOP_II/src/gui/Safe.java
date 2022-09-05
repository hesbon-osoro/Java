package gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; 

 public class Safe extends JFrame implements ActionListener { 
	 static final int combination = 634921;
	 int guess = 0;
	  JButton reset = new JButton();
	 
	  public static void main(String[] args) {
	  new Safe();
	  } 
	  public Safe() {
		   setLayout(new BorderLayout());
		   setSize(141, 203);
		   JPanel middle = new JPanel();
		   middle.setLayout(new GridLayout(3, 3, 5, 5)); 
		   JButton[] digit = new JButton[10];
		    // ignore 0th JButton
		    for (int b = 1; b < 10; b++) {
		    digit[b] = new JButton();
		    middle.add(digit[b]);
		    digit[b].addComponentListener((ComponentListener) this);
		    }
		    add("Center", middle);
		    JPanel bottom = new JPanel();
		    bottom.add(reset);
		    reset.addComponentListener((ComponentListener) this);
		    add("South", bottom);
		    setTitle("Safe");
		    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    setResizable(false);
		    setVisible(true);
		    }
		   
		    public void actionPerformed(ActionEvent e) {
		    if (e.getSource() == reset) guess = 0;
		    else guess = guess * 10 +
		    Integer.parseInt(e.getActionCommand());
		    if (guess == combination)
		    JOptionPane.showMessageDialog(this, "Safe is open!");
		    }
		    }
		   
