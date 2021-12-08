package fisa_de2_java.model;

public interface IAccount {

	void withdraw(double amount);
	
	void credit(double amount);
	
	double getBalance();
	
	void display();
	
	void setNumber(long number);
	
	void setPlafond(double plafond);
	
	void setType(TypeAccount type);
	
	/*
	default boolean isPossibleWithdraw(double amount) {
		
		return true;
	}
	
	default boolean isPossibleCredit(double amount) {
		
		return true;
	}
	*/
}
