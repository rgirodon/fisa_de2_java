package fisa_de2_java.main;


import static fisa_de2_java.main.DemoStaticFields.*;

import fisa_de2_java.model.Account;
import fisa_de2_java.model.Circle;
import fisa_de2_java.model.CircleService;
import fisa_de2_java.model.CurrentAccount;
import fisa_de2_java.model.Customer;
import fisa_de2_java.model.ISalutationer;
import fisa_de2_java.model.SalutationerFactory;
import fisa_de2_java.model.SavingAccount;
import fisa_de2_java.model.TypeAccount;

/**
 * Classe de lancement du programme
 * @author rgirodon
 *
 */
public class HelloWorldApp2 {

	/**
	 * Méthode principale de lancement du programme
	 * @param args parametre inutile
	 */
	public static void main(String[] args) {
		
		/*
		int num1 = 26;
		
		int num2 = 32;
		
		System.out.println("Addition : " + (num1 + num2));
	
		String firstName = "Rémy";
		
		String lastName = "Girodon";
		
		System.out.println(firstName + " " + lastName.toUpperCase());
		
		String[] skills = { "Java", "JS", "Python" };
		
		for (String skill : skills) {
			
			System.out.println(skill.toUpperCase());
		}
		
		for (int i = 0; i < skills.length; i++) {
			
			System.out.println(skills[i]);
		}
		
		System.out.println(Poste.DEFENSEUR);
		
		int[] integers = {1, 2, 3, 4, 5};

		int sum = 0;
		
		for (int integer : integers) {
			
			sum += integer;
		}
		
		System.out.println(sum);
		*/
		
		/*
		Account account1 = new Account();
		
		account1.setNumber(1111L);
		
		account1.setBalance(100.0);
		
		account1.setTypeAccount(TypeAccount.CURRENT);
		
		account1.credit(200.0);
		
		account1.withdraw(50.0);
		
		account1.display();
		
		
		Account account2 = new Account(200.0, 2222L, TypeAccount.SAVINGS);
				
		account2.credit(100.0);
		
		account2.withdraw(150.0);
		
		account2.display();
		*/
		
		// displayNbInstances();
		
		/*
		Circle c1 = new Circle(22.0);		
		Circle c2 = new Circle(14.0);
		
		System.out.println(CircleService.computePerimeter(c1));
		System.out.println(CircleService.computeArea(c1));
		
		System.out.println(CircleService.computePerimeter(c2));
		System.out.println(CircleService.computeArea(c2));
		*/
		
		/*
		Customer customer1 = new Customer("Jean", "Dupont");
		customer1.addAccount(new SavingAccount(111, 111.11, 12000));
		
		CurrentAccount cc1 = new CurrentAccount(112, 112.12, 1000);
		cc1.withdraw(500);
		customer1.addAccount(cc1);
		
		Customer customer2 = new Customer("Jeanne", "Durand");
		
		CurrentAccount cc2 = new CurrentAccount(222, 222.22, 1000);
		cc2.withdraw(5000);
		customer2.addAccount(cc2);
		
		customer1.display();
		customer2.display();
		*/
		
		/*
		ISalutationer salutationer = SalutationerFactory.provideSalutationer();
				
		salutationer.salute();
		*/	
				
				
				
				
				
				
				
				
				
				
	}
}
