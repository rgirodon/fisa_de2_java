package fisa_de2_java.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import fisa_de2_java.model.BilingualSalutationer;
import fisa_de2_java.model.TrilingualSalutationer;

public class Main_FI {

	public static void main(String[] args) {
	
		/*
		Map<String, Integer> nameMap = new HashMap<>();
		
		Integer value = nameMap.computeIfAbsent("John", s -> s.length());
		
		System.out.println(value);
		
		nameMap.put("John", 32);
		
		value = nameMap.computeIfAbsent("John", s -> s.length());
		
		System.out.println(value);
		*/
		
		/*
		Supplier<Double> lazyValue = () -> {
		    
		    return Math.PI;
		};
		
		Double valueSquared = square(lazyValue);
		
		System.out.println(valueSquared);
		*/
		
		/*
		List<String> names = Arrays.asList("John", "Freddy", "Samuel");
		
		names.forEach(name -> System.out.println("Hello, " + name));
		*/
		
		TrilingualSalutationer ts = new TrilingualSalutationer();		
		System.out.println(ts.saluteInEnglish("Remy"));
		System.out.println(ts.saluteInFrench("Remy"));
		System.out.println(ts.saluteInSpanish("Remy"));
		
		BilingualSalutationer bs = new BilingualSalutationer();
		System.out.println(bs.saluteInEnglish("Olivier"));
		System.out.println(bs.saluteInFrench("Olivier"));
	}
	
	/*
	public static double square(Supplier<Double> lazyValue) {
	    return Math.pow(lazyValue.get(), 2);
	}
	*/
	
}
