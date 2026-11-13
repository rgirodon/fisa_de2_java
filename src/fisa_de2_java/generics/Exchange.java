package fisa_de2_java.generics;

import java.util.ArrayList;

public class Exchange extends Human {


	public Exchange(String firstName, String lastName) {
		super(firstName, lastName);
	}
	
	@Override
	public Double computeMean() {
		
		Double result = 0.0;
		
		Integer sumCoefficients = 0;
		
		for (Evaluation currentEvaluation : this.getEvaluations()) {
			
			Double note = currentEvaluation.getNote();
			
			if (note < 20) {
				
				note = note + 1;
			}
			
			result += currentEvaluation.getCoefficient() * note;
			
			sumCoefficients += currentEvaluation.getCoefficient();
		}
		
		return (result / sumCoefficients);
	}

	@Override
	public String toString() {
		return "Exchange [firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + "]";
	}
}
