package Package;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NeedleInHaystack {

	public static void main(String[] args) {
	
		Object[] haystack = {"3", "needle", "123124234", null, "world", "hay", 2,   "3", true, false};
		
		  List<Object> list = Arrays.asList(haystack);
		 
		    System.out.println(list.indexOf("needle"));
		    
		    int index = IntStream.range(0, list.size())
		    		.filter(i -> "needle".equals(list.get(i)))
		    		.findFirst().orElse(-1);
		   System.out.println(index);
	}
}

