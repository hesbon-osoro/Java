package abstraction;
abstract class Animal{
	public abstract void sound();
}
public class Dog extends Animal{
public void sound() {
	System.out.println("Woof");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal obj=new Dog();
obj.sound();
	}

}
