package mathSolutions;
import java.util.Scanner;
public class Prime_given_Range {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int i,j;
		int start,stop;
		System.out.print("Enter Lower Limit: ");
		start=sc.nextInt();
		System.out.print("Enter Upper Limit: ");
		stop=sc.nextInt();
		for(i=2;i<=stop;i++){
			for(j=2;j<=(i/j);j++){
				if(!(i%j!=0))
					break;
				
				if(j>(i/j)){
					if(i>=start&&i<=stop) {
						System.out.print(i+"\t");					
					}
					
				}
			}
		}
	}

}
