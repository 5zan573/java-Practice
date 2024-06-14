package Package;

public class LargestNumInArray {

	public static void main(String[] args) {
		
		int[] a = {400,2,376,4,56,6,7,8};
		
		int largest = a [0];
		
		for (int i=1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i];
			}
		}
		
System.out.println(largest);
	}

}
