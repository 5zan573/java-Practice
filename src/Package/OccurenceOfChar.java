package Package;

public class OccurenceOfChar {

	public static void main(String[] args) {
		
		String a = "Hello World";
		char target = 'l';
		int count = 0;
		
		for (int i=0; i< a.length(); i++) {
			char ch = a.charAt(i);
			
			if (ch == target) {
				
				count++;
			}
			
		}
System.out.println(target+" appears "+count+" times in the String");
	}

}
