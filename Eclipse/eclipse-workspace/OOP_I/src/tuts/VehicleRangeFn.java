package tuts;

public class VehicleRangeFn {
	int passengers;
	int fuelcap;
	int mpg;

	void Range() {
		int R;
		R=fuelcap*mpg;
		System.out.println("Range: "+R+" miles");
	}
	public static void main(String[] args) {
		VehicleRangeFn minivan=new VehicleRangeFn();
		VehicleRangeFn sportscar=new VehicleRangeFn();
		
	minivan.passengers=14;	
	minivan.fuelcap=15;
	minivan.mpg=20;
	
	sportscar.passengers=12;	
	sportscar.fuelcap=25;
	sportscar.mpg=18;
	
	System.out.println("Minivan carry's: "+minivan.passengers+" passengers");
	minivan.Range();
	System.out.println("Sportscar carry's: "+sportscar.passengers+" passengers");
	sportscar.Range();
	}

}
