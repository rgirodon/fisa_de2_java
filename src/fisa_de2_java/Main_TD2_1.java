package fisa_de2_java;

public class Main_TD2_1 {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.number = 1L;
		a1.credit(100.0);
		a1.withdraw(50.0);
		a1.display();
		
		Account a2 = new Account();
		a2.number = 2L;
		a2.credit(200.0);
		a2.withdraw(40.0);
		a2.display();
	}

}
