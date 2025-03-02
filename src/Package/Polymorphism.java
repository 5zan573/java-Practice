package Package;

public class Polymorphism {
	
	public static void main(String[]args) {
		
		Add addition=new Add();
		System.out.println(addition.add(10, 30));
		System.out.println(addition.add(40, 70.5));
		System.out.println(addition.add(50, 70, 80));
	}
}

class Add{
	
	public int add(int a, int b) {
		
		return a+b;
	}

	public double add(int c, double d) {
		
		return (c+d);
	}
	
	public int add(int e, int f, int g) {
		
		return e+f+g;
	}
	
}
	