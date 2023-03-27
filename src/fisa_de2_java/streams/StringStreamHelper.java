package fisa_de2_java.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStreamHelper {

	public static Stream<String> streamWordsFromFile(String fileName) throws IOException {
		
		Stream<String> stream = Files.lines(Paths.get(fileName));
		
		return stream.flatMap(line -> Arrays.stream(line.split(" ")));
	}
	
	public static Collection<String> filterAndTransform(Stream<String> words) {
		
		Collection<String> result = words
										.filter(word -> word.length() >= 8)
										.map(word -> word.toUpperCase())
										.collect(Collectors.toList());
		
		return result;		
	}
}
