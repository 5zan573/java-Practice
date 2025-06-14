package Package;

public class Constractor {
	
	public Constractor(int a, int b){
		int c = a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Constractor c=new Constractor(5, 8);

	}

}
