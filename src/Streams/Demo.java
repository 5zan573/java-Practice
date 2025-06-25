package Streams;

import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		numbers.stream().filter(e -> e%2 == 0)
		.forEach(e -> System.out.println(e));
		
		List<String> str = Arrays.asList("faizan", "ali", "hussain");
		str.stream().map(n -> n.toUpperCase())
		.forEach( n -> System.out.println(n));
		
		List<Integer> nums = Arrays.asList(40, 55, 60, 25, 90);
		int sum=nums.stream().filter(s -> s > 50).mapToInt(n -> n).sum();
		System.out.println(sum);
	}

}
