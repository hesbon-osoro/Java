package classicmodels;
import java.sql.*;
import javax.swing.*;
public class Customer {
	private static String url="jdbc:mysql://localhost:3306/classicmodels";
	private static String user="root";
	private static String passwd="";
	private static Connection conn=null;
	
	private static int custNumber; 
	private static String custName;
	private static String contFirstName;
	private static String contLastName;
	private static String phone;	
	private static String address1;
	private static String address2;
	private static String city;
	private static String state;
	private static String postalCode;
	private static String country;
	private static int salesRepEmpNo;
	private static double creditLimit;
	
	public static void main(String[] args) throws SQLException{
		conn=DriverManager.getConnection(url, user, passwd);
		JOptionPane.showMessageDialog(null,"Connected Successfully\nDatabase: Classic Models","Connection Status",JOptionPane.INFORMATION_MESSAGE);
	}

}
