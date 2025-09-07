package fisa_de2_java.streams;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamHelper {

	public static Stream<Integer> buildRandomIntegersStream(long nb) {
		
		Random random = new Random();
		
		Stream<Integer> result = random
									.ints(nb, 0, 10)
									.mapToObj(i -> Integer.valueOf(i));
		
		return result;
	}
	
	public static int sumNumbersWithCubeEvenInStream(Stream<Integer> intStream) {
		
		/*
		return intStream
				.peek(e -> System.out.println("Original value: " + e))
				.map(nb -> (int)Math.pow(nb, 3))
				.peek(e -> System.out.println("Cube value: " + e))
				.filter(nb -> nb % 2 == 0)
				.peek(e -> System.out.println("Filtered value: " + e))
				.count();
		*/
		
		return intStream
				.map(nb -> (int)Math.pow(nb, 3))
				.filter(nb -> nb % 2 == 0)
				.reduce((a,b) -> a+b)
				.orElse(0);
	}
}
