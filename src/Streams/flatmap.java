package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {
	
	String name;
	int id;
	String grade;
	
	flatmap(String name, int id, String grade){
		
		this.name=name;
		this.id=id;
		this.grade=grade;
		
	}

	public static void main(String[] args) {
		
		List<flatmap> studentlist1=new ArrayList();
		studentlist1.add(new flatmap("scott", 100, "B"));
		studentlist1.add(new flatmap("john", 101, "A"));
		studentlist1.add(new flatmap("snow", 102, "C"));
		
		List<flatmap> studentlist2=new ArrayList();
		studentlist1.add(new flatmap("arrow", 103, "B"));
		studentlist1.add(new flatmap("mary", 104, "A"));
		studentlist1.add(new flatmap("cooper", 105, "C"));
		
		List<List<flatmap>> studentlist=Arrays.asList(studentlist1,studentlist2);
		
		List<String> names=studentlist.stream().flatMap(e -> e.stream()).map(s -> s.name).collect(Collectors.toList());
		System.out.println(names);
	}

}
