package Package;

public class SmallestInteger {

	public static void main(String[] args) {
		
		int[] a= {4,34,67,89,90};
		
		int smallest = a [0];
		
		for (int i=0; i<a.length; i++) {
			
			if (a[i] < smallest) {
				
				smallest=a[i];
			}
			
		}
		System.out.println(smallest);
		
		

	}

}
