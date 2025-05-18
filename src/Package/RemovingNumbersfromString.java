package Package;

public class RemovingNumbersfromString {

	public static void main(String[] args) {
		
		String str = "abcd1j34h5j2";
		String req = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			
			if(!Character.isDigit(ch)) {
				req += ch;
			}
		}
System.out.println(req);
	}

}
