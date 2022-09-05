public class LecEx2{
 public static void main(String[] args) {
		String sName=args[1];
		String fName=args[0];
		int age=Integer.parseInt(args[2]);
		System.out.println("Hello "+fName+" "+sName+" you will be "+(age+1)+" years next year.");
	}
}