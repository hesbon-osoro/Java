package encapsulation;
class This{
	private  void hiddenMethod() {
		System.out.println("This method is hidden from the Encapsulated Class");
		System.out.println("The method is only visible and usable only in this class");
	}
}
public class EncapsulatedClass {

	public static void main(String[] args) {
		
		/**
		 * uncomment the line below and see the error message
		 */
		//This t=new This();
		//t.hiddenMethod();
		
		System.out.println("Encapsulation involves hiding data and methods in objects");
		System.out.println("Encapsulation is achieved by using *private* keyword.");
	}

}
