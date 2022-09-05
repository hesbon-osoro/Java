import java.util.Scanner;

public class Ex9Even{

    public static void main(String args[]){

		Scanner userIn = new Scanner(System.in);
		int sum=0;
		
        System.out.println("Input any intiger number : ");
		int n = userIn.nextInt();
		
		for(int i=1; i<=n; i++)
			{
			if(i%2==0)
				sum += i;
			}
		
		System.out.println("The sum of even numbers from 0 to " + n + " is: " + sum);
    }
}



