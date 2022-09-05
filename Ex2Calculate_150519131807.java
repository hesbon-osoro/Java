
package ex2calculate;
import java.util.Scanner;

public class Ex2Calculate {

    public static void main(String[] args) {
     Scanner user_in = new Scanner(System.in);
     Ex2Calculate calculate= new Ex2Calculate();
      
     System.out.println("Input the fist number: ");
     float num1 = user_in.nextFloat();
     
     System.out.println("Input the second number: ");
     float num2 = user_in.nextFloat();
     
    
     calculate.add(num1, num2);
     calculate.sub(num1, num2);
     calculate.mul(num1, num2);
     calculate.div(num1, num2);
     
    }
    
    void add(float num1, float num2){
        double result = num1 + num2;
        System.out.println("Sum : " + result);
    }
    
    void sub(float num1, float num2){
        double result = num1 - num2;
        System.out.println("Difference : " + result);
    }
    
    void mul(float num1, float num2){
        double result = num1 * num2;
        System.out.println("Product : " + result);
    }
    
    void div(float num1, float num2){
        double result = num1 / num2;
        System.out.println("Quotient : " + result);
    }
}
