package access_instance_variable;

public class Puppy 
{
	int puppyAge;
	public Puppy(String name)
	{
		//The constructor has one parameter, name
	System.out.println("Name chosen is :"+name);
	}
	public void setAge(int age)
	{
		puppyAge=age;
	}
	public int getAge()
	{
		System.out.println("Puppy's age is :"+puppyAge);
		return puppyAge;
	}

	public static void main(String[] args) {
		/*Object Creation*/
		Puppy myPuppy=new Puppy("Tommy");
		/*Call class method to set puppy's age*/
		myPuppy.setAge(2);
		/*Call another class method to get pupp's age*/
		myPuppy.getAge();
		/*You can access instance variable as follows as well*/
		System.out.println("Variable value :"+myPuppy.puppyAge);

	}

}
