package Package;

public class StringPalindrome {

	public static void main(String[] args) {

		String A = "racecar";
		String rev = "";
		
		System.out.println("Actual: " +A);
		
		for (int i = 0; i < A.length(); i++) {
			rev =  A.charAt(i) + rev  ;
		}
		
		System.out.println("Reversed: " + rev);
		
		if (A.equals(rev)) {
			System.out.println("Its a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
	}
}
