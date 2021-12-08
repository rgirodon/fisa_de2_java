package fisa_de2_java.main;

import java.util.ArrayList;
import java.util.List;

import fisa_de2_java.factory.AccountFactory;
import fisa_de2_java.model.IAccount;
import fisa_de2_java.model.TypeAccount;

public class Main_TD2_1 {

	public static void main(String[] args) {
		
		IAccount a1 = AccountFactory.makeAccount();
		a1.setNumber(1L);
		a1.credit(100.0);
		a1.withdraw(50.0);
	
		IAccount a2 = AccountFactory.makeAccount(100.0, 2L);
		a2.credit(200.0);
		a2.withdraw(40.0);
		a2.withdraw(440.0);
		
		IAccount a3 = AccountFactory.makeAccount(100.0, 2L);
		a3.setType(TypeAccount.SAVINGS);
		a3.setPlafond(1000.0);
		a3.credit(200.0);
		a3.credit(1000.0);
		
		List<IAccount> myList = new ArrayList<>();
		myList.add(a1);
		myList.add(a2);
		myList.add(a3);
		
		for (IAccount currentAccount : myList) {
			
			currentAccount.display();
		}		
	}

}
