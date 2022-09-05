class FreshJuice
{
	enum FreshJuiceSize{small,medium,large};
	FreshJuiceSize size;
}
public class FreshJuiceTest
{
	public static void main(String[] args)
	{
	FreshJuice juice=new FreshJuice();
	juice.size=FreshJuice.FreshJuiceSize.medium;
	System.out.println("Size: "+juice.size);
	}
}