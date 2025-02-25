package Package;

import java.util.Arrays;

public class ArraysSort {

	public static void main(String[] args) {
		
		int[] a = {45,6,87,43,32,21};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		
		ArraySort2 minmax = new ArraySort2();
		minmax.findMinMax();

	}

}


class ArraySort2 {
    
    int[] arr = {4, 5, 6, 7, 8, 9, 10};
    int min = arr[0];
    int max = arr[0];

    public void findMinMax() {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
