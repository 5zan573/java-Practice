package Package;

public class ConvertingStringWordstoCapital {

	public static void main(String[] args) {
		
		String text= toJadenCase("How can mirrors be real if our eyes aren't real");
		System.out.println(text);
	}
	
	public static String toJadenCase(String phrase) {
		
		if(phrase == null || phrase.length()== 0) {
			return null;
		}
		
	    String req = "";
	    
	    String[] words = phrase.split(" ");
	    StringBuilder sb=new StringBuilder();
	    
	   for(int i=0; i<words.length; i++) {
		   String word = words[i];
		   sb.append(Character.toUpperCase(word.charAt(0)))
		   .append(word.substring(1))
		   .append(" ");
		   
	   }
			return sb.toString().trim();
			
		}

}
