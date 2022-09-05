package method_overloading;
class MyClass{
	int x;
	MyClass(){
	System.out.println("Inside MyClass(). ");
	x=0;
	}
	MyClass(int i){
	System.out.println("Inside MyClass(int). ");
	x=i;
	}
	MyClass(double d){
	System.out.println("Inside MyClass(double). ");
	x=(int)d;
	}
	MyClass(int i, int j){
	System.out.println("Inside MyClass(int, int). ");
	x=i*j;
	}
}
public class OverLoadConstructors {

	public static void main(String[] args) {
		MyClass m1=new MyClass();
		MyClass m2=new MyClass(10);
		MyClass m3=new MyClass(12.5);
		MyClass m4=new MyClass(10,20);
	System.out.println("m1.x: "+m1.x);
	System.out.println("m2.x: "+m2.x);
	System.out.println("m3.x: "+m3.x);
	System.out.println("m4.x: "+m4.x);
	}

}
