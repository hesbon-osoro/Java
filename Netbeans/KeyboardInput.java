
package keyboardinput;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args) {
     String fname,sname;
     int mark;
    Scanner test=new Scanner(System.in);
    fname=test.nextLine();
    sname=test.nextLine();
    mark=test.nextInt();
    System.out.println("First Name: "+fname);
    System.out.println("Second Name: "+sname);
    System.out.println("Marks Scored: "+mark);
    }
    
}
