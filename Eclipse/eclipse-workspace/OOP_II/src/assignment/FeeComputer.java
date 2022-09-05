package assignment;

public abstract class FeeComputer {
	protected double hourlyFee;
	double getFee(double hours) {
		System.out.println(hourlyFee*hours);
		return (double)hourlyFee*hours;
	}

}
