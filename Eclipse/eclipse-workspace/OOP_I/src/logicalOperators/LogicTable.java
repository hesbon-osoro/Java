package logicalOperators;

public class LogicTable 
{
	public static void main(String[] args)
	{
		boolean p,q;
		System.out.print("P\tQ\tP&Q\tP|Q\tP^Q\t!P\n");
		p=true;q=true;
		System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		p=true; q=false;
		System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		p=false; q=true;
		System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
		p=false; q=false;
		System.out.print(p+"\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p)+"\n");
	}

}