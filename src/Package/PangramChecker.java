package Package;

public class PangramChecker {

	public static void main(String[] args) {
		
		String str = "The uick brown fox jumps  the lazy og";
		str=str.toLowerCase();
		for(char i='a'; i<='z'; i++) {
			if(str.indexOf(i) == -1) {
	System.out.println(false);
			}
			
		}	
		System.out.println(true);
		
	}

}
