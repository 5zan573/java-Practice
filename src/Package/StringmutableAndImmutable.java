package Package;

public class StringmutableAndImmutable {

	public static void main(String[] args) {

		String str = "Automation";
		str.concat("Testing");
		System.out.println(str);

		StringBuffer str1 = new StringBuffer("Automation");
		str1.append(" Testing");
		System.out.println(str1);
	}

}
