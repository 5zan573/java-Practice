package Package;

public class WordsReverse {

	public static void main(String[] args) {
		
		String str = "Java is a Programming Language";
		String[] words = str.split(" ");
		
		for(int i=words.length -1; i>=0; i--) {
			System.out.print(words[i]+" ");
		}

	}

}
