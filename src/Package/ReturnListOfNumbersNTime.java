package Package;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnListOfNumbersNTime {

	public static void main(String[] args) {
		
int n = 2;
List<Integer> list=Arrays.asList(1,2,3,1,2,1,2,3,5,8,8,7,7);

Map<Integer, Integer> count=new HashMap<Integer, Integer>();
		List<Integer> result=new ArrayList();
		for(int num:list) {
			
			int currentcount = count.getOrDefault(num, 0);
			count.put(num,  currentcount +1);
			
			if(currentcount < n) {
				result.add(num);
			}
		}
		System.out.println(result);
	}
		
}
