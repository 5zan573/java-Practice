package Package;

public class RemoveJunkOrSpecialCharacters {

	public static void main(String[] args) {
		
		String s= "Testing @#$@^#@& Java $(&%))^(_@";
		
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
	}

}
