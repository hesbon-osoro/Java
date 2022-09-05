package exercise;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bscSalary;
		float rate,tax,hseAllowance,netSalary;
		hseAllowance=0.2f;
		rate=0.1f;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Basic Salary in Ksh. ");
		bscSalary=sc.nextInt();
		if(bscSalary>=10000) {
			tax=rate*(float)bscSalary;
			hseAllowance=hseAllowance*bscSalary;
			netSalary=(float)bscSalary + hseAllowance-tax;
			System.out.printf("Tax: Ksh. %.2f\nHouse Allowance: Ksh. %.2f\nNet Salary: Ksh. %.2f\n",tax,hseAllowance,netSalary);
		}else {
			hseAllowance=hseAllowance*bscSalary;
			netSalary=(float)bscSalary + hseAllowance;
			System.out.printf("Tax: Ksh. 0.00\nHouse Allowance: Ksh. %.2f\nNet Salary: Ksh. %.2f\n",hseAllowance,netSalary);
		}

	}

}
