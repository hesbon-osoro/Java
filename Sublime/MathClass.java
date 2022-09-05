import java.lang.Math;
class MathClass
{
	public static void main(String[] args)
	{
	int b,h;
	double hyp;
	b=12;h=10;
	hyp=Math.sqrt(Math.pow(h,2)+Math.pow(b,2));
	System.out.println("Hypotenuse ="+hyp);
	
//scope of variables
	int x=10;
if(x==10){
	int y=20;
	System.out.println("x and y "+x+" "+y);
	x=y*2;
		}System.out.println("x ="+x);
}
}