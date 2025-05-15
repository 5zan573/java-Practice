package Package;

public class QuaterOftheYear {

	public static void main(String[] args) {
		System.out.println(quarterOf(10));

	}
	 public static int quarterOf(int month) {
	      if(month <=3) return 1;
	       if(month <=6) return 2;
	       if(month <=9) return 3;
	       if(month <=12) return 4;
	      
	      return month;
	    }
}
