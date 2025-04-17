package Package;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] Args) {

		boolean result = isAnagram("top", "pot");
		System.out.println(result);

		Anagram("rAcecar", "CarraCe");
	}

	public static boolean isAnagram(String a, String b) {

		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() != b.length()) {
			return false;
		}

		int[] count = new int[26];

		for (int i = 0; i < a.length(); i++) {
			count[a.charAt(i) - 'a']++;
			count[b.charAt(i) - 'a']--;

		}
		for (int val : count) {
			if (val != 0) {
				return false;
			}

		}
		return true;
	}

	public static void Anagram(String c, String d) {

		char[] c1 = c.toLowerCase().toCharArray();
		char[] d1 = d.toLowerCase().toCharArray();

		Arrays.sort(c1);
		Arrays.sort(d1);

		if (Arrays.equals(c1, d1)) {
			System.out.println("is Anagram");
		} else {
			System.out.println("not an Anagram");
		}

	}

}