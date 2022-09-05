package string;
import java.util.Scanner;
public class CompareStrings {

	public static void main(String[] args) {
		String aName = "Carmen";
		String anotherName;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your name > ");
		anotherName = input.nextLine();
		if(aName.equals(anotherName)) System.out.println(aName + " equals " + anotherName);
		else System.out.println(aName + " does not equal " + anotherName);
	/*Technically, the equals() method does not
	 *  perform an alphabetical comparison with 
	 *  Strings; it performs a lexicographical 
	 *  comparison—a comparison based on the 
	 *  integer Unicode values of the characters.*/
	}

}
