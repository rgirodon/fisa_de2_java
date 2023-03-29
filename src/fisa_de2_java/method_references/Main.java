package fisa_de2_java.method_references;

public class Main {

	public static void main(String[] args) {
		
		// instantiate interface with lambda method
		ShowMessage sm_lambda = (String str) -> System.out.println("[LAMBDA] : " + str); 
		sm_lambda.showMessage("Message shown by a lambda");
		
		
		// instantiate interface with a static method reference
		ShowMessage sm_static_method_ref = StaticMessageDisplayer::displayMessage; 
		sm_static_method_ref.showMessage("Message shown by static method reference");
		
		
		// instantiate interface with a non static method reference
		NonStaticMessageDisplayer nsmd = new NonStaticMessageDisplayer();
		ShowMessage sm_non_static_method_ref = nsmd::displayMessage; 
		sm_non_static_method_ref.showMessage("Message shown by non static method reference");
		
		
		// instantiate interface with constructor method reference
		ShowMessage sm_constructor_method_ref = ConstructorMessageDisplayer::new; 
		sm_constructor_method_ref.showMessage("Message shown by constructor method reference");		
	}

}
