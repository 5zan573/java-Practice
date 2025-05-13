package Package;

public class AreYouPlayingBanjo {

	public static void main(String[] args) {

		String result=areYouPlayingBanjo("rartin");
		System.out.println(result);
	}
	
		  public static String areYouPlayingBanjo(String name) {
		    
			  if(name.charAt(0) == 'r' || name.charAt(0)=='R') {
				 return name +" plays banjo";
			  }
			  else 
				  return name +" does not play banjo";
			  
			  
		  }
		}
