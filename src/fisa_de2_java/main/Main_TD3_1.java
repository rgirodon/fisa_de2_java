package fisa_de2_java.main;

import java.util.ArrayList;

import fisa_de2_java.model.Footballer;
import fisa_de2_java.model.Halterophile;
import fisa_de2_java.model.Rugbyman;
import fisa_de2_java.model.Runnable;
import fisa_de2_java.model.Shootable;
import fisa_de2_java.model.SportUtils;
import fisa_de2_java.model.Sprinter;

public class Main_TD3_1 {

	public static void main(String[] args) {
		
		Sprinter s1 = new Sprinter();
		Halterophile h1 = new Halterophile();
		Footballer f1 = new Footballer();
		Rugbyman r1 = new Rugbyman();
		
		ArrayList<Runnable> runners = new ArrayList<>();
		runners.add(f1);
		runners.add(h1);
		runners.add(s1);
		runners.add(r1);
		
		SportUtils.makePeopleRun(runners);
		
		ArrayList<Shootable> shooters = new ArrayList<>();
		shooters.add(f1);
		shooters.add(r1);
		
		SportUtils.makePeopleShoot(shooters);
	}
}
