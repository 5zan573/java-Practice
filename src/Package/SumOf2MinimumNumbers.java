package Package;

public class SumOf2MinimumNumbers {

	public static void main(String[] args) {
		
		long min =Long.MAX_VALUE;
		long min2 = Long.MAX_VALUE;
		
		long[] numbers = {50, 70, 79, 1, 2, 5};
		
		for(long num : numbers) {
			
			if(num < min) {
				min2=min;
				min=num;
			}
			else if(num < min2) {
				min2=num;
			}
		}
System.out.println(min+min2);
	}

}
