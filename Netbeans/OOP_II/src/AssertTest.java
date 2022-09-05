/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HB
 */
import java.util.Scanner;

public class AssertTest {
	
	public static void main( String[] args ) {
		Scanner input = new Scanner( System.in );
		System.out.print( "Enter a number between 0 and 10: " );
		int number = input.nextInt();
		//assert that the value is >= 0 and <=10
		// assert that the value is >= 0 and <= 10
		assert ( number >= 0 && number <= 10 ) : "bad number: " + number;

		System.out.printf( "You entered %d\n", number );
		} // end main
	} 
