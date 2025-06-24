package LamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		int[] a= {23,20,16,40,50,60,87,86,48,52};
		
		Predicate<Integer> p1=i -> (i%2==0);
		Predicate<Integer> p2=i -> (i>50);
		
		for(int num : a) {
			//and
			if(p1.and(p2).test(num)) {
				System.out.println("and :"+num);
			}
			//or
			if(p1.or(p2).test(num)) {
			System.out.println("or :"+num);
		}
			if(p1.negate().test(num)) {
				System.out.println("negate :" +num);
			}
			
		}
 
	}

}
