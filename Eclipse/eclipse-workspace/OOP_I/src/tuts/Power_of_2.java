package tuts;

public class Power_of_2 {

	public static void main(String[] args) {
		int e;
		int result;
		for(int i=0;i<10;i++)
		{
			result=1;
			e=i;
			while(e>0)
			{
				result*=2;
				e--;
			}
			System.out.println("2 to the power of "+i+" : "+result);
		}
	}

}
