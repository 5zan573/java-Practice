package Package;

public class GettheMiddleCharacter {

	public static void main(String[] args) {
		
		System.out.println(Middle());
	}
	
	public static String Middle () {
		String str = "Faizan";
		int middle = str.length() / 2;
		
		if(str.length() %2 == 0) {
		    return str.substring(middle -1, middle +1);
		}
		else {
			return String.valueOf(str.charAt(middle));
		}
	}

}
