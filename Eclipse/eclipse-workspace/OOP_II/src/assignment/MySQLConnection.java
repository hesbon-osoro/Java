package assignment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnection{
	public static void main(String[] args)throws SQLException{
           
		String dbURL="jdbc:mysql://localhost:3306/mystudents?useSSL=false";
		Connection conn=DriverManager.getConnection(dbURL,"root","hb0782286692");
		System.out.println("Database Logged in successfully");
}
}