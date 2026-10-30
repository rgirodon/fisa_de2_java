package fisa_de2_java.main;

import java.util.ArrayList;

public class Main_TD1_1 {

	public static void main(String[] args) {

		/*
		int[] myArray = {10, 20, 30};
		
		int sum = 0;
	
		for (int i = 0; i < myArray.length; i++) {
			
			sum += myArray[i];			
		}
		
		System.out.println(sum);
		*/
		
		/*
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.add(10);
		myArrayList.add(20);
		myArrayList.add(30);
		
		int sum = 0;
		
		for (Integer currentInt : myArrayList) {
			
			sum += currentInt;
		}
		
		System.out.println(sum);
		
		ArrayList<String> myArrayList2 = new ArrayList<>();
		myArrayList2.add("10");
		myArrayList2.add("20");
		myArrayList2.add("30");
		
		String sb = "";
		
		for (String currentStr : myArrayList2) {
			
			sb += currentStr;
		}
		
		System.out.println(sb);
		*/
		
		Tiger t = new Tiger();
		t.move();
	}
}
