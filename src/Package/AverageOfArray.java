package Package;

public class AverageOfArray {

	public static void main(String[] args) {

		int[] a= {100, 75, 50, 25, 0};
		int sum = 0;

		for(int num : a) {
			sum += num;
			
		}
		System.out.println(sum/a.length);
	}

}
