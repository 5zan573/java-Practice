package LamdaExpression;

@FunctionalInterface
interface Cab{
	
	public String bookCab(String source, String destination);
}


public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Cab cab= (source, destination)->{System.out.println("Ola cab is booked...from "+source+" to "+destination);
		return "Price: 5000Rs";
		};

		System.out.println(cab.bookCab("HYD","BLR"));

}
		
}

