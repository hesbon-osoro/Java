import java.util.Scanner;

public class Ex10Average{

    public static void main(String args[]){

       Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		float num1 = userIn.nextFloat();
		
		System.out.println("Enter second number: ");
		float num2 = userIn.nextFloat();
		
		double avg=(num1 + num2)/2;
		
		System.out.println("The Average of " + num1 + " & " + num2 + " numbers are: " + avg);
    }
}



