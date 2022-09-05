class BooleanControlFlow
{
public static void main(String[] args)
{
	boolean b;
	b=false;
	System.out.print("b is "+b+"\n");
	b=true;
	System.out.print("b is "+b+"\n");
	//a boolean value can control the if statement
	if(b)
	System.out.println("This can be executed");
	b=false;
	if(b)
	System.out.println("This cannot be executed");
	//outcome of a relational operator is a boolean value
	System.out.println("10>9 "+(10>9));
}
}