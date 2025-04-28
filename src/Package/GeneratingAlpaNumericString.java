package Package;

import java.util.Random;
import java.util.UUID;

public class GeneratingAlpaNumericString {

	public static void main(String[] args) {
		UsingUUID();
		RandonString();
	}

	public static void UsingUUID() {
		String AlphaNumeric = UUID.randomUUID().toString();
		System.out.println(AlphaNumeric); // 2988633b-b0f4-4ad2-ac1a-a95f2283cc8e

		AlphaNumeric = AlphaNumeric.replace("-", "");
		System.out.println(AlphaNumeric); // 59f7013213e44cd5936d46f23a3a9e8e

		AlphaNumeric = AlphaNumeric.substring(0, 6);
		System.out.println(AlphaNumeric); // 279026
	}

	public static void RandonString() {

		int reqlenght = 6;
		String AlphaNumeric = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String reqStr = "";

		Random random = new Random();

		for (int i = 0; i < reqlenght; i++) {
			int index = random.nextInt(AlphaNumeric.length());
			reqStr = reqStr + AlphaNumeric.charAt(index);
		}
		System.out.println(reqStr);

	}

}