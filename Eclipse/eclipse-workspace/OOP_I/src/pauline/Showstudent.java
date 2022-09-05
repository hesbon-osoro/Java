package pauline;
import java.util.Scanner;
public class Showstudent {
	static String fname,mname,lname;
	public static void main(String[] args) {
	Names student=new Names();
	Scanner sc=new Scanner(System.in);
	student.fillDetails();
	student.returnDetails();
	
	}

}
