package fisa_de2_java;

public class Main_TD1_1 {

	public static void main(String[] args) {

		int[] myArray = {10, 20, 30};
		
		int sum = 0;
	
		for (int i = 0; i < myArray.length; i++) {
			
			sum += myArray[i];			
		}
		
		System.out.println(sum);
	}
}
