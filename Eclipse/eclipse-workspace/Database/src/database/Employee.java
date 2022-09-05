package database;
import java.sql.*;
import javax.swing.JOptionPane;
public class Employee extends JOptionPane{
	private static String url="jdbc:mysql://localhost:3306/employee";
	private static String user="root";
	private static String passwd="";
	private static String table="";
	private static String password;
	static Connection conn=null;
	static ResultSet rs=null;
	static Statement st=null;
	static ResultSetMetaData rsm=null;
	static PreparedStatement ps=null;
	public static void main(String[] args) throws SQLException {
		conn=DriverManager.getConnection(url, user, password);
		showMessageDialog(null,"Connection Successful","Connection Status",INFORMATION_MESSAGE);
		//populate the databases
		
		
	}

}
