package Package;

public class PrintingWithoutSemicolon {

	public static void main(String[] args) {

		// 1
		if ((System.out.printf("Hello World" + "\n") == null)) {

		}
		// 2
		if (System.out.append("Hello World" + "\n") == null) {

		}
		// 3
		for (int i = 0; i < 1; System.out.println("Hello World")) {
			i++;
		}
		// 4
		if (System.out.printf("Hello World").equals(null)) {

		}
	}

}
