package gui;
import java.awt.*;
public class MyGui1 {

	public static void main(String[] args) {
	Frame f=new Frame("My Frame");
	f.setLayout(new BorderLayout());
	//Add text field to top
	f.add("North", new TextField());
	//Create the panel with buttons at the bottom..
	Panel p=new Panel();//FlowLayout
	p.add(new Button("OK"));
	p.add(new Button("Cancel"));
	f.add("South",p);
	f.add("Center",new TextField("Center regoin"));
	f.setSize(300,300);
	f.setVisible(true);
	}

}
