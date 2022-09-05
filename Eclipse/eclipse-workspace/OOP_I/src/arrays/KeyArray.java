package arrays;
import java.util.Scanner;

public class KeyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arry[]=new int[3];
		int i;
		System.out.println("Enter 3 values:");
		for(i=0;i<3;i++) {
			arry[i]=sc.nextInt();
		}
		System.out.println("You Entered:");
		for(i=0;i<3;i++) {
			System.out.println(arry[i]);
		}
	}

}
