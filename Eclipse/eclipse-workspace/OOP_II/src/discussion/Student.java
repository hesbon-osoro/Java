package discussion;
import java.util.Scanner;
public class Student {
	int num;
	double n;
	public Student(int num) {
		this.num=num;
	}
	public Student(double n) {
		this.n=n;
	}
	public static void main(String[] args) {
	String name;
	Student student1=new Student(200);
	Scanner input=new Scanner(System.in);
	System.out.println("Enter The Name: ");
	name=input.next();
	System.out.println("Name: "+name+" Number "+student1.num);
	}

}
