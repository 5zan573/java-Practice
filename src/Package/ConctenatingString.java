package Package;

public class ConctenatingString {

	public static void main(String[] args) {

		String[] words = { "Java", "is", "a", "powerful", "language" };
		String sentence = "";

		for (String str : words ) {
			sentence += str + " ";
		}
		System.out.println(sentence.trim());
	}

}
