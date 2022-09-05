package tuts;

public class SqrRoot {

	public static void main(String[] args) {
	int n;
	double rerr,sroot;
	for(n=0;n<100;n++)
	{
		sroot=Math.sqrt(n);
		System.out.printf("Square root of %d : %.2f\n",n,sroot);
		rerr=n-(sroot*sroot);
		System.out.println("Rounding error :"+rerr);
		System.out.println();
	}
	}

}
