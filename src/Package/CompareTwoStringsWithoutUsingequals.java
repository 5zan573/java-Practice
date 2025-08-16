package Package;

public class CompareTwoStringsWithoutUsingequals {

	public static void main(String[] args) {
		
		String str1 = "Faizan";
		String str2 = "Faizan";
		
		if(str1.length() != str2.length()) {
			System.out.println("false");
			return;
		}
		
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i) != str2.charAt(i)) {
				 System.out.println("false");
				 return;
			}
				
			
		}
		System.out.println("true");
	}

}
