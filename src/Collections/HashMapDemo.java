package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {

	public static void main(String[] args) {

    HashMap map=new HashMap();
    
    map.put(101,"John");
    map.put(102, "Scott");
    map.put(103, "Mary");
    map.put(104, "Scott");
    map.put(105, "David" );
    
    System.out.println(map);//{101=John, 102=Scott, 103=Mary, 104=Scott, 105=David}
    
    System.out.println(map.size());//5
    
    //removing pair by providing key
    map.remove(102);
    System.out.println(map);//{101=John, 103=Mary, 104=Scott, 105=David}

    //access value by key
    System.out.println(map.get(103));//Mary
    
    //getting all Keys/Values/Enteries from HashMap
    System.out.println(map.keySet());//[101, 103, 104, 105]
    System.out.println(map.values());//[John, Mary, Scott, David]
    System.out.println(map.entrySet());//[101=John, 103=Mary, 104=Scott, 105=David]
    
    //Reading data using enhanced for loop
    for(Object x : map.keySet()) {
    	
    	System.out.println(x +"   "+map.get(x));
    }
    //reading data using iterator
    Iterator it = map.entrySet().iterator();
    while (it.hasNext()) {
    	System.out.println(it.next());
    }
	}

}
