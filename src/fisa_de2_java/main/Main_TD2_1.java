package fisa_de2_java.main;

import java.util.ArrayList;
import java.util.List;

import fisa_de2_java.factory.AccountFactory;
import fisa_de2_java.model.Account;
import fisa_de2_java.model.CreditImpossibleException;
import fisa_de2_java.model.CurrentAccount;
import fisa_de2_java.model.IAccount;
import fisa_de2_java.model.SavingAccount;
import fisa_de2_java.model.TypeAccount;
import fisa_de2_java.model.WithdrawImpossibleException;

public class Main_TD2_1 {

	public static void main(String[] args) {
		
		Account a1 = new CurrentAccount(1L, 100.0, 100.0);
		try {
			a1.credit(100.0);				
		} 
		catch (CreditImpossibleException e) {
			System.out.println("Crédit impossible sur " + a1.toString());
		}		
		try {
			a1.withdraw(50.0);
		}
		catch(WithdrawImpossibleException e) {
			System.out.println("Débit impossible sur " + a1.toString());
		}		
		a1.display();
	
		
		Account a2 = new CurrentAccount(2L, 200.0, 200.0);
		try {
			a2.withdraw(440.0);
		}
		catch(WithdrawImpossibleException e) {
			System.out.println("Débit impossible sur " + a2.toString());
		}		
		a2.display();
		
		/*
		Account a3 = new SavingAccount(3L, 300.0, 12000.0);
		a3.credit(200.0);
		a3.credit(1000.0);
		
		List<Account> myList = new ArrayList<>();
		myList.add(a1);
		myList.add(a2);
		myList.add(a3);
		
		for (Account currentAccount : myList) {
			
			currentAccount.display();
		}	
		*/	
	}

}
