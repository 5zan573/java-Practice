package Package;

public class RemoveFirstandLastCharacter {

	public static void main(String[] args) {

		String str = "Faizan";  
		String result = "";
	      
	      for(int i=1; i<str.length() -1; i++){
	        result+=str.charAt(i);
	        
	        
	      }
	      System.out.println(result);
	}

}
