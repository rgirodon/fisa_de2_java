package fisa_de2_java.model;

public class Rugbyman implements Runnable, Shootable {

	@Override
	public void run() {
		System.out.println("Run quite slow, but not sometimes fast !");
	}

	@Override
	public void shoot() {
		System.out.println("Shoot where you can !");
	}
}
