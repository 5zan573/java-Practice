package Package;

public class CountSheep {
/* Given a non-negative integer, 3 for example, return a string with a murmur: 
 * "1 sheep...2 sheep...3 sheep...". 
 *Input will always be valid, i.e. no negative integers. */

	public static void main(String[] args) {
		
		System.out.println(String(0));
		System.out.println(String(1));
		System.out.println(String(2));
		System.out.println(String(3));

	}
	
	public static String String (int num) {
		
		String str = "";
		
		for(int i=1; i<=num; i++) {
			str+= i +" sheep...";
		}
		return str;
	}

}
