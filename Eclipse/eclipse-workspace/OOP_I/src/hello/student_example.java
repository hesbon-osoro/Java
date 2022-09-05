package hello;
public class student_example {
int Id;
String name;
}
class TestStudent
{
	public static void main(String[] args)
	{
		student_example s1=new student_example();
		student_example s2=new student_example();
		s1.Id=101;
		s1.name="Simon";
		s2.Id=102;
		s2.name="Annette";
		System.out.println(s1.Id+" "+s1.name);
		System.out.println(s2.Id+" "+s2.name);
				// TODO Auto-generated method stub
	}
}
