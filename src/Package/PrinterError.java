package Package;

public class PrinterError {

	public static void main(String[] args) {
		
		String str = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
		
		int error = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch < 'a' || ch>'m') {
				error++;
			}
		}
System.out.println(error +"/" +str.length());
		
	}

}
