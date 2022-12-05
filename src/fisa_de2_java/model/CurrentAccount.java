package fisa_de2_java.model;

public class CurrentAccount extends Account {
	
	private double decouvertAutorise;
	
	public CurrentAccount(long number, double balance, double decouvertAutorise) {
		super(balance, number, TypeAccount.CURRENT);
		this.decouvertAutorise = decouvertAutorise;
	}

	@Override
	public boolean checkWithdraw(double amount) {
		
		return ((this.getBalance() - amount) >= (-this.decouvertAutorise));
	}
	
	@Override
	public boolean checkCredit(double amount) {
		
		return true;
	}
}
