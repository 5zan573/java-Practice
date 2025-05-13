package Package;

import java.util.Arrays;

public class Sumwithouthighestandlowestnumber {

	public static void main(String[] args) {
		int result = sum(new int[] {1,2,3,4,5,10});
        System.out.println(result);
	}
	
	  public static int sum(int[] numbers) {
		    
		  int sum = 0;
		  Arrays.sort(numbers);
		  for(int i=1; i<numbers.length -1; i++) {
			  sum+=numbers[i];
		  }
		  
		  return sum;
		   
		  }

}
