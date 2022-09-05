package swing;
import javax.swing.*;
import java.awt.*;
public class JFrame4deriveFont {

	public static void main(String[] args) {
	JFrame jf=new JFrame("JFrame: Derived Font");
	JLabel jl1=new JLabel();
	JLabel jl2=new JLabel();
	Font f=new Font("Monospaced",Font.ITALIC,24);
	Font fDer=f.deriveFont(Font.PLAIN,20);
	jf.setSize(500,100);
	jf.setVisible(true);
	jf.add(jl1);
	jl1.setFont(f);
	jl1.setText("This is the original font\n");
	jf.add(jl2);
	jl2.setFont(fDer);
	jl2.setText("This is the derived font\n");
	jf.setDefaultCloseOperation(3);
	}

}
