package fisa_de2_java.model;

public abstract class Account {

	private double balance;
	
	private long number;
	
	private TypeAccount typeAccount;
	
	public Account() {
		
		this.balance = 0;
		
		this.number = 0;
		
		this.typeAccount = TypeAccount.CURRENT;
	}
	
	public Account(double balance, long number, TypeAccount typeAccount) {
		
		this.balance = balance;
		
		this.number = number;
		
		this.typeAccount = typeAccount;
	}
	
	public void display() {
		
		System.out.println("Account [typeAccount=" + this.typeAccount + ", number=" + this.number + ", balance=" + this.balance + "]");
	}
	
	public void withdraw(double amount) {
		
		if (this.checkWithdraw(amount)) {
		
			this.balance -= amount;
		}
	}
	
	public void credit(double amount) {
		
		if (this.checkCredit(amount)) {
		
			this.balance += amount;
		}
	}
	
	public abstract boolean checkCredit(double amount);
	
	public abstract boolean checkWithdraw(double amount);

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public TypeAccount getTypeAccount() {
		return typeAccount;
	}

	public void setTypeAccount(TypeAccount typeAccount) {
		this.typeAccount = typeAccount;
	}
	
	
}
