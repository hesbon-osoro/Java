package swing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class IconTrial {

	public static void main(String[] args) {
		JFrame q=new JFrame("Queen in the Icon");
		Font f=new Font("Monospaced",Font.ITALIC,24);
		JLabel jl=new JLabel();
		Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/HB/Pictures/myDiamond/gns.jpg");    
		q.setIconImage(icon);
		JPanel p=new JPanel();
		ImageIcon i=new ImageIcon("C:/Users/HB/Pictures/myDiamond/Saidimu.jpg");
		JLabel j=new JLabel(i);
		JLabel ji=new JLabel();
		q.setVisible(true);
		q.setLocation(600, 100);
		q.setSize(500, 300);
		p.setBackground(Color.BLUE);
		p.setForeground(Color.PINK);
		jl.setFont(f);
	    jl.setText("She is the Queen");
		p.add(ji);
		p.add(j);
		p.add(jl);
		q.add(p);
		q.add(jl);
		//q.pack();
		q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
