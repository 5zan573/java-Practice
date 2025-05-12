package Package;

public class ConvertingIntToString {

	public static void main(String[] args) {
		
		String print=intToString(500);
		
        System.out.println(print);
	}

	public static String intToString(int num) {
		
		String str=Integer.toString(num);
		
		return str;
	}
}
