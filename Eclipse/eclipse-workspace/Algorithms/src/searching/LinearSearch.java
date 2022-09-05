package searching; 
import java.util.Scanner;
public class LinearSearch {	
	static final int MAX=25;
	static int randomArray[]={1,4,2,3,2,5,7,2,2,4,12,25,24,100,15,48,78,98,52,48,3,58,24,10,50};
	//this other arrays need alot of space due to multi-loops
	static int foundArray[]=new int[100];//int [MAX*MAX]
	static int locnArray[]= new int[100];//int [MAX*MAX]
	static int i=0,find=0,k=0,count=0;
	boolean found=false;
	void linearSearchMethod( int item)
	{
		for(i=0;i<MAX;i++) {
			if(item==randomArray[i]) {
				found=true;
				count++;
				foundArray[k]=randomArray[i];
				for(k=i+1;k!=MAX;k++) {
					if(item==foundArray[k]) {
						found=true;
						count++;	
					}
				}
					locnArray[i]=i+1;
			}
		}
		find=(found==true)?1:0;
			if(find==1) {
				System.out.printf("%d Element(s) found\nLocation(s): ",count);
				for(i=0;i<MAX;i++) {
					if(locnArray[i]!=0) {
						System.out.print(locnArray[i]+"   ");
						}
					}
				System.out.print("\n");	
			}else {
			System.out.println("Element not found.");
			}
	}
	public static void main(String[] args){
		LinearSearch ls=new LinearSearch();
		Scanner scan=new Scanner(System.in);	
		int i,item;
		System.out.println("Original Array");
		for(i=0;i<MAX;i++) {
			System.out.print(randomArray[i]+" ");
		}
		System.out.print("\nEnter an element to search: ");
		item=scan.nextInt();
		ls.linearSearchMethod(item);
	}
		
}