
package jbuttons;
import javax.swing.JOptionPane;
public class Exceptions{
    public static void main(String[]args){
        int num1,num2;
        try{
        num1=Integer.parseInt(JOptionPane.showInputDialog("Enter the "+"first number"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Enter the "+"second number"));
        int quo=num1/num2;
        JOptionPane.showMessageDialog(null,"Ans: "+quo);
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null,"Enter Whole Numbers");
        }catch(ArithmeticException ae){
            JOptionPane.showMessageDialog(null,"Division by 0!");
        }
       
    }    

}