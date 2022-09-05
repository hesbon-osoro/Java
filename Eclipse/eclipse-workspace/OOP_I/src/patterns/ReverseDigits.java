package patterns;

import java.util.Scanner;

public class ReverseDigits {
	public static void reversePrint(int digit,int last) {
		for(int i=4;i>=last;i--) {
			for(int j=i;j>=last;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void forwardPrint(int digit,int first) {
		for(int i=first;i<=digit;i++) {
			for(int j=i;j>=first;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int digit=sc.nextInt();
		while(digit<0) {
			System.out.println("Use positive integers!!");
			System.out.print("Enter a digit: ");
			 digit=sc.nextInt();			
		}
		reversePrint(digit,1);
		forwardPrint(digit,1);
	}

}
