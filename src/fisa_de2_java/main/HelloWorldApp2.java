package fisa_de2_java.main;

import fisa_de2_java.model.Account;
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
	}
}
