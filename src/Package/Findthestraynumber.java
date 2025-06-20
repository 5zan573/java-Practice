package Package;

public class Findthestraynumber {

	public static void main(String[] args) {
		
		int[] numbers = {1,1,1,1,1,6};
		int result = 0;
		for(int num : numbers) {
			result^=num;
		}
System.out.println(result);
	}

}
