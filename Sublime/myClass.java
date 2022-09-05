public class myClass
{
	static void checkAge(int age)
	{
	if(age<18){
	System.out.println("Access Denied- not old enough");
	}
	else
	{
	System.out.println("Access Granted-Old enough!");
	}
	}
	public static void main(String[] args)
	{
		checkAge(20);
	}
}