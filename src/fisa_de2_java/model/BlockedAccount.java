package fisa_de2_java.model;

public class BlockedAccount extends Account {

	public BlockedAccount(double balance, long number) {
		
		super (balance, number);
		
		this.setType(TypeAccount.BLOCKED);
	}

	@Override
	public boolean isPossibleWithdraw(double amount) {

		return false;
	}

	@Override
	public boolean isPossibleCredit(double amount) {

		return true;
	}

}
