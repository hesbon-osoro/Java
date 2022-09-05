package method_overloading;
class SimpleCalc
{
	int add(int a, int b) {
		return a+b;
		}
	int add(int a, int b, int c)
	{
		return a+b+c;
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleCalc obj=new SimpleCalc();
		System.out.println(obj.add(20, 30));
		System.out.println(obj.add(20, 30,40));

	}

}
