package gui;
import java.awt.*;
public class MyGui {

	public static void main(String[] args) {
	Frame f=new Frame("My Frame");
	Button b=new Button("OK");
	TextField tf=new TextField("Programming in Java",20);
	f.setLayout(new FlowLayout());
	f.add(b);
	f.add(tf);
	f.setSize(300,300);
	f.setVisible(true);
	}

}
