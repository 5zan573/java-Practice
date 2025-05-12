package Package;

public class StringRepeat {

	public static void main(String[] args) {
		/*Write a function that accepts a non-negative integer n and a string s as parameters, 
		and returns a string of s repeated exactly n times.*/
		
		System.out.println(repeat(5, "a"));
	}

	public static String repeat(int repeat, String string) {
		
		String str = "";
		
			for(int i=0; i<repeat; i++) {
				str+=string;
				
			
			
		}
		return str;
		
	}
}
