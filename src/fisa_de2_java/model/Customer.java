package fisa_de2_java.model;

import java.util.ArrayList;

public class Customer {

	private String firstName;
	
	private String lastName;
	
	private ArrayList<IAccount> accounts;

	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.accounts = new ArrayList<>();
	}
	
	public void addAccount(IAccount account) {
		
		this.accounts.add(account);
	}
	
	public void display() {
		
		System.out.println("Customer " + this.firstName + " " + this.lastName);
		
		for (IAccount account : this.accounts) {
		
			account.display();
		}
	}
}
