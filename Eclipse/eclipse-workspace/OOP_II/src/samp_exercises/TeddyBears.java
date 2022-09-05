package samp_exercises;
import java.util.Scanner;
public class TeddyBears {
	static int n,bears,lastDigit,tensDigit,rem;
	public static int teddyGame(int n) {
		rem=n;
		while(rem<=42) {
			if(rem%5==0) {
				divisible5(rem);
			teddyGame(rem);
			}
			if(rem%2==0) {
				even(rem);
			teddyGame(rem);
			}
			if(rem%3==0||rem%4==0) {
				divisible3_4(rem);
			teddyGame(rem);
			}
			rem=n-bears;
		}
		return rem;
	}
	public static int even(int n) {
		if(n%2==0) {
			bears=n/2;
		}
		return bears;
	}
	public static int divisible5(int n){
		if(n%5==0) {
			bears=42;
		}
		return bears;
	}
	public static int divisible3_4(int n) {
		lastDigit=n%10;
		tensDigit=((n%100)/10);
		if(n%3==0||n%4==0) {
			bears=lastDigit*tensDigit;
		}
		return bears;
	}
	public static void teddyOutput() {
		System.out.println("Bears returned: "+bears+" Bears left: "+rem);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number greater or equal to 100");
			n=sc.nextInt();
			while(n<100) {
				System.out.println("Use a Value greater than or equal to 100");
			}
			teddyGame(n);
			teddyOutput();
	}

}
