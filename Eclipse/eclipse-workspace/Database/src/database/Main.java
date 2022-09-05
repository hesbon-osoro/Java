package database;

//Adapted from http://www.vogella.com/tutorials/MySQLJava/article.html
public class Main {
	public static void main(String[] args) throws Exception {
		MySQLAccess dao = new MySQLAccess();
		dao.readDataBase();
	}

}
