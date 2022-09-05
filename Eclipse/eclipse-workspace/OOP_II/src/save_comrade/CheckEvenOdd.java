package save_comrade;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.print("Enter a number: ");
		number=sc.nextInt();
		if(number%2==0) {
			System.out.println(number+" is even");
		}else {
			System.out.println(number+" is odd");
		}
	}

}
