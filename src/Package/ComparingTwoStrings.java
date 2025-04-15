package Package;

public class ComparingTwoStrings {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "HellO";

		boolean comp1 = str1.equals(str2);
		System.out.println(comp1);

		boolean comp2 = str1.equalsIgnoreCase(str2);
		System.out.println(comp2);

	}

}
