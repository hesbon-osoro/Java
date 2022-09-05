package gui;
import java.awt.*;
import java.awt.event.*;
public class MyGui0 {

	public static void main(String[] args) {
		Frame f=new Frame("My Frame");
		MyGuiAction ga=new MyGuiAction(f);
	}

}
class MyGuiAction implements ActionListener{
	static int count=0;
	Button b;
	TextField tf;
	MyGuiAction(Frame f){
		b=new Button("OK");
		b.addActionListener(this);
		tf=new TextField("Hello World",12);
		f.setLayout(new FlowLayout());
		f.add(b);
		f.add(tf);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			count++;
			System.out.println("Button is Pressed");
			tf.setText("Hello Java Click "+count);
		}
	}
}
