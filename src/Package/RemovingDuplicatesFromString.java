package Package;

public class RemovingDuplicatesFromString {

	public static void main(String[] args) {

		String str1 = new String("Automation");
		int count = 0;

		char[] ch = str1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("Duplicates are :" + ch[j]);

					count++;
				}
			}
		}
		System.out.println(count);
	}

}
