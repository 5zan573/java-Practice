package Package;

public class Parseniceintfromcharproblem {

	public static void main(String[] args) {
		
		String str="5 years old";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(Character.isDigit(ch)) {
				int age = Character.getNumericValue(ch);
				System.out.println(age);
			}
		}
		
	}

}
