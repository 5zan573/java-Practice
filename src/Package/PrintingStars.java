package Package;

public class PrintingStars {

	public static void main(String[] args) {

		PrintingStars p = new PrintingStars();
		p.Stars(5);

	}

	public void Stars(int n) {

		for (int i = 0; i < n; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
