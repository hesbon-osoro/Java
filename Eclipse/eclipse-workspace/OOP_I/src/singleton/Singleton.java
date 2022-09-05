package singleton;
//import singleton.SingletonDemo;
public class Singleton {
	
		private static Singleton singleton=new Singleton();
		/*A private constructor prevents
		any other class from instantiating*/
		private Singleton(){}
		/*static 'instance' method*/
		public static Singleton getInstance()
		{
		return singleton;
		}
		/*other methods protected by singleton-ness*/
		protected static void demoMethod()
		{
		System.out.println("demoMethod for singleton");
		}
	
}
