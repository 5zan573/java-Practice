package Package;

public class ExceptionDetails {

	public static void main(String[] args) {
		
		int a =0;
		
		try {
		a = 10/0;
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(a);

	}

}
