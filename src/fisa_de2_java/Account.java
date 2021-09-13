package fisa_de2_java;

public class Account {

	double balance = 0.0;
	
	long number = 0L;
	
	TypeAccount type = TypeAccount.CURRENT;
	
	void display() {
		
		System.out.println("Account [type=" + type + ", number=" + number + ", balance=" + balance + "]");
	}
	
	void withdraw(double amount) {
		
		this.balance -= amount;
	}
	
	void credit(double amount) {
		
		this.balance += amount;
	}
}
