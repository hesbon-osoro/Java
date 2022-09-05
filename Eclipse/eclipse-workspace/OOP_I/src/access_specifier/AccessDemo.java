package access_specifier;
class myClass{
	private int alpha;//private access
	public int beta;//public access
	int gamma;//default access(essentially public)
	/*Methods to access alpha. Members of a class can access
	 * a private member of the same class*/
	void setAlpha(int a) {
		alpha=a;
	}
	int getAlpha() {
		return alpha;
	}
}
public class AccessDemo {

	public static void main(String[] args) {
		myClass m=new myClass();
		m.setAlpha(-99);
	System.out.println("m.alpha: "+m.getAlpha());
	//alpha cannot be accessed like
	//m.alpha=10;//Wrong! alpha is private
	//the following are OK coz beta and gamma are public
	m.beta=50;
	m.gamma=25;
	System.out.println("m.beta: "+m.beta);
	System.out.println("m.gamma: "+m.gamma);
	}

}
