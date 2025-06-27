package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class filter {
int id; 
String product;
int price;
	
	filter(int id, String product, int price){
		this.id=id;
		this.product=product;
		this.price=price;
	}

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		numbers.stream().filter(e -> e%2 == 0)
		.forEach(e -> System.out.println(e));
		
		List<filter> list = new ArrayList<filter>();
		list.add(new filter(1, "Dell Laptop", 25000));
		list.add(new filter(2, "HP Laptop", 28000));
		list.add(new filter(3, "Lenovo Laptop", 23000));
		list.add(new filter(4, "Sony Laptop", 32000));
		list.add(new filter(5, "Apple Laptop", 50000));
		
		list.stream().filter(n -> n.price > 25000)
		.forEach(pr -> System.out.println(pr.price));

	}

}
