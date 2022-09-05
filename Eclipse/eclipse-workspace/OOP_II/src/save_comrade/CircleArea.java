package save_comrade;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		final double PIE=3.142;
		double radius,area;
		System.out.print("Enter a radius: ");
		radius=sc.nextDouble();
		if(radius %7==0) {
			area=22*radius*radius/7;
			System.out.println("Area ="+area);
		}else {
		area=PIE*Math.pow(radius, 2);
		System.out.printf("Area = %.2f",area);
		}
	}

}
