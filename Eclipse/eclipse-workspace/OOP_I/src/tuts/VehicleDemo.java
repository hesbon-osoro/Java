package tuts;

public class VehicleDemo {
	int passengers;//no of passengers
	int fuelcap;//fuel capacity in gallons
	int mpg;//fuel consumption
	public static void main(String[] args) {
		VehicleDemo minivan=new VehicleDemo();
		
	minivan.passengers=14;	
	minivan.fuelcap=15;
	minivan.mpg=20;
	int range;
	range=minivan.fuelcap*minivan.mpg;
	System.out.println("Minivan carry's: "+minivan.passengers+" passengers");
	System.out.println("Minivan Range: "+range+" miles");
	}

}
