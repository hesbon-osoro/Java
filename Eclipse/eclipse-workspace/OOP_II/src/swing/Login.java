package swing;
import java.awt.*;
import javax.swing.*;
public class Login {
	Login(){
		
	}

	public static void main(String[] args) {
		
		JFrame f=new JFrame("Login Form");
		JPanel c,p2,p3,p4;
		JLabel l0,l1,l2;
		JTextField user;
		JPasswordField pass;
		JButton login,cancel;
		Font ft=new Font("Monospaced",Font.BOLD,24);
		c=new JPanel();
		//c.setLocation(200,100);
		p2=new JPanel(new GridLayout(2,1));
		l1=new JLabel("UserName: ");
		l2=new JLabel("Password: ");
		p2.add(l1);
		p2.add(l2);
		p3=new JPanel(new GridLayout(2,1));
		p3.setAlignmentX(Component.CENTER_ALIGNMENT);
		user=new JTextField(10);
		pass=new JPasswordField(10);
		p3.add(user);
		p3.add(pass);
		p4=new JPanel(new GridLayout(1,3));
		p4.setAlignmentX(Component.CENTER_ALIGNMENT);
		login=new JButton("Login");
		cancel=new JButton("Cancel");
		p4.add(login);
		p4.add(cancel);
		c.setAlignmentX(Component.CENTER_ALIGNMENT);
		c.setPreferredSize(new Dimension(200, 100));
		c.setBounds(100,100,200,100); 
		c.add(p2);
		c.add(p3);
		c.add(p4);
		f.add(c,BorderLayout.CENTER);
		c.setBackground(Color.CYAN);
		f.setLayout(new BorderLayout());
		f.setSize(400,300);
		//put the frame center of the screen
		f.setLocationRelativeTo(null);
		//f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
