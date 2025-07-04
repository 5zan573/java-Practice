package Package;

public class AlternateCapitalization {

	public static void main(String[] args) {
		
		String s = "abcdef";
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<s.length(); i++) {
			if(i%2==0) {
				sb.append(s.toUpperCase().charAt(i));
			}
			else {
				sb.append(s.toLowerCase().charAt(i));
			}
		}
System.out.println(sb);
	}

}
