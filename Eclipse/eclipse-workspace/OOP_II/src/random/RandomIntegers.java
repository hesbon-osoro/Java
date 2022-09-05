package random;
//shifted and scaled random integers
import java.util.Random; //program uses class Random

public class RandomIntegers {

	public static void main(String[] args) {
		Random r = new Random(); //random number generator
		int face; //stores each random integer generated
		for(int i = 1; i <= 20; i++) {
			face = 1 + r.nextInt(6);
			System.out.printf("%d ",face);
			if( i % 5 == 0) {
				System.out.println();
			}
		}
	}

}
