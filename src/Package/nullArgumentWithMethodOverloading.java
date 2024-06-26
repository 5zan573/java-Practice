package Package;

public class nullArgumentWithMethodOverloading {

	public static void main(String[] args) {
		test(null);
	}
	
		public static void test (Object obj) {
			System.out.println("Object Argument");
		}
       public static void test (String str) {
    	   System.out.println("String Argument");
       
	}

}
