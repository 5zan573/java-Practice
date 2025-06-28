package Package;

public class Order {

	public static void main(String[] args) {
		
		String str = "4of Fo1r pe6ople g3ood th5e the2";
		String[] str1 = str.split(" ");
		String req = "";
		
		for(int i=0; i<str1.length; i++) {
			for(int j=i+1; j<str1.length; j++) {
				
				int num1 = extractNumber(str1[i]);
				int num2 = extractNumber(str1[j]);
				
				if(num1 > num2) {
					
				req=str1[i];
				str1[i]=str1[j];
				str1[j]=req;
				
			}
	}
}
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<str1.length; i++) {
			sb.append(str1[i]);
			if(i != str1.length -1) {
				sb.append(" ");
			}
			
		}
		System.out.println(sb.toString());
}
	
	public static int extractNumber(String word) {
		
		for(int i=0; i<word.length(); i++) {
			char ch=word.charAt(i);
			
			if(Character.isDigit(ch)) {
				return Character.getNumericValue(ch);
			}
		}
		return 0;
	}
	

}
