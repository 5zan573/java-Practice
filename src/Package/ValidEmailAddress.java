package Package;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidEmailAddress {

	public static void main(String[] args) {
		String email = "faizanhussain573@gmail.com";
		isValidmail(email);

		if (isValidmail(email)) {
			System.out.println("It is a valid email address");
		} else {
			System.out.println("Its an invalid email address");
		}
	}

	public static final String email_regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	public static boolean isValidmail(String email) {
		Pattern pattern = Pattern.compile(email_regex);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();

	}

}
