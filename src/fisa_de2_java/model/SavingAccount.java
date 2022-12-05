package fisa_de2_java.model;

public class SavingAccount extends Account {
		
	private double plafond;
	
	public SavingAccount(long number, double balance, double plafond) {
		super(balance, number, TypeAccount.SAVINGS);
		this.plafond = plafond;
	}
	
	@Override
	public boolean checkWithdraw(double amount) {
		
		return (this.getBalance() >= amount);
	}

	@Override
	public boolean checkCredit(double amount) {
		
		return ((this.getBalance() + amount) <= this.plafond);
	}
	
	@Override
	public String toString() {
		
		return super.toString() + ", plafond = " + this.plafond;
	}
}
