package Package;

import java.util.ArrayList;
import java.util.Collections;

public class FlattenandSortanArray {

	public static void main(String[] args) {
		
		int[][] array = {{3,2,1},{6,7,8,4}};
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int[] flatten : array) {
			for(int num : flatten) {
				list.add(num);
			}
			
		}
		Collections.sort(list);
		
		System.out.println(list);
	}

}
