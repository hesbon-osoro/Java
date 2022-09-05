package gui;

import java.awt.Graphics;

import javax.swing.JFrame;

public class DrawCircle extends JFrame{
	int x,y=40;
	public void paint(Graphics g) {
		super.paint(g);
		
		for (int row = 1; row <= 4; row++) {
			x=40;
		 for (int col = 1; col <= 4; col++) {
		 if (col >= row) g.drawOval(x, y, 40, 40);
		 else g.fillOval(x, y, 40, 40);
		 x += 40;
		 }
		 y += 40;
		 }
	}
	public static void main(String[] args) {
		DrawCircle dc=new DrawCircle();	
		dc.setVisible(true);
		dc.setSize(500,500);
		dc.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//dc.paint(g);
		 
	}

}
