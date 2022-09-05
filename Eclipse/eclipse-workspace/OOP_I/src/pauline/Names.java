package pauline;

import java.util.Scanner;

public class Names {
 static String fname,mname,lname;
 static void fillDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name");
		fname=sc.next();
		System.out.println("Enter Middle Name");
		mname=sc.next();
		System.out.println("Enter Last Name");
		lname=sc.next(); 
 }
 static void returnDetails() {
	 System.out.println("Your Full Name: "+fname+" "+mname+" "+lname); 
 }
	public static void main(String[] args) {
		fillDetails();
		returnDetails();
	}

}
