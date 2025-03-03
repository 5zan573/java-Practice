package ExceptionsHandling;

import java.util.Scanner;

public class Exceptions {
	
	static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args) {
	
	Stringbuffer();
	
	}
	public static void divide() {
		System.out.println("Please enter a Number to Divide 100 : ");
		int b = scanner.nextInt();
		System.out.println(100/b);
	}
	
	public static void array() {
		
		int a[]=new int[5];
		System.out.println("Enter position(0-4): ");
		int pos = scanner.nextInt();
		
		System.out.println("Enter Value: ");
		int value=scanner.nextInt();
		a[pos]=value;
		
		System.out.println("Value Stored is: " +a[pos]);
	}

	public static void Stringbuffer() {
	
	String s = "welcome";
	int num=Integer.parseInt(s);
	System.out.println(num);
	
	}
	
	
	
}
