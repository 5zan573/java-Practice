package Package;

public class TransportationOnVacation {

	public static void main(String[] args) {
		System.out.println(cost(7));
	}
	
	public static int cost (int d) {
		if(d <3) {
			return d*40;
		}
		else if(d>=7) {
			return d*40-50;
		}
		else {
			return d*40-20;
		}
	}

}
