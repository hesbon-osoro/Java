package database;
//Accesses a database with student and phone information

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class AccessStudentsCalls {

	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	final private String url = "jdbc:mysql://localhost:3306/school";
	final private String host = "http://localhost/phpmyadmin/";
	final private String user = "root";
	final private String passwd = "";
	final private String database = "school";
	public void connectToDB() throws Exception {
		try {
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");

			// Setup the connection with the DB
			connect=DriverManager.getConnection(url, user, passwd);
			/*connect = DriverManager.getConnection("jdbc:mysql://" + host + "/"
					+ database + "?" + "user=" + user + "&password=" + passwd);*/

		} catch (Exception e) {
			throw e;
		}
	}

	public void readStudents() throws Exception {
		try {
			statement = connect.createStatement();
			resultSet = statement
					.executeQuery("select * from " + database + ".student");
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				String phone = resultSet.getString("phone");

				System.out.println(String.format(
						"Id: %d name: %5s  phone: %5s", id, name, phone));
			}
		} catch (Exception e) {
			throw e;
		}
	}
	public void addNewCall( int time, int id1, int id2, int length) throws Exception  {
		String query = "INSERT INTO `" + database + "`.`calls` (`id`, `time`, `id1`, `id2`, `length`)"
				      + "VALUES (NULL, ?, ?, ?, ? )";
		try {
			preparedStatement = connect.prepareStatement( query );
			preparedStatement.setInt(1, time );
			preparedStatement.setInt(2, id1 );
			preparedStatement.setInt(3, id2 );
			preparedStatement.setInt(4, length );
			preparedStatement.executeUpdate();

		} catch ( Exception e) {
			throw e;
		}
	}

	// You need to close the resultSet
		public void close() {
			try {
				if (resultSet != null) {
					resultSet.close();
				}

				if (statement != null) {
					statement.close();
				}

				if (connect != null) {
					connect.close();
				}
			} catch (Exception e) {

			}
		}

	}


