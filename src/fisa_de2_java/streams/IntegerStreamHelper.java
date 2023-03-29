package fisa_de2_java.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamHelper {

	public static Stream<Integer> buildRandomIntegersStream(long nb) {
		
		Random random = new Random();
		
		Stream<Integer> result = random
									.ints(nb)
									.mapToObj(i -> Integer.valueOf(i));
		
		return result;
	}
	
	public static long countEvenNumbersInStream(Stream<Integer> intStream) {
		
		return intStream
				.peek(e -> System.out.println("Original value: " + e))
				.filter(nb -> nb % 2 == 0)
				.peek(e -> System.out.println("Filtered value: " + e))
				.count();
	}
}
