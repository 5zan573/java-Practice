package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTheOdd {

	public static void main(String[] args) {
		
		int array[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
		
		List<Integer> list=new ArrayList<Integer>();
		
		 for(int num : array){
		      
			 if(num%2 != 0){
		        list.add(num);
		        }
		    }
		 Collections.sort(list);
		 
int odd = 0;
for(int i=0; i<array.length; i++) {
	if(array[i] %2 != 0) {
		array[i] = list.get(odd++);
	}
}
System.out.println(Arrays.toString(array));
	}

}
