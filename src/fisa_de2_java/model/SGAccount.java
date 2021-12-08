package fisa_de2_java.model;

public class SGAccount implements IAccount {

	private double balance;
	
	private long number;
	
	private TypeAccount type;
	
	private double plafond;
	
	private double decouvertAutorise;
	
	public SGAccount() {
		
		this.balance = 0.0;
		
		this.number = 0L;
		
		this.type = TypeAccount.CURRENT;
		
		this.decouvertAutorise = 0.0;
		
		this.plafond = 0.0;
	}
	
	public SGAccount(double balance, long number) {
		
		this.balance = balance;
		
		this.number = number;
		
		this.type = TypeAccount.CURRENT;
		
		this.decouvertAutorise = 0.0;
		
		this.plafond = 0.0;
	}

	
	@Override
	public void display() {
		
		System.out.println("SG Account [type=" + this.type + ", number=" + this.number + ", balance=" + this.balance + "]");
	}
	
	@Override
	public void withdraw(double amount) {
		
		if (this.isPossibleWithdraw(amount)) {
		
			this.balance -= amount;
		}
		else {
			System.out.println("Withdraw impossible");
		}
	}
	
	
	public boolean isPossibleWithdraw(double amount) {

		boolean result = true;
		
		if (this.type == TypeAccount.SAVINGS) {
			
			if ((this.balance - amount) < 0.0) {
				
				result = false;
			}
		}
		else {
			if ((this.balance - amount) < (-this.decouvertAutorise)) {
				
				result = false;
			}
		}
		
		return result;
	}

	@Override
	public void credit(double amount) {
		
		if (this.isPossibleCredit(amount)) {
		
			this.balance += amount;
		}
		else {
			System.out.println("Credit impossible");
		}
	}

	
	public boolean isPossibleCredit(double amount) {
		
		boolean result = true;
		
		if (this.type == TypeAccount.SAVINGS) {
			
			if ((this.balance + amount) > this.plafond) {
				
				result = false;
			}
		}
		
		return result;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	public long getNumber() {
		return number;
	}

	@Override
	public void setNumber(long number) {
		this.number = number;
	}

	public TypeAccount getType() {
		return type;
	}

	@Override
	public void setType(TypeAccount type) {
		this.type = type;
	}
	
	public double getPlafond() {
		return plafond;
	}

	@Override
	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}

	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
}
