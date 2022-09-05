package swing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StudentDetails extends JFrame {

	
	public static void main(String[] args) {
		JFrame jf=new JFrame("Student Details Form");
		JLabel jl=new JLabel();
		Font f=new Font("Monospaced",Font.BOLD,24);
		jl.setText("STUDENT DETAILS FORM");
		Font fd=f.deriveFont(Font.PLAIN,12);
		JTextField tf=new JTextField("Enter Name:",10);
		JButton submit=new JButton("Submit");
		JButton cancel=new JButton("Cancel");
		FlowLayout flow=new FlowLayout(FlowLayout.LEFT);
		
		jf.setSize(500,500);
		jf.add(jl);
		jf.add(submit);
		jf.add(cancel);
		jf.setVisible(true);
		jf.setLayout(flow);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	/*void actionPerformed(ActionEvent e) {
	
	}*/
}
