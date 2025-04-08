package fisa_de2_java.model;

public class FoolAccountHandler {

	public static void foolHandling() {
		
		Account a = null;		
		try {
			a.credit(10.0);
		} 
		catch (CreditImpossibleException e) {
			System.out.println("Crédit impossible sur " + a.toString());
		}
	}
}
