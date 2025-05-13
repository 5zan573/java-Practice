package Package;

public class SumOfPositiveArray {

	public static void main(String[] args) {
		int result=Sum(new int[]{1,2,3,4,-5});
		System.out.println(result);
	}

	public static int Sum(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > 0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
}
