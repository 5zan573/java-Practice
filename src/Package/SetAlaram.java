package Package;

public class SetAlaram {

	public static void main(String[] args) {
		boolean result = Alarm(false,true );
        System.out.println(result);
	}
	public static boolean Alarm(boolean employed, boolean vacation) {
		
		if(employed == true && vacation == false) return true;
		
		return false;
	}

}
