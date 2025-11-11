package fisa_de2_java.model;

import java.util.List;

public class AccountUtils {

	public static void displayAccounts(List<Account> accounts) {
		
		for (Account currentAccount : accounts) {
			
			currentAccount.display();
		}
	}
}
