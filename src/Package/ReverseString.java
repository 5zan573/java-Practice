
public class ReverseString {

	public static void main(String[] args) {

		String s1 = "Selenium";

		for (int i = s1.length() - 1; i >= 0; i--) {
			char rev = s1.charAt(i);
			System.out.println(rev);
		}

		StringBuffer s2 = new StringBuffer("Selenium1");
		StringBuffer rev2 = s2.reverse();
		System.out.println(rev2);

	}

}
