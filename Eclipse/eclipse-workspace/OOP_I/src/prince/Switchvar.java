package prince;
import java.util.Scanner;
public class Switchvar
{
	public static void main(String[] args) 
	{
	int x;
	Scanner var=new Scanner (System.in);
	System.out.println("Enter the value of X");
	x=var.nextInt();
	switch (x)
		{
			case 1: System.out.println("y=0.1");
			break;
			case 2: System.out.println("y=0.2");
			break;
			default: System.out.println("y=0");
		}
	}
}
