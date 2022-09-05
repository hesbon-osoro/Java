//package objectCreation;

public class Puppy
{
	public Puppy(String name)
	{
		//The constructor has one parameter, name
	System.out.println("Passed Name is :"+name);
	}

	public static void main(String[] args) {
		//The following will create an object myPuppy
		Puppy myPuppy=new Puppy("tommy");
		System.out.println(myPuppy);
		//Puppy(myPuppy);
	}

}
