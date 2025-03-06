package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet myset=new HashSet();
		
		myset.add(100);
		myset.add("welcome");
		myset.add('A');
		myset.add(10.5);
		myset.add(null);
		myset.add(100);
		myset.add(false);
		
		//printing the size of set
		System.out.println(myset.size());//5
		
		//printing set data
		System.out.println(myset);//[null, A, 100, 10.5, welcome]
		
		//inserting element - Not possible
		//Access specific element - Not possible
		
		//Convert HasSet to ArrayList, to access ArrayList methods
		ArrayList a1=new ArrayList(myset);
		
		System.out.println(a1.get(2));//100
		
		//read all elements using enhanced for loop
		for (Object x : myset) {
			System.out.println(x);
		}
		//reading all elements using iterator
		Iterator it=myset.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		myset.clear();
		System.out.println(myset.isEmpty());
        
	}

}
