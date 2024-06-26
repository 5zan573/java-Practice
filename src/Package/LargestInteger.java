package Package;

public class LargestInteger {

	public static void main(String[] args) {
	
		int num1 = 4;
		int num2 = 9;
		int num3 = 11;
		
		int largest = num1;
		if (num2 > largest) {
			largest = num2;
		}
		if (num3 > largest) {
			largest = num3;
		}
	
		System.out.println("The largest Number is :" + largest);
	
	}

}
