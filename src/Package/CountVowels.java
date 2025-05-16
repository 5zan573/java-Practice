package Package;

public class CountVowels {

	public static void main(String[] args) {

		String s = "WatEr";

		int count = 0;

		String lc = s.toLowerCase();

		for (int i = 0; i < lc.length(); i++) {

			char s1 = lc.charAt(i);
			if (s1 == 'a' || s1 == 'e' || s1 == 'i' || s1 == 'o' || s1 == 'u') {

				count++;
			}
		}
		System.out.println(count);
	}
}
