package Package;

public class PrimeNumbers {

	public static void main(String[] args) {
		
	int n = 7;
	
	for (int i=2; i<n; i++) {
		
		if(n%i==0) {
			
			System.out.println("Its not prime number");
			
			return;
		}
	}
	System.out.println("Its prime number");

	}

}
