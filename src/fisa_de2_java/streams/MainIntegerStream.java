package fisa_de2_java.streams;

import java.util.stream.Stream;

public class MainIntegerStream {

	public static void main(String[] args) {
		
		Stream<Integer> stream = IntegerStreamHelper.buildRandomIntegersStream(10);
		
		System.out.println(IntegerStreamHelper.countEvenNumbersInStream(stream));
	}

}
