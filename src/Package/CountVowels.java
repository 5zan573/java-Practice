package Package;

public class CountVowels {

	public static void main(String[] args) {
		
		String a = "Sea Carpentar";
		int vowels = 0;

		for (int i=0; i<a.length(); i++) {
			
			char b = a.charAt(i);
			
			if (b=='a'||b=='e'||b=='i'||b=='o'||b=='u'||
				b=='A'||b=='E'||b=='I'||b=='O'||b=='U') {
				
				vowels++;
			}
				
			
		}
		System.out.println(vowels);

	}

}
