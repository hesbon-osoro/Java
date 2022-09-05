
package tuts;

public class GuessGame2 {

	public static void main(String[] args) 
	throws java.io.IOException
	{
	char ch,answer='K';
	System.out.println("I'm thinking of a letter between A to Z");
	System.out.print("Have a guess: ");
	ch=(char) System.in.read();
	if(ch==answer)
		System.out.println("**Right**");
	else
	{
		System.out.print("...Sorry, are ");
		if(ch<answer)
			System.out.println("too Low");
		if(ch>answer)
			System.out.println("too High");	
		else
			System.out.println("outside the parameters");
	}
	}

}
