package prince;

public class LogicTable {

	public static void main(String[] args) {
	boolean p,q;
	System.out.println("P\tQ\tP AND Q\tP OR Q\tP XOR Q\tNOT P");
	p=true; q=true;
	System.out.println(p + "\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
	p=true; q=false;
	System.out.println(p + "\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
	p=false; q=true;
	System.out.println(p + "\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));
	p=false; q=false;
	System.out.println(p + "\t"+q+"\t"+(p&q)+"\t"+(p|q)+"\t"+(p^q)+"\t"+(!p));

	}

}
