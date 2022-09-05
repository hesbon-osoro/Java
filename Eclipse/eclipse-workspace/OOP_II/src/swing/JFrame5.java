package swing;
import javax.swing.*;
import java.awt.*;
public class JFrame5 {

	public static void main(String[] args) {
	JFrame jf=new JFrame("Using a Layout Manager");
	JLabel jl=new JLabel();
	JLabel jl2=new JLabel();
	Font f=new Font("Monospaced",Font.ITALIC,24);
	FlowLayout flow=new FlowLayout(FlowLayout.LEFT);
	jf.setLayout(flow);
	jf.setSize(500,200);
	jf.setVisible(true);
	jf.setDefaultCloseOperation(3);
	jl.setFont(f);
	jf.add(jl);
	jl.setText("This is the first text");
	Font fd=f.deriveFont(Font.PLAIN);
	jl2.setFont(fd);
	jf.add(jl2);
	jl2.setText("This is the second text");
	jf.setResizable(false);
	}

}
