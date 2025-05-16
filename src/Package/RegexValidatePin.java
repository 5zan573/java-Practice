package Package;

public class RegexValidatePin {

	public static void main(String[] args) {
		boolean result = pin("8529");
System.out.println(result);
	}
	
	public static boolean pin(String pin) {
		if(pin.length() == 4 || pin.length() == 6) {
			if(pin.matches("[0-9]*")){
				return true;
			}
		}
		return false;
	}

}
