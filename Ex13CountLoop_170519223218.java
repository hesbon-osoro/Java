import java.util.Scanner;

public class Ex13CountLoop{

    public static void main(String args[]){
		Scanner userIn = new Scanner(System.in);
		int totalnum = 0, num;
		
		System.out.println("Enter 10 intiger numbers on the range 0 -100");
		
		for(int i=1; i<=10; i++)
			{
			System.out.println("Input " + i + " number: ");
			num = userIn.nextInt();
			
			if(num>50)
				totalnum++;
			
			}
        
		System.out.println(totalnum + " numbers are larger than 50.");
    }
}



