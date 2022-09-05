package school;
import java.sql.*;
import javax.swing.*;
public class University {
private static String url="jdbc:mysql://localhost:3306/university";
private static String user="root";
private static String passwd="";

	public static void main(String[] args) throws SQLException {
		Statement st=null;
		ResultSet rs=null;
		Connection conn=DriverManager.getConnection(url, user, passwd);
		JOptionPane.showMessageDialog(null,"Connection Successful.","Connection Status",JOptionPane.INFORMATION_MESSAGE);
		//rs=st.executeQuery("select * from university.student");
		//System.out.println(rs.getMetaData());
	       conn = DriverManager.getConnection(url, user, passwd);
          st = conn.createStatement();
          
          rs = st.executeQuery("SELECT * FROM student");
          
          ResultSetMetaData resultMeta =  rs.getMetaData();
          for (int i = 1; i <= resultMeta.getColumnCount(); i++)
              System.out.print(resultMeta.getColumnName(i).toUpperCase() + "\t");
          System.out.println();

          while (rs.next()) {
              for (int i = 1; i <= resultMeta.getColumnCount(); i++)
                  System.out.print(rs.getObject(i).toString() + "\t|");
              System.out.println();
             

          }
	} 

}
