package Streams;

import java.util.Arrays;
import java.util.List;

public class map {
	
	public static void main (String[]args) {
		
		List<String> str = Arrays.asList("faizan", "ali", "hussain");
		str.stream().map(n -> n.toUpperCase())
		.forEach( n -> System.out.println(n));
	}

}
