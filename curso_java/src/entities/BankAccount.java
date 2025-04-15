package entities;

public class BankAccount {
	private int accountNumber;
	private String name;
	private double balance;
	
	public BankAccount(int accountNumber, String name) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
	}
	public BankAccount(int accountNumber, String name, Double initialValue) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		balance = initialValue;
	}



	public int getAccountNumber() {
		return accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getBalance() {
		return balance;
	}
	
	
	public void Deposit(Double value) {
		balance += value;
	}
	public void Withdraw(double value) {
		balance -= (value + 5) ;
	}
	
	public String toString() {
		return "Account data:\r\n"
				+ "Account " + accountNumber + " Holder: " + name + " Balance: $" + balance;
	}
	
	
	
	
	
}
