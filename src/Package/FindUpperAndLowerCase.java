package Package;

public class FindUpperAndLowerCase {

	public static void main(String[] args) {
		
		String str= "Auto TestING";
		int upper = 0;
		int lower = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				upper++;
			}
			else {
				lower++;
			}
		}
System.out.println(upper);
System.out.println(lower);
	}

}
