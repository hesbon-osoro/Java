package assignment;

public class FullCourseFee extends FeeComputer{
	public FullCourseFee(double hourlyFee) {
		this.hourlyFee=hourlyFee;
	}
	double getFee(double hours) {
		return hourlyFee*hours;
	}
	void showOutput() {
		System.out.println("Full Course Amount: $"+getFee(2.5));
	}
public static void main(String[] args) {
	FullCourseFee f=new FullCourseFee(500);
	f.showOutput();
}
}
