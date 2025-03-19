package Package;

public class ConctenatingString {

	public static void main(String[] args) {

		String[] words = { "Java", "is", "a", "powerful", "language" };
		String sentence = "";

		for (int i = 0; i < words.length; i++) {
			sentence += words[i] + " ";
		}
		System.out.println(sentence);
	}

}
