import java.util.Scanner;

public class Ex11MaxMinAvgSum3{

    public static void main(String args[]){
	
	Scanner userIn = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		float num1 = userIn.nextFloat();
		
		System.out.println("Enter second number: ");
		float num2 = userIn.nextFloat();
		
		System.out.println("Enter third number: ");
		float num3 = userIn.nextFloat();
		
		double avg=(num1 + num2)/2;
		
		float max=num1;
		if(max<num2)
		   max = num2;
		if(max<num3)
		   max = num3;
		   
		float min=num1;
		if(min>num2)
		   min = num2;
		if(min>num3)
		   min = num3;
		
		double sum = num1 + num2 + num3;
		
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + avg);
		System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }
}



