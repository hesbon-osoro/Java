
package ex7compare2;
import java.util.Scanner;

public class Ex7Compare2 {

    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        float num1 = user_in.nextInt();
        
        System.out.println("Enter number 2 : ");
        float num2 = user_in.nextInt();
        
        System.out.println("Enter number 3 : ");
        float num3 = user_in.nextInt();
        
        double result = num1;
        if(result < num2)
            result = num2;
        if(result < num3)
            result = num3;
        
        System.out.println("The largest number is: " + result);
    }
    
}
