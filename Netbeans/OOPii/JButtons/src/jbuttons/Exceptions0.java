
package jbuttons;
class Exceptions0{
    public static void main(String[]args){
        try{
            int x=Integer.parseInt(args[0]);
            int y=Integer.parseInt(args[1]);
            System.out.println(x+" / "+y+"is "+(x/y));
        }catch(ArrayIndexOutOfBoundsException aie){
            System.out.println("Two arguments needed");
        }catch(NumberFormatException nfe){
            System.out.println("The arguments must be whole numbers");
        }catch(ArithmeticException ae){
            System.out.println("Cannot divide by zero");
        }
    }
}