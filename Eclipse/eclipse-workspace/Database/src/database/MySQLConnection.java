package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MySQLConnection{
	public static void main(String[] args)throws SQLException{
           
		String dbURL="jdbc:mysql://localhost:3306/school";
		Connection conn=DriverManager.getConnection(dbURL,"root","");
		System.out.println("Database Logged in successfully");
}
}