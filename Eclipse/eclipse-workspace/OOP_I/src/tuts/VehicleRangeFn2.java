package tuts;

public class VehicleRangeFn2 {
	int passengers;
	int fuelcap;
	int mpg;

	int Range() {
		return fuelcap*mpg;
	}
	public static void main(String[] args) {
		
			VehicleRangeFn2 minivan=new VehicleRangeFn2();
			VehicleRangeFn2 sportscar=new VehicleRangeFn2();
			int rangeM,rangeS;
		minivan.passengers=14;	
		minivan.fuelcap=15;
		minivan.mpg=12;
		
		sportscar.passengers=12;	
		sportscar.fuelcap=24;
		sportscar.mpg=16;
		
		System.out.println("Minivan carry's: "+minivan.passengers+" passengers");
		rangeM=minivan.Range();
		System.out.println("Range: "+rangeM+" miles");
		System.out.println("Sportscar carry's: "+sportscar.passengers+" passengers");
		rangeS=sportscar.Range();
		System.out.println("Range: "+rangeS+" miles");
	}

}
