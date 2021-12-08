package fisa_de2_java.main;

import fisa_de2_java.model.BilingualSalutationer;
import fisa_de2_java.model.TrilingualSalutationer;

public class Main_TD3_2 {

	public static void main(String[] args) {
		
		TrilingualSalutationer salutationer = new TrilingualSalutationer();
		
		System.out.println(salutationer.saluteInEnglish("Rémy"));
		
		System.out.println(salutationer.saluteInFrench("Rémy"));
		
		System.out.println(salutationer.saluteInSpanish("Rémy"));
	}
}
