package tuts;

public class NoZeroDiv2 {

	public static void main(String[] args) {
		int x;
		double result;
		
		for(x=-10;x<=10;x++)
		{
			result=100/x;
			if(x!=0?true:false)
				System.out.printf("100/%d : %.2f\n",x,result);
		}
		/*for(int i = -5; i < 6; i++) 
			if(i != 0 ? true : false)
			System.out.println("100 / " + i + " is " + 100 / i); 
	*/}

}
