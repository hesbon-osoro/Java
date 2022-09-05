
package inheritance;

class one{
	public void print_geek()
	{
	System.out.print("Geeks");
	}
}
class two extends one{
	public void print_for()
	{
	System.out.print(" for ");
	}
}
public class Inheritance{

 	/*private class privateClass {
 		System.out.println("This is a Private class within a public class\n");
	}*/

	public static void main(String[] args) {
        
	two g=new two();
	g.print_geek();
	g.print_for();
	g.print_geek();
    }
}

