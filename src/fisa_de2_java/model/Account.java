package fisa_de2_java.model;

abstract public class Account {

	private double balance;
	
	private long number;
	
	private TypeAccount type;
	

	public Account() {
		
		this.balance = 0.0;
		
		this.number = 0L;
	}
	
	public Account(double balance, long number) {
		
		this.balance = balance;
		
		this.number = number;
	}	

	
	public void display() {
		
		System.out.println("Account [type=" + this.type + ", number=" + this.number + ", balance=" + this.balance + "]");
	}
	
	public void withdraw(double amount) {
		
		if (this.isPossibleWithdraw(amount)) {
		
			this.balance -= amount;
		}
		else {
			System.out.println("Withdraw impossible");
		}
	}
	
	abstract public boolean isPossibleWithdraw(double amount);

	public void credit(double amount) {
		
		if (this.isPossibleCredit(amount)) {
		
			this.balance += amount;
		}
		else {
			System.out.println("Credit impossible");
		}
	}
	
	abstract public boolean isPossibleCredit(double amount);


	public double getBalance() {
		return balance;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public TypeAccount getType() {
		return type;
	}

	public void setType(TypeAccount type) {
		this.type = type;
	}
}
