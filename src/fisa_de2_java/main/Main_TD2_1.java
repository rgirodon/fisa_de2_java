package fisa_de2_java.main;

import java.util.ArrayList;

import fisa_de2_java.model.Account;
import fisa_de2_java.model.TypeAccount;

public class Main_TD2_1 {

	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.setNumber(1L);
		a1.credit(100.0);
		a1.withdraw(50.0);
	
		Account a2 = new Account(100.0, 2L);
		a2.credit(200.0);
		a2.withdraw(40.0);
		a2.withdraw(440.0);
		
		Account a3 = new Account(100.0, 2L);
		a3.setType(TypeAccount.SAVINGS);
		a3.setPlafond(1000.0);
		a3.credit(200.0);
		a3.credit(1000.0);
		
		ArrayList<Account> myList = new ArrayList<>();
		myList.add(a1);
		myList.add(a2);
		myList.add(a3);
		
		for (Account currentAccount : myList) {
			
			currentAccount.display();
		}
		
		ArrayList<Integer> myOtherList = new ArrayList<>();
		myOtherList.add(1);
		myOtherList.add(2);
		myOtherList.add(3);
		
		for (Integer currentInteger : myOtherList) {
			
			System.out.println(currentInteger);
		}
	}

}
