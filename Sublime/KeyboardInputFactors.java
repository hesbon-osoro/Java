import java.util.Scanner;
class KeyboardInputFactors
{
	public  static void main(String[] args)
	{
	int i,n;
	i=2;//initializing prime numbers
	Scanner facInput=new Scanner(System.in);
	System.out.println("This program generates factors of a number given.");
	System.out.println("Enter a number: ");
	n=facInput.nextInt();
	while(n!=1)
	{
	if(n%i==0)
	{
	System.out.print(i+" ");
	n=n/i;i=2;
	}else{
	i++;
	}
	}
	System.out.println("\n***Success**");
	}
}