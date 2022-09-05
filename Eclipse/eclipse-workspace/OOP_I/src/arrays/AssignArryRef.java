package arrays;

public class AssignArryRef {

	public static void main(String[] args) {
		int arry1[]=new int[10];
		int arry2[]=new int[10];
		int i;
	System.out.println("Here goes array 1");
		for(i=0;i<10;i++) {
			arry1[i]=i+5;
			System.out.println("Arry1["+i+"]: "+arry1[i]);
		}
	System.out.println("Here goes array 2");
		for(i=0;i<10;i++) {
			arry2[i]=-i-5;
			System.out.println("Arry2["+i+"]: "+arry2[i]);
		}
		arry2=arry1;//array 2 is now array 1
	System.out.println("Here goes array 2 after assignement");
		for(i=0;i<10;i++) {
			System.out.println("Arry2["+i+"]: "+arry2[i]);
		}
		//now operating arry1 through arry2
		arry2[3]=50;
	System.out.println("Here goes array 1 after exchange through array 2");
	for(i=0;i<10;i++) {
		System.out.println("Arry1["+i+"]: "+arry1[i]);
	}
	}

}
