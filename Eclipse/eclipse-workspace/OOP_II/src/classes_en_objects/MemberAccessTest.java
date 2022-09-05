package classes_en_objects;

public class MemberAccessTest {

	public static void main(String[] args) {
		Time1 time = new Time1(); 
		/*time.hour = 7; // error: hour has private access in Time1
		time.minute = 15; // error: minute has private access in Time1
		time.second = 30; // error: second has private access in Time1*/
	}

}
