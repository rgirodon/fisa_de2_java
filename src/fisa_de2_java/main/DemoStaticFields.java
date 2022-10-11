package fisa_de2_java.main;

public class DemoStaticFields {

	public static int INSTANCES_COUNTER;
	
	static {	
		System.out.println("Bloc d initialisation static");
		
		DemoStaticFields.INSTANCES_COUNTER = 0;
	}
	
	static class InstancesCounterHandler {
		
		public void displayNbInstances() {
			
			System.out.println(DemoStaticFields.INSTANCES_COUNTER);
		}
	}
	
	public DemoStaticFields() {
		
		DemoStaticFields.INSTANCES_COUNTER++;
	}
	
	public static void main(String[] args) {
		
		DemoStaticFields.InstancesCounterHandler handler = new DemoStaticFields.InstancesCounterHandler();
		
		handler.displayNbInstances();
		
		for (int i = 0; i < 100; i++) {
		
			new DemoStaticFields();
		}
		
		handler.displayNbInstances();
	}
}
