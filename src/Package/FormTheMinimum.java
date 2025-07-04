package Package;

import java.util.ArrayList;
import java.util.Collections;

public class FormTheMinimum {

	public static void main(String[] args) {
		
		int[] values = {6, 7, 8, 7, 6, 6};
		
		ArrayList<Integer>list=new ArrayList<Integer>();
	    for(int i=0; i<values.length; i++){
	      if(!list.contains(values[i])){
	        list.add(values[i]);
	      }
	      Collections.sort(list);
	    }
	    
	    StringBuilder sb=new StringBuilder();
	    for(int num : list){
	      
	      sb.append(num);
	    }
System.out.println(sb);
	}

}
