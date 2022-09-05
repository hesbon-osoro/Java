package polymorphism;

//Abstract superclass Transaction represents an ATM transaction

public abstract class Transaction {
	private int accountNumber;
	private Screen screen;
	private BankDatabase bankdb;
	
	public Transaction(int accNumber, Screen sc, BankDatabase db) {
		accountNumber = accNumber;
		screen = sc;
		bankdb = db;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public Screen getScreen() {
		return screen;
	}
	public BankDatabase getBankDatabase() {
		return bankdb;
	}
	public abstract void execute();
}
