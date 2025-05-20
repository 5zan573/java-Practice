package Package;

public class SecondMaxInArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 30, 35, 30, 31, 29, 32 };

		int max = 0;
		int secmax = 0;

		for (int num : arr) {
			if (num > max) {
				secmax = max;
				max = num;
			}

			else if (num > secmax && num != max) {
				secmax = num;
			}
		}
		System.out.println(secmax);
	}

}
