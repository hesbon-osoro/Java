package tuts;

class isFactor{
	boolean iFactor(int a, int b) {
		if((b%a)==0)
			return true;
		else
			return false;
	}
}
public class Factor {

	public static void main(String[] args) {
	isFactor fact=new isFactor();
	if(fact.iFactor(3,9))
		System.out.println("3 is a factor 9.\n");
	if(!fact.iFactor(3,9))
		System.out.println("3 is not  factor 9.\n");
	}

}
