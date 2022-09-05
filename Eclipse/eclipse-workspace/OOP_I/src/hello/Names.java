package hello;
public class Names {
	enum StudentNames{Sheldon, Hesbon}
	StudentNames name;
	enum Emails{sheldon,hesbon}
	Emails mail;
}
class YearOne
{
	public static void main(String[]args)
	{
		Names first=new Names();
		first.name=Names.StudentNames.Sheldon;
		Names second=new Names();
		second.name=Names.StudentNames.Hesbon;
		Names E1=new Names();
		E1.mail=Names.Emails.sheldon;
		Names E2=new Names();
		E2.mail=Names.Emails.hesbon;
		System.out.println("Name: "+first.name);
		System.out.println("Name: " +second.name);
		System.out.println("STUDENT EMAILS");
		System.out.println("Email "+E1.mail + "@students.jkuat.ac.ke");
		System.out.println("Email " +E2.mail + "@students.jkuat.ac.ke");
	}


}
