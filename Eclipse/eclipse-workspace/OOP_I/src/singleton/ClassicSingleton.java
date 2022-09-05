package singleton;

public class ClassicSingleton {
	private static ClassicSingleton instance =null;
	private ClassicSingleton()
	{
	//Exists only to defeat instantiation.
	}
	public static ClassicSingleton getInstance()
	{
	if(instance==null)
	{
	instance=new ClassicSingleton();
	}
	return instance;
	}
}

/*The ClassicSingleton class maintains a static
 *  reference to the lone singleton instance 
 *  and returns that reference from the static
 *   getInstance() method. 
 
Here, ClassicSingleton class employs a technique 
known as lazy instantiation to create the singleton;
 as a result, the singleton instance is not created 
 until the getInstance() method is called for the 
 first time. This technique ensures that singleton 
 instances are created only when needed.*/