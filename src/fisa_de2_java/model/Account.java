package fisa_de2_java.model;

public abstract class Account {

	private double balance;
	
	private long number;
	
	private TypeAccount typeAccount;
		
	public Account(double balance, long number, TypeAccount typeAccount) {
		
		this.balance = balance;
		
		this.number = number;
		
		this.typeAccount = typeAccount;
	}
	
	public void display() {
		
		System.out.println("Account [" + this.toString() + "]");
	}
	
	@Override
	public String toString() {
		return "balance=" + balance + ", number=" + number + ", typeAccount=" + typeAccount;
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
