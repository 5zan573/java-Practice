package ExceptionsHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptions {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\user\\Downloads\\Test.txt");

		System.out.println("Program is started..");
		
		try {Thread.sleep(5000);}
		catch(Exception e) {
			System.out.println("Exception is handeled");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program is ended..");
	}

}
