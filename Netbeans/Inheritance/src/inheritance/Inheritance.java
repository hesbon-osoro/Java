/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;
class one
{
	public void print_geek()
	{
	System.out.println("Geeks");
	}
}
class two extends one
{
	public void print_for()
	{
	System.out.println("for");
	}
}
public class Inheritance {

   
    public static void main(String[] args) {
        // TODO code application logic here
        {
	two g=new two();
	g.print_geek();
	g.print_for();
	g.print_geek();

    }
    
}
