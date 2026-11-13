package fisa_de2_java.generics;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		Student s1 = new Student(111L, "Remy", "Girodon");
		s1.addEvaluation(new Evaluation(12.0, 1));
		s1.addEvaluation(new Evaluation(16.0, 1));
		
		Student s2 = new Student(222L, "Jean", "Durand");
		s2.addEvaluation(new Evaluation(10.0, 2));
		s2.addEvaluation(new Evaluation(16.0, 1));
		
		Exchange e1 = new Exchange("Arthur", "Miller");
		e1.addEvaluation(new Evaluation(12.0, 1));
		e1.addEvaluation(new Evaluation(16.0, 1));
		
		Exchange e2 = new Exchange("John", "Denver");
		e2.addEvaluation(new Evaluation(10.0, 2));
		e2.addEvaluation(new Evaluation(16.0, 1));
		
		ArrayList<Evaluable> evaluables = new ArrayList<Evaluable>();
		evaluables.add(s1);
		evaluables.add(s2);
		evaluables.add(e1);
		evaluables.add(e2);
		
		Scolarite.manageEvaluations(evaluables);
	}

}
