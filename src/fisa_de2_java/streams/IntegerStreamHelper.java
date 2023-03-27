package fisa_de2_java.streams;

import java.util.Random;
import java.util.stream.IntStream;

public class IntegerStreamHelper {

	public static IntStream buildRandomIntegersStream(long nb) {
		
		Random random = new Random();
		
		IntStream result = random.ints(nb);
		
		return result;
	}
	
	public static long countEvenNumbersInStream(IntStream intStream) {
		
		return intStream
				.filter(nb -> nb % 2 == 0)
				.count();
	}
}
