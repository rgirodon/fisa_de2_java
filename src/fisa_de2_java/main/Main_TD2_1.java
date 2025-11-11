package fisa_de2_java.main;

import java.util.ArrayList;

import fisa_de2_java.model.Account;
import fisa_de2_java.model.AccountUtils;
import fisa_de2_java.model.BlockedAccount;
import fisa_de2_java.model.CurrentAccount;
import fisa_de2_java.model.SavingAccount;
import fisa_de2_java.model.TypeAccount;

public class Main_TD2_1 {

	public static void main(String[] args) {
		
		Account a1 = new CurrentAccount();
		a1.setNumber(1L);
		a1.credit(100.0);
		a1.withdraw(50.0);
	
		Account a2 = new CurrentAccount(100.0, 2L, 200.0);
		a2.credit(200.0);
		a2.withdraw(40.0);
		a2.withdraw(440.0);
		
		Account a3 = new SavingAccount(100.0, 3L, 1000.0);
		a3.credit(200.0);
		a3.credit(1000.0);
		
		Account a4 = new BlockedAccount(100.0, 4L);
		a4.credit(200.0);
		a4.withdraw(10.0);
		a4.credit(1000.0);
		
		ArrayList<Account> myList = new ArrayList<>();
		myList.add(a1);
		myList.add(a2);
		myList.add(a3);
		myList.add(a4);
		
		AccountUtils.displayAccounts(myList);
	}

}
