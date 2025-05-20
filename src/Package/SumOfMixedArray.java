package Package;

import java.util.Arrays;
import java.util.List;

public class SumOfMixedArray {

	public static void main(String[] args) {
		int result = Sum(Arrays.asList(1,"2", 3, "4", "5"));
		System.out.println(result);
	
	}
	
	public static int Sum(List mixed) {
	int sum = 0;
	
	for(Object num : mixed) {
		sum+=Integer.parseInt(num.toString());
	}
	
  return sum;
}

}