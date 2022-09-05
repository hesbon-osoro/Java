import java.util.Scanner;
class Prime_Range{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	int i,j;
	int start,end;
	System.out.print("Enter Lower Limit: ");
	start=input.nextInt();
	System.out.print("Enter Upper Limit: ");
	end=input.nextInt();
	for(i=2;i<end;i++){
		for(j=2;j<=(i/j);j++){
			if(!(i%j))
				break;
			if (j>(i/j)) {
				if (i>=start) {
					System.out.print(i+"\t");					
				}
				
			}
		}
	}
	}
}