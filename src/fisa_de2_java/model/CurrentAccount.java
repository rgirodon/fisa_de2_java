package fisa_de2_java.model;

public class CurrentAccount extends Account {

	private double decouvertAutorise;
	
	public CurrentAccount() {
		
		super();
		
		this.setType(TypeAccount.CURRENT);
		
		this.decouvertAutorise = 0.0;
	}
	
	public CurrentAccount(double balance, long number, double decouvertAutorise) {
		
		super(balance, number);
		
		this.setType(TypeAccount.CURRENT);
		
		this.decouvertAutorise = decouvertAutorise;
	}
	
	public boolean isPossibleWithdraw(double amount) {

		boolean result = true;
	
		if ((this.getBalance() - amount) < (-this.decouvertAutorise)) {
			
			result = false;
		}
		
		return result;
	}
	
	public boolean isPossibleCredit(double amount) {
		
		return true;
	}
	
	public double getDecouvertAutorise() {
		return decouvertAutorise;
	}

	public void setDecouvertAutorise(double decouvertAutorise) {
		this.decouvertAutorise = decouvertAutorise;
	}
}
