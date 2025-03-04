package Package;

public class arrayException {

	public static void main(String[] args) {
		
		int[] a=new int[3];
		
		a[0] = 5;
		a[1] = 7;
		a[2] = 6;
		a[3] = 7;
		
		for (int temp : a) {
			System.out.println(temp);
		}
		
//here we have declared 3 arrays in object and values entered are 4, hence we get the exception 		
		
	}

}
