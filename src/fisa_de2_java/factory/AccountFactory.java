package fisa_de2_java.factory;

import fisa_de2_java.model.IAccount;
import fisa_de2_java.model.SGAccount;

public class AccountFactory {

	public static IAccount makeAccount() {
		
		return new SGAccount();
	}
	
	public static IAccount makeAccount(double balance, long number) {
		
		return new SGAccount(balance, number);
	}
}
