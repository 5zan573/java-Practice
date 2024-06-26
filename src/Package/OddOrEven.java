package Package;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number :");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num + " Is Even");
		}
		else {
			System.out.println(num + " Is Odd");
			
		}

	}

}
