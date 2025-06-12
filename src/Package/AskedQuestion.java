package Package;

public class AskedQuestion {

	public static void main(String[] args) {
		checking(1);

	}

	public static void checking(int level) {
		
		if(level <=1) {
			System.out.println("Basic");
		}
		else if(level <=2) {
			System.out.println("Inter");
		}
		else if(level <=3) {
			System.out.println("Advance");
		}
		else if(level <=4) {
			System.out.println("Expert");
		}
	}
}
