
package ex6compare1;
import java.util.Scanner;

public class Ex6Compare1 {
    
    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        float num1 = user_in.nextInt();
        
        System.out.println("Enter number 2 : ");
        float num2 = user_in.nextInt();
        
        String result = (num1 == num2)?  "The numbers are equal! " :  (result=(num1 > num2)? "Number 1 is greather !" :  "Number 2 is greather !");
        
        System.out.println(result);
    }
    
}
