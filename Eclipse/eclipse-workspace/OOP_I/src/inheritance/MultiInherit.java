package inheritance;
class one1
{
	public void print_geek()
	{
		System.out.println("Geeks");
	}
}
class two2 extends one1
{
	public void print_for()
	{
		System.out.println("4");
	}
}
class three extends two2
{
	public void print_geek()
	{
		System.out.println("Geek");
	}
}
public class MultiInherit {
	public static void main(String[] args)
	{
		three g=new three();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}

}
