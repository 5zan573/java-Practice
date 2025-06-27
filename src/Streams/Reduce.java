package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {
	
	public static void main(String[]args) {
		
		List<String> str=Arrays.asList("A","B","C","D","1","2","3");
		Optional<String> str1 = str.stream().reduce((value1, value2)->{
		return value2+value1;
		});
		
		System.out.println(str1);
	}

}
