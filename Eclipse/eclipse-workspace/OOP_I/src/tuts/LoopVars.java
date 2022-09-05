package tuts;

public class LoopVars {

	public static void main(String[] args) {
		int sum=0;
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			sum+=i;//i is known here
			fact*=i;
		}
		//but, i is not known here.
		System.out.println("Sum: "+sum);
		System.out.println("Factorial: "+fact);
	}

}
