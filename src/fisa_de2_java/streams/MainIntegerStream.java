package fisa_de2_java.streams;

import java.util.stream.IntStream;

public class MainIntegerStream {

	public static void main(String[] args) {
		
		IntStream stream = IntegerStreamHelper.buildRandomIntegersStream(100);
		
		System.out.println(IntegerStreamHelper.countEvenNumbersInStream(stream));
	}

}
