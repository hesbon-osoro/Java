package exercise;
import java.util.Scanner;
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount;
		float amnt,discount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount in Ksh. ");
		amount=sc.nextInt();
		if(amount>=1000) {
		discount=0.05f*(float)amount;
		amnt=(float)amount-discount;
		System.out.printf("Discount: Ksh. %.2f\nPay Ksh. %.2f",discount,amnt);
		}else {
			System.out.printf("You've no discount, Pay Ksh. %.2f",(float)amount);
		}

	}

}

