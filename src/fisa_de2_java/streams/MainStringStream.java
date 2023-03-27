package fisa_de2_java.streams;

import java.util.Collection;
import java.util.stream.Stream;

public class MainStringStream {

	public static void main(String[] args) {
		try {
			Stream<String> stream = StringStreamHelper.streamWordsFromFile("text.txt");
			
			Collection<String> strings = StringStreamHelper.filterAndTransform(stream);
			
			strings.forEach(str -> System.out.println(str));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
