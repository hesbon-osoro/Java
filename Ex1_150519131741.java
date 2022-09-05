
package ex1;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
       Scanner userin=new Scanner(System.in);
       System.out.println("Enter your first name: ");
       String fname= userin.nextLine();
       System.out.println("Enter your last name: ");
       String lname = userin.nextLine();
       System.out.println("Your full name is: " + fname + " " + lname);
    }
    
}
