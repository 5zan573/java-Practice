package ExceptionsHandling;

import java.util.Scanner;

public class HandleExceptions {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		nullpointer();

	}
	public static void divide() {
		System.out.println("Please enter a Number to Divide 100 : ");
		int b = sc.nextInt();
		
		try {System.out.println(100/b);
		}
		catch (Exception e){
			System.out.println("Exceptions is handeled");
			System.out.println(e.getMessage());
		}
	}
	
	public static void nullpointer() {
		String s=null;
		
		try {System.out.println(s.length());}
		
		catch(Exception e) {
			System.out.println("Exception Handeled");
			System.out.println(e.getMessage());
		}
		finally {
			 System.out.println("Further program is executed");
		}
	}
	
	
}
