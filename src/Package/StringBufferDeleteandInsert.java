package Package;

public class StringBufferDeleteandInsert {

	public static void main(String[] args) {
	
		//StringBuffer Delete
		StringBuffer a = new StringBuffer("Faizan Hussain");
		
		System.out.println(a.delete(6, 14));

		
		// StringBuffer charAT Delete
		StringBuffer b = new StringBuffer("Faizan Hussain");
		
		System.out.println(b.deleteCharAt(7));
		
		
		//StringBuffer Insert Text
		StringBuffer a1 = new StringBuffer("Mohd Hussain");
		
		a1.insert(5, "Faizan ");
		
		System.out.println(a1);
		
		
		
	}

}
