package tuts;

public class GuessGame3 {

	public static void main(String[] args)
	throws java.io.IOException{
		char ch,answer='K';
		System.out.println("I'm thinking of a letter between A to Z");
		do {
			System.out.print("Guess it: ");
			do {
			ch=(char) System.in.read();
			}while(ch=='\n'|ch=='\r');
			if(ch==answer)
				System.out.println("**Right**");
			else {
				System.out.print("...Sorry, you're ");
				if(ch<answer)
					System.out.println("too low");
				else
					System.out.println("too high");
				System.out.println("Try Again!\n");
			}
		}while(answer!=ch);

	}

}
