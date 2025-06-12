package Package;

public class OccurenceOfCharacter2 {

	public static void main(String[] args) {
		
		String str = "Apple";
		char ch = 'p';
		
		int counter = 0;
		
		for (int i=0; i<str.length(); i++) {
			
			if(str.charAt(i) == ch) {
				counter++;
			}
		}
System.out.println(counter);
	}

}
