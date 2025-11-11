package fisa_de2_java.model;

public class SavingAccount extends Account {

	private double plafond;
	
	public SavingAccount() {
		
		super();
		
		this.setType(TypeAccount.SAVINGS);
		
		this.plafond = 0.0;
	}
	
	public SavingAccount(double balance, long number, double plafond) {
		
		super(balance, number);
		
		this.setType(TypeAccount.SAVINGS);
		
		this.plafond = plafond;
	}
	
	@Override
	public boolean isPossibleWithdraw(double amount) {
		
		boolean result = true;
					
		if ((this.getBalance() - amount) < 0.0) {
			
			result = false;
		}
		
		return result;
	}

	@Override
	public boolean isPossibleCredit(double amount) {
		
		boolean result = true;
		
		if ((this.getBalance() + amount) > this.plafond) {
			
			result = false;
		}
		
		return result;
	}

	public double getPlafond() {
		return plafond;
	}

	public void setPlafond(double plafond) {
		this.plafond = plafond;
	}
}
