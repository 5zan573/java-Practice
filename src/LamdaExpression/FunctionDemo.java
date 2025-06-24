package LamdaExpression;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

	String emp;
	int sal;
	
	public FunctionDemo(String emp, int sal ){
		
		this.emp=emp;
		this.sal=sal;
	}
	
	public static void main(String[] args) {
		
		ArrayList<FunctionDemo> al=new ArrayList<FunctionDemo>();
		al.add(new FunctionDemo("Jhon", 20000));
		al.add(new FunctionDemo("Scott", 40000));
		al.add(new FunctionDemo("Jhon", 50000));
		
		Function<FunctionDemo, Integer> fn=e ->{
			int salary=e.sal;
			if(salary >=10000 && salary <= 20000) {
				return (salary*10/100);
			}
			else if(salary > 20000 && salary <= 30000) {
				return(salary*20/100);
			}
			else if(salary > 30000 && salary <= 50000) {
				return(salary*30/100);
		}
			else {
				return (salary*40/100);
			} 
			
		};
		
		Predicate<Integer> p=b -> b>5000;
			
			for(FunctionDemo em : al) {
				int bonus=fn.apply(em);
				if(p.test(bonus)) {
				System.out.println(em.emp + " " +em.sal);
				System.out.println("Bonus" +bonus);
				}
			}
			
}
}
