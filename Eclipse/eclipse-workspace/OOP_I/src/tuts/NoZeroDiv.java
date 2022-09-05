package tuts;

public class NoZeroDiv {

	public static void main(String[] args) {
	double x,result;
	for (x=-5;x<=10;x++)
	{
		result=x!=0?100/x:0;
		if(x!=0)
			System.out.printf("100/%.2f : %.2f\n",x,result);
	}
	}

}
