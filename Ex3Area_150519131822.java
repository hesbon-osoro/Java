
package ex3area;
import java.util.Scanner;

public class Ex3Area {

    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        Ex3Area rarea= new Ex3Area();
        
        System.out.println("Input Width : ");
        float wid = user_in.nextFloat();
        
        System.out.println("Enter Height: ");
        float hgh = user_in.nextFloat();
        
        System.out.println("The area of rectangle is: " + rarea.rectangleArea(wid, hgh));
    }
    
    double rectangleArea(float wid, float hgh){
        return wid * hgh;
    }
}
