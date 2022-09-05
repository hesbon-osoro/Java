package arrays;
import java.util.*;
public class FlexibleQuizAverage {
	public static void main(String[] args) {
		int[] scores = new int[10];
		int score = 0;
		int count = 0;
		int total = 0; 
		final int QUIT = 999; 
		final int MAX = 10; 
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter quiz score >> ");
		score = input.nextInt(); 
		while(count < MAX && score != QUIT) { 
			if(score != QUIT) {
				scores[count] = score; 
				total += scores[count];
				System.out.print("Enter next quiz score or " + QUIT + " to quit >> "); 
				score = input.nextInt();
				} 
				count++;
				}
			System.out.println("The scores entered were:"); 
			for(int x = 0; x < count; ++x)
				System.out.print(scores[x] + " ");
			System.out.println("\n The average is " + (total * 1.0 / count));
			}
	}
