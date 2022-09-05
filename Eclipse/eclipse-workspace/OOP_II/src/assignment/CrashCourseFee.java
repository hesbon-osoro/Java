package assignment;

public class CrashCourseFee extends FeeComputer{
	CrashCourseFee(double hourlyFee){
		this.hourlyFee=hourlyFee;
	}
	double getFee(double hours) {
		return hourlyFee*hours+10000.0;
	}
	void showOutput() {
		System.out.println("Crash Course Amount: $"+getFee(2.5));
		
	}
	public static void main(String[] args) {
		CrashCourseFee c=new CrashCourseFee(500);
		c.showOutput();
	}

}
