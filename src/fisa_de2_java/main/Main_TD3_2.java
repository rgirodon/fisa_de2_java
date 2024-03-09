package fisa_de2_java.main;

import fisa_de2_java.model.IDancer;
import fisa_de2_java.model.ISalutationer;
import fisa_de2_java.model.Popstar;
import fisa_de2_java.model.SalutationerFactory;

public class Main_TD3_2 {

	public static void main(String[] args) {
		
		/*
		TrilingualSalutationer salutationer = new TrilingualSalutationer();
		
		System.out.println(salutationer.saluteInEnglish("Rémy"));
		
		System.out.println(salutationer.saluteInFrench("Rémy"));
		
		System.out.println(salutationer.saluteInSpanish("Rémy"));
		*/
		
		/*
		ISalutationer mySalutationer = SalutationerFactory.provideSalutationer(SalutationerFactory.ENGLISH);
		mySalutationer.salute();
		
		mySalutationer = SalutationerFactory.provideSalutationer(SalutationerFactory.FRENCH);
		mySalutationer.salute();
		
		mySalutationer = SalutationerFactory.provideSalutationer(SalutationerFactory.SPANISH);
		mySalutationer.salute();
		*/
		
		/*
		Popstar myStar = new Popstar();
		myStar.dance();
		myStar.sing();
		*/
		
		ISalutationer mySalutationer = () -> System.out.println("Gutten Tag");
		
		mySalutationer.salute();
		
	}
}
