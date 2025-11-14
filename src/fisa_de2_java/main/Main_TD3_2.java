package fisa_de2_java.main;

import fisa_de2_java.model.Factory;
import fisa_de2_java.model.Salutationer;

public class Main_TD3_2 {

	public static void main(String[] args) {
		
		Salutationer salutationer = Factory.provideSalutationer();
		
		salutationer.salute();
	}
}
