package samp_exercises;
import java.util.Scanner;
public class Pattern {
	static int m,n;
	public static void recursiveMethod(int m, int n) {
		int i;
		for(i=m;i<=n;i++) {
			printAsteric(i,'*');
		}
		for(i=n;i>=m;i--) {
				printAsteric(i,'*');
		}
	}
	public static void printAsteric(int m, char aster) {
		for(int i=0;i<m;i++)
			System.out.print(aster);
		System.out.println();
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please Enter Values for M and N [M>=0] and [M<=N]");
		System.out.print("M: ");
		m=sc.nextInt();
		System.out.println("N: ");
		n=sc.nextInt();
		while(m>n||m<0) {
			System.out.println("The Value of M should be greater or equal to 0");
			System.out.println("Value of M should be less or equal to the Value of N");
			System.out.print("M: ");
			m=sc.nextInt();
			System.out.println("N: ");
			n=sc.nextInt();
		}
		recursiveMethod(m, n);
	}

}
