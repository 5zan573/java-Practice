package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList mylist=new ArrayList();
		
		//adding data into array list
		mylist.add(100);
		mylist.add("welcome");
		mylist.add(10.5);
		mylist.add('A');
		mylist.add(null);
		mylist.add(null);
		
		//printing the size of the list
		System.out.println(mylist.size()); //6
		
		//printing the list
		System.out.println(mylist); //[100, welcome, 10.5, A, null, null]
		
		//removing data by providing index
		mylist.remove(5);
		System.out.println(mylist);//[100, welcome, 10.5, A, null]
		
		//inserting data in specific index
		mylist.add(2,"java");
		System.out.println(mylist);//[100, welcome, java, 10.5, A, null]
        
		//modify element in the array list (modify/change/replace) 
		mylist.set(2, "python");
		System.out.println(mylist);//[100, welcome, python, 10.5, A, null]
		
		//reading data with normal for loop of the list and printing
		for(int i=0; i<mylist.size(); i++) {
			
			System.out.println(mylist.get(i));
		}
		//reading data with enhanched for loop of the list and printing
	    for (Object x:mylist) {
	    	
	    	System.out.println(x);
	    }
	    //using iterator to read data and printing it
	    Iterator it=mylist.iterator();
	    
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	    
	    //to remove mutiple elements from array list
	    ArrayList mylist2=new ArrayList();
	    mylist2.add(100);
	    mylist2.add("welcome");
	    
	    mylist.removeAll(mylist2);
	    System.out.println(mylist);//[python, 10.5, A, null]
	    
	    //clearing/removing/deleting whole list
	    mylist.clear();
	    System.out.println(mylist.isEmpty());//true
	    
	    
	}

}
