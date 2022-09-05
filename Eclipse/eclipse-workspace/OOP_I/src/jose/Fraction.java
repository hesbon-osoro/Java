package jose;
import java.util.*;
public class Fraction {

	public static void main(String[] args) {
		Scanner jose= new Scanner(System.in);
		int num1,num2,num, den1,den2,den,rem,quo,whno;
		char operation;
		
		System.out.println("Enter the numenator :");
		num1=jose.nextInt();
		System.out.println("Enter the denominator :");
		den1=jose.nextInt();
		//System.out.println("The result to your code is :");
		//operation=jose.next().charAt(0);
		System.out.println("Enter the numenator :");
		num2=jose.nextInt();
		System.out.println("Enter the denominator :");
		den2=jose.nextInt();
		
		num=(num1*den2)+(num2*den1);
		den=den1*den2;
		
		if(num<den) {
			System.out.println("The result to your code is :"+num+"/"+den);
		}else  {
			rem=num%den;
			quo=num-rem;
			whno=quo/den;
			
			System.out.println("The result to your code is :"+ whno+" "+rem+"/"+den);
		}
		}
		

}
