package LamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		//eg1
		Predicate<Integer> p=i ->(i>10);
		System.out.println(p.test(20));//true
		System.out.println(p.test(5));//false
		
		Predicate<String> pr=s ->(s.length()>4);
		System.out.println(pr.test("welcome"));//true
		System.out.println(pr.test("xyz"));//false
	}

}
