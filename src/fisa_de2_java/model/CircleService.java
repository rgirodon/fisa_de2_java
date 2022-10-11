package fisa_de2_java.model;

public class CircleService {

	public final static double PI = 3.14;
	
	public static double computePerimeter(Circle circle) {
		
		return 2 * CircleService.PI * circle.getRadius();
	}
	
	public static double computeArea(Circle circle) {
		
		return CircleService.PI * circle.getRadius() * circle.getRadius();
	}
}
