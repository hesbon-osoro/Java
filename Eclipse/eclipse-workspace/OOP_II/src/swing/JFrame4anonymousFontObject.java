package swing;
import javax.swing.*;
import java.awt.*;

public class JFrame4anonymousFontObject {

	public static void main(String[] args) {
		JFrame jf=new JFrame("Using anonymous Font Object");
		JLabel jl=new JLabel();
		jl.setFont(new Font("High Tower Text",Font.ITALIC,24));
		jf.setSize(500,100);
		jf.setDefaultCloseOperation(3);
		jf.setVisible(true);
		jl.setText("This has an anonymous object");
		jf.add(jl);
		
	}

}
