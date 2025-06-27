package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class moreStreamsMethods {

	public static void main(String[] args) {
		
		List<String> vehiclelist=Arrays.asList("bus", "car", "bicycle", "car", "car", "bike");
		
		//distinct()
		List<String> distinct=vehiclelist.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct); //[bus, car, bycle, bike]
		
		//count()
		long count = vehiclelist.stream().distinct().count();
	    System.out.println(count); //4
	    
	    //limit
	    vehiclelist.stream().filter(e -> e.startsWith("b")).limit(2)
	    .forEach(e -> System.out.println(e)); //bus bycle
	    
	    
	   Optional <String> min=vehiclelist.stream().min((val1, val2)->
	    	Integer.compare(val1.length(), val2.length())
	    );
	   System.out.println(min.get()); //bus
	   
	   Optional <String> max=vehiclelist.stream().max((str1, str2)->
	   Integer.compare(str1.length(), str2.length()));
	   System.out.println(max.get()); //bicycle
	  

	  
	}

}
