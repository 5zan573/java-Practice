package Package;

public class StringPalindrome {

	public static void main(String[] args) {
		
		String str = "racecar";
		String rev = "";
		
		for (int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
			
		}
        if (str.equals(rev)) {
        	System.out.println("Its a Palindrome :"+rev);
        }
        else {
        	System.out.println("Its not a Palindrome :"+rev);
        }
	}

}
