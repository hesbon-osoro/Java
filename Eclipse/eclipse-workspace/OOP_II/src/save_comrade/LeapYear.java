package save_comrade;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int year;
		System.out.print("Enter the year: ");
		year=sc.nextInt();
		if(year % 4==0) {
			System.out.println(year + " is a Leap year");
		}else {
			System.out.println(year+" is not a leap year");
		}
				
	}

}
