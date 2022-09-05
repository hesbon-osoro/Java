package polymorphism;
// Represents the cash dispenser of the ATM
public class CashDispenser {
	//default initial number of bills in the cash dispenser
	private final static int INITIAL_COUNT = 500;
	private int count;
	public CashDispenser() {
		count = INITIAL_COUNT;
	}
	public void dispenseCash(int amount) {
		int billsRequired = amount/20;
		count -= billsRequired;
	}
	public boolean isSufficientCashAvailable(int amount) {
		int billsRequired = amount = 20;
		if(count >= billsRequired)
			return true;
		else
			return false;
	}
}
