package tuts;

public class Vehicle {
	int wheels;
	private Vehicle(int wheels)
	{
		wheels=wheels;
		System.out.println(wheels+" Wheeler Vehicle created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v1=new Vehicle(2);
		Vehicle v2=new Vehicle(3);
		Vehicle v3=new Vehicle(4);
		
	}

}
