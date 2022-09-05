package exceptions;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numerator, denominator, result;
		double den=0.0;
		System.out.print("Enter numerator >> "); 
		numerator = input.nextInt();
		System.out.print("Enter denominator >> ");
		denominator = input.nextInt();
		result = numerator / denominator;
		System.out.println(numerator + " / " + denominator + " = " + result);
		double res = numerator / den;
		System.out.println(numerator + " / " + den + " = " + res);

	}

}
