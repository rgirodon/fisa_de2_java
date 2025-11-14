package fisa_de2_java.model;

public class Footballer implements Runnable, Shootable {

	@Override
	public void run() {
		System.out.println("Run quite fast, but not so much !");
	}

	@Override
	public void shoot() {
		System.out.println("Shoot to the GK !");
	}
}
