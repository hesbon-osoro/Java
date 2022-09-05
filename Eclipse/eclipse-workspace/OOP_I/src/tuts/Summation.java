package tuts;
class MySum{
	int sum;
	//construct for integer
	MySum(int num){
		sum=0;
		int i;
		for(i=1;i<=num;i++) {
			sum+=i;
		}
	}
		//construction from another object (ob)
	MySum(MySum ob){
		sum=ob.sum;	
		}
	
}
public class Summation {

	public static void main(String[] args) {
		MySum m1=new MySum(10);
		MySum m2=new MySum(m1);
	System.out.println("m1.sum: "+m1.sum);
	System.out.println("m2.sum: "+m2.sum);
	}

}
