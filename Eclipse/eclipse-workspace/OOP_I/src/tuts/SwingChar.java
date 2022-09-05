package tuts;
import java.util.Scanner;
import javax.swing.*;

public class SwingChar {

	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		String str;
			String ch;
			str=JOptionPane.showInputDialog("Enter your name: ");
			ch=sc.next();
			JOptionPane.showMessageDialog(null, "Your name is: "+ch);
			}
}
