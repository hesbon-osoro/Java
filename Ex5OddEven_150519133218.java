
package ex5oddeven;
import java.util.Scanner;

public class Ex5OddEven {

    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        
        System.out.println("Enter any integer number: ");
        int num = user_in.nextInt();
        
        String result = (num%2 == 0)?  "The number is Even! " :  "The number is Odd! " ;
        
        System.out.println(result);
    }
    
}
