package school;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.sql.*;
import javax.swing.*;
public class Login extends JOptionPane implements ActionListener{
	Login(){
		
	}
	static String username,passwd;
	static int loginAttempts=0;
	public static void main(String[] args) throws SQLException{
		Login l=new Login();
		final String USER="root";
		final String PASSWD="";
		final String URL="jdbc:mysql://localhost:3306/school";
		Connection conn=DriverManager.getConnection(URL, USER, PASSWD);
		showMessageDialog(null, "Connection created successfully","Connection Message",INFORMATION_MESSAGE);
		String username,passwd;
		showMessageDialog(null,"Link this to the database to fetch user details there...","Important",INFORMATION_MESSAGE);
		username=showInputDialog("Enter Username");
		passwd=showInputDialog("Enter Password");
		l.actionPerformed(null);
		loginAttempts=1;
		//l.loginMethod(username,passwd);
		
	}
	public void loginMethod(String username,String passwd) {
		username=showInputDialog("Enter Username");
		passwd=showInputDialog("Enter Password");
		this.username=username;
		this.passwd=passwd;
		addComponentListener((ComponentListener) this);
	}
	public void actionPerformed(ActionEvent ae) {
		while(loginAttempts<3) {
		if(username!="wazimu"&&passwd!="wazimu") {
			showMessageDialog(null,"Invalid Username or Password.\nTry Again!!!","Login Failure",ERROR_MESSAGE);
			loginMethod(username,passwd);
		}else if(username=="wazimu"&&passwd=="wazimu"){
			showMessageDialog(null,"Login Succcessful","Login Success",INFORMATION_MESSAGE);
		}else {
			showMessageDialog(null,"The System will now quit");
		}
		loginAttempts++;
		}
	}
	
}
