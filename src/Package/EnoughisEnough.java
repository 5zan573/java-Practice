package Package;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughisEnough {

	public static void main(String[] args) {
		
		int[] a = {1,2,3,2,3,3,3};
		int n = 2;
		
		Map<Integer, Integer>map=new HashMap<Integer, Integer>();
		List<Integer>list=new ArrayList<Integer>();
		
		for(int num : a) {
			int count = map.getOrDefault(num, 0);
			map.put(num, count +1);
			
			if(count < n) {
				list.add(num);
			}
		}
System.out.println(list);
	}

}
