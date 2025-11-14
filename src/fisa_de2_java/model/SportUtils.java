package fisa_de2_java.model;

import java.util.ArrayList;

public class SportUtils {

	public static void makePeopleRun(ArrayList<Runnable> runners) {
		
		for (Runnable runner : runners) {
			
			runner.run();
		}
	}
	
	public static void makePeopleShoot(ArrayList<Shootable> shooters) {
		
		for (Shootable shooter : shooters) {
			
			shooter.shoot();
		}
	}
}
