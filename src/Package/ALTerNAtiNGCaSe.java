package Package;

public class ALTerNAtiNGCaSe {

	public static void main(String[] args) {
		
		String str="hello world";
		String result = "";
		
		for (int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				result+=Character.toLowerCase(ch);
			}
			
			else {
				result+=Character.toUpperCase(ch);
			}
		}
System.out.println(result);
	}

}
