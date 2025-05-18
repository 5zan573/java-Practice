package Package;

public class abcd2timeseachletter {

	public static void main(String[] args) {
	
		String str="abcd";
		
		StringBuilder sb=new StringBuilder();
		
		for (int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
				sb.append(ch).append(ch);
		}
System.out.println(sb);
	}

}
