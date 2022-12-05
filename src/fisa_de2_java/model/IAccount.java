package fisa_de2_java.model;

public interface IAccount {

	void withdraw(double amount);
	
	void credit(double amount);
	
	void display();
		 
	double getBalance();
	  
	void setNumber(long number);
	
	void setType(TypeAccount type);
	
	default boolean isPossibleWithdraw(double amount) {
		
		return true;
	}
	
	default boolean isPossibleCredit(double amount) {
		
		return true;
	}
}
