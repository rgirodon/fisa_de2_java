package fisa_de2_java.generics;

import java.util.ArrayList;

public class Scolarite {

	public static void manageEvaluations(ArrayList<Evaluable> evaluables) {
		
		for (Evaluable evaluable : evaluables) {
			
			System.out.println("Moyenne de " + evaluable + " : " + evaluable.computeMean());
		}
	}
}
