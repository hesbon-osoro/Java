package swing;
import javax.swing.*;
import java.awt.*;
public class JFrame4 {

	public static void main(String[] args) {
		final int FRAME_WIDTH = 500;
		final int FRAME_HEIGHT = 100;
		Font headLineFont=new Font("Monospaced",Font.BOLD,24);
		JFrame jf=new JFrame("Fouth Frame");
		JLabel jl=new JLabel("This has been formatted");
		jf.add(jl);
		jf.setSize(FRAME_WIDTH,FRAME_HEIGHT);
		jf.setVisible(true);
		jl.setFont(headLineFont);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
