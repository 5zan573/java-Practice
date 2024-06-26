package Package;

public class FactorialNumber {

	public static void main(String[] args) {

      int num = 10;
      int factorial =1;
      
      for (int i=1; i<=num; i++) {
    	  
    	 factorial = factorial* i;
    	  
      }
      
      System.out.println("The Factorial is :" +factorial );
      
      int num1 = 7;
      int factorial1 = 1;
      
      for (int j=num1; j>=1; j--) {
    	  
    	 factorial1 = factorial1* j;
    	  
      }
      
      System.out.println("Reversed Factorial is " + factorial1);
      
	}

}
