package Package;

import java.util.ArrayList;

public class PrintNegativeNumberOneSideAndPositiveOneSide {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,-1,-2,-5};
		
		ArrayList pos=new ArrayList();
		ArrayList neg=new ArrayList();
		
		for (int i=0; i<a.length; i++) {
			if(a[i]<0) {
				neg.add(a[i]);
			}
			else if (a[i]>0){
				pos.add(a[i]);
			}
			
		}
		neg.add(pos);
		System.out.print(neg);
		
		
		
	}

}
